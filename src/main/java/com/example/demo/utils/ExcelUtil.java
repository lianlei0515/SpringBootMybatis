package com.example.demo.utils;

import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.xssf.streaming.SXSSFRow;
import org.apache.poi.xssf.streaming.SXSSFSheet;
import org.apache.poi.xssf.streaming.SXSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Tony on 2017/9/11.
 * com.example.demo.utils.SpringBootMybatis
 * 描述：读取excel文件信息，返回LIst<Map>格式
 */
public class ExcelUtil {

    public static List<Map> excelReadUtil(String filePath) {
        List<Map> mapList = new ArrayList<>();
        try {
            XSSFWorkbook xssfWorkbook = new XSSFWorkbook(new FileInputStream(filePath));
            XSSFSheet sheet = xssfWorkbook.getSheetAt(0);
            XSSFRow row = sheet.getRow(0);
            for (int i = sheet.getFirstRowNum() +1 ; i <= sheet.getLastRowNum() ; i ++) {
                Object values = "";
                Object keys = "";
                Map map = new LinkedHashMap<>();
                XSSFRow row1 = sheet.getRow(i);
                for (int j = row1.getFirstCellNum() ; j <= row1.getLastCellNum() ; j ++){
                    if (row1.getCell(j) == null || "".equals(row1.getCell(j))){
                        break;
                    }else {
                        keys = row.getCell(j);
                        if (row1.getCell(j).getCellType()==XSSFCell.CELL_TYPE_NUMERIC && HSSFDateUtil.isCellDateFormatted(row1.getCell(j))){//判断时间
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("YYYY-MM-dd");
                            values = simpleDateFormat.format(HSSFDateUtil.getJavaDate(row1.getCell(j).getNumericCellValue()));
                        }else {
                            values = row1.getCell(j);
                        }
                        map.put(keys,values);
                    }
                }
                mapList.add(map);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return mapList;
    }

    public static void ExcelWriteUtil(String title  , HttpServletResponse response){
        try {
            ByteArrayOutputStream os = new ByteArrayOutputStream();
            exportExcelX(title,excelReadUtil("C:\\Users\\Tony\\Desktop\\基金基本信息表(1).xlsx"));
            byte[] content = os.toByteArray();
            InputStream is = new ByteArrayInputStream(content);
            // 设置response参数，可以打开下载页面
            response.reset();

            response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;charset=utf-8");
            response.setHeader("Content-Disposition", "attachment;filename="+ new String((title + ".xlsx").getBytes(), "iso-8859-1"));
            response.setContentLength(content.length);
            ServletOutputStream outputStream = response.getOutputStream();
            BufferedInputStream bis = new BufferedInputStream(is);
            BufferedOutputStream bos = new BufferedOutputStream(outputStream);
            byte[] buff = new byte[8192];
            int bytesRead;
            while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
                bos.write(buff, 0, bytesRead);

            }
            bis.close();
            bos.close();
            outputStream.flush();
            outputStream.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void exportExcelX(String title , List<Map> head){
        SXSSFWorkbook workbook = new SXSSFWorkbook(10000);
        SXSSFSheet sheet = workbook.createSheet();
        for (int i = 0 ; i <= head.size()-1 ; i++) {
            SXSSFRow row = sheet.createRow(i);
            for (int j = 0; j <= head.size()-1 ; j ++) {
                System.out.println(head.get(j).toString());
                row.createCell(j).setCellValue(head.get(j).toString());
            }
        }
    }
}
