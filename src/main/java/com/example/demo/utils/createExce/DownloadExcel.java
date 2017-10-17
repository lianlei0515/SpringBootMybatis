package com.example.demo.utils.createExce;

import org.apache.poi.hssf.usermodel.*;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.util.CellRangeAddress;
import org.testng.annotations.Test;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.Format;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Tony on 2017/9/29.
 * com.example.demo.utils.SpringBootMybatis
 * 描述：生成Excel文件【导出】
 */
public class DownloadExcel {

    @Test
    public void DownloadExcels(HttpServletResponse response) {
        String[] titleRowS = {"姓名","年龄","性别"};
        Object[] dataObject = new Object[titleRowS.length];
        dataObject[0] = "张三";
        dataObject[1] = "18";
        dataObject[2] = "男";
        List<Object[]> dataList = new ArrayList<>();
        dataList.add(dataObject);
        try {
            DownloadExcel.export(response,"文件名","测试导出",titleRowS,dataList);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * 作者:   Tony
     * 时间:   2017/9/29 15:49
     * 方法名: export
     * 参数:   [resp, title, titleRowName, dataList]
     * 返回值: void
     * 描述  : title :文件的表题，也是文件名
     */
    public static void export(HttpServletResponse resp , String fileName, String title , String[] titleRowName , List<Object[]> dataList) throws Exception {
        HttpServletResponse response;
        try {
            HSSFWorkbook workbook = new HSSFWorkbook();
            // 创建工作簿对象
            if (dataList.size()<=0){
                throw new Exception("抱歉,没有导出数据!");
            }
            if (title == null) {
                throw new Exception("抱歉,导出失败!");
            } else {
                HSSFSheet sheet = workbook.createSheet(fileName); // 创建工作表
                // 产生表格标题行
                HSSFRow rowm = sheet.createRow(0);
                HSSFCell cellTiltle = rowm.createCell(0);
                // sheet样式定义【getColumnTopStyle()/getStyle()均为自定义方法 - 在下面 - 可扩展】
                HSSFCellStyle columnTopStyle = getColumnTopStyle(workbook);// 获取列头样式对象
                HSSFCellStyle style = getStyle(workbook); // 单元格样式对象
                style.setWrapText(true);
                sheet.addMergedRegion(new CellRangeAddress(0, 1, 0, (titleRowName.length - 1)));
                cellTiltle.setCellStyle(columnTopStyle);
                cellTiltle.setCellValue(title);
                // 定义所需列数
                int columnNum = titleRowName.length;
                HSSFRow rowRowName = sheet.createRow(2); // 在索引2的位置创建行(最顶端的行开始的第二行)
                // 将列头设置到sheet的单元格中
                for (int n = 0; n < columnNum; n++) {
                    HSSFRichTextString text = new HSSFRichTextString(titleRowName[n]);
                    sheet.setColumnWidth(n, 8000);
                    HSSFCell cellRowName = rowRowName.createCell(n); // 创建列头对应个数的单元格
                    cellRowName.setCellType(HSSFCell.CELL_TYPE_STRING); // 设置列头单元格的数据类型
                    cellRowName.setCellValue(text); // 设置列头单元格的值
                    cellRowName.setCellStyle(columnTopStyle); // 设置列头单元格样式

                }

                // 将查询出的数据设置到sheet对应的单元格中
                for (int i = 0; i < dataList.size(); i++) {
                    Object[] obj = dataList.get(i);// 遍历每个对象
                    HSSFRow row = sheet.createRow(i + 3);// 创建所需的行数
                    for (int j = 0; j < obj.length; j++) {
                        HSSFCell cell = null; // 设置单元格的数据类型
                        if (j == 0) {
                            cell = row.createCell(j, HSSFCell.CELL_TYPE_NUMERIC);
                            cell.setCellValue(i + 1);
                            cell.setCellStyle(style); // 设置单元格样式
                        } else {
                            cell = row.createCell(j, HSSFCell.CELL_TYPE_STRING);
                            cell.setCellStyle(style); // 设置单元格样式
                            if (!"".equals(obj[j]) && obj[j] != null) {
                                HSSFRichTextString text = new HSSFRichTextString(titleRowName[j]);
                                cell.setCellValue(obj[j].toString());

                            } else {
                                cell.setCellValue("");
                            }
                        }

                    }
                }
                // 让列宽随着导出的列长自动适应
                for (int colNum = 0; colNum < columnNum; colNum++) {
                    int columnWidth = sheet.getColumnWidth(colNum) / 256;
                    for (int rowNum = 0; rowNum < sheet.getLastRowNum(); rowNum++) {
                        HSSFRow currentRow;
                        // 当前行未被使用过
                        if (sheet.getRow(rowNum) == null) {
                            currentRow = sheet.createRow(rowNum);
                        } else {
                            currentRow = sheet.getRow(rowNum);
                        }
                        if (currentRow.getCell(colNum) != null) {
                            HSSFCell currentCell = currentRow.getCell(colNum);
                            if (currentCell.getCellType() == HSSFCell.CELL_TYPE_STRING) {

                                int length = currentCell.getStringCellValue().getBytes().length;
                                if (columnWidth < length) {
                                    columnWidth = length;
                                }
                            }
                        }
                    }
                    if (colNum == 0) {
                        sheet.setColumnWidth(colNum, (columnWidth - 2) * 256);
                    } else {
                        if (colNum > 254) {
                            sheet.setColumnWidth(colNum, (columnWidth + 4) * 256);
                        }
                    }
                }
                if (workbook != null) {
                    try {
                        String ntr = new String(fileName.getBytes("GBK"), "ISO8859_1");
                        String fileNames = ntr + ".xls";
                        String headStr = "attachment; filename=" + fileNames;
                        response = resp;
                        response.setContentType("APPLICATION/OCTET-STREAM");
                        response.setHeader("Content-Disposition", headStr);
                        OutputStream out = response.getOutputStream();
                        workbook.write(out);
                        out.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    /**
     * 加千分位保留4位小数
     *
     * @param s
     * @return
     * @throws Exception
     */
    public static String getNumKb1(String s, int n, String type) throws Exception {
        if("0".equals(s) || "0.0000".equals(s)){
            return 0+"";
        }
        Format numberFormat1=new DecimalFormat("#,###.0000");
        double num = Double.parseDouble(s);
        if (!Double.isNaN(num)) {
            BigDecimal b = new BigDecimal(num);
            double f1 = "2".equals(type) ? b.setScale(n, BigDecimal.ROUND_HALF_UP).doubleValue() * 100
                    : b.setScale(n, BigDecimal.ROUND_HALF_UP).doubleValue();
            return numberFormat1.format(f1);
        } else {
            return "";
        }
    }
    /**
     * 加千分位
     *
     * @param s
     * @return
     * @throws Exception
     */
    public static String getNumKb(String s, int n, String type) throws Exception {
        NumberFormat numberFormat1 = NumberFormat.getNumberInstance();

        double num = Double.parseDouble(s);
        if (!Double.isNaN(num)) {
            BigDecimal b = new BigDecimal(num);
            double f1 = "2".equals(type) ? b.setScale(n, BigDecimal.ROUND_HALF_UP).doubleValue() * 100
                    : b.setScale(n, BigDecimal.ROUND_HALF_UP).doubleValue();
            return numberFormat1.format(f1);
        } else {
            return "";
        }
    }









    /*
	 * 列头单元格样式
	 */
    public static HSSFCellStyle getColumnTopStyle(HSSFWorkbook workbook) {

        // 设置字体
        HSSFFont font = workbook.createFont();
        // 设置字体大小
        font.setFontHeightInPoints((short) 16);
        // 字体加粗
        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
        // 设置字体名字
        font.setFontName("Courier New");
        // 设置样式;
        HSSFCellStyle style = workbook.createCellStyle();
        // 设置底边框;
        style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
        // 设置底边框颜色;
        style.setBottomBorderColor(HSSFColor.BLACK.index);
        // 设置左边框;
        style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
        // 设置左边框颜色;
        style.setLeftBorderColor(HSSFColor.BLACK.index);
        // 设置右边框;
        style.setBorderRight(HSSFCellStyle.BORDER_THIN);
        // 设置右边框颜色;
        style.setRightBorderColor(HSSFColor.BLACK.index);
        // 设置顶边框;
        style.setBorderTop(HSSFCellStyle.BORDER_THIN);
        // 设置顶边框颜色;
        style.setTopBorderColor(HSSFColor.BLACK.index);
        // 在样式用应用设置的字体;
        style.setFont(font);
        // 设置自动换行;
        style.setWrapText(false);
        // 设置水平对齐的样式为居中对齐;
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        // 设置垂直对齐的样式为居中对齐;
        style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);

        return style;

    }
    /*
         * 列数据信息单元格样式
         */
    public static HSSFCellStyle getStyle(HSSFWorkbook workbook) {
        // 设置字体
        HSSFFont font = workbook.createFont();
        // 设置字体大小
        font.setFontHeightInPoints((short) 10);
        // 字体加粗
        font.setBoldweight(HSSFFont.BOLDWEIGHT_BOLD);
        // 设置字体名字
        font.setFontName("Courier New");
        // 设置样式;
        HSSFCellStyle style = workbook.createCellStyle();
        // 设置底边框;
        style.setBorderBottom(HSSFCellStyle.BORDER_THIN);
        // 设置底边框颜色;
        style.setBottomBorderColor(HSSFColor.BLACK.index);
        // 设置左边框;
        style.setBorderLeft(HSSFCellStyle.BORDER_THIN);
        // 设置左边框颜色;
        style.setLeftBorderColor(HSSFColor.BLACK.index);
        // 设置右边框;
        style.setBorderRight(HSSFCellStyle.BORDER_THIN);
        // 设置右边框颜色;
        style.setRightBorderColor(HSSFColor.BLACK.index);
        // 设置顶边框;
        style.setBorderTop(HSSFCellStyle.BORDER_THIN);
        // 设置顶边框颜色;
        style.setTopBorderColor(HSSFColor.BLACK.index);
        // 在样式用应用设置的字体;
        style.setFont(font);
        // 设置自动换行;
        style.setWrapText(false);
        // 设置水平对齐的样式为居中对齐;
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER);
        // 设置垂直对齐的样式为居中对齐;
        style.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
        return style;
    }
}
