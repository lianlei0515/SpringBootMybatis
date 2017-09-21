package com.example.demo.testMain;

import com.lowagie.text.*;
import com.lowagie.text.Font;
import com.lowagie.text.rtf.RtfWriter2;
import org.junit.Test;

import java.awt.*;
import java.io.FileOutputStream;
import java.util.*;
import java.util.List;

/**
 * Created by Tony on 2017/9/19.
 * com.example.demo.testMain.SpringBootMybatis
 */
public class DocCreate {

    @Test
    public void create(){

        //创建纸张大小
        Document document = new Document(PageSize.A4);
        //抛出异常
        try {
            RtfWriter2.getInstance(document, new FileOutputStream("D:/aaa.doc"));
            //打开文件
            document.open();

            //设置字体
            Font font = new Font(Font.NORMAL , 20 , Font.BOLDITALIC , Color.black);
            //设置标头
            Date date = new Date();
            Paragraph paragraph = new Paragraph("合伙人认缴信息"+ "\t:" + date.getMonth() + "-" + date.getDay(),font);
            paragraph.setSpacingBefore(5);
            paragraph.setSpacingAfter(10);
            paragraph.setAlignment(Element.ALIGN_LEFT);
            //设置正文字体
            Font font1 = new Font(Font.NORMAL, 14, Font.BOLDITALIC, Color.black);
            Paragraph context = new Paragraph("变更原因：",font1);

            context.setFirstLineIndent(20);
            List<Map> mapList = new ArrayList<>();
            Map map = new HashMap<>();
            map.put("aaa","fsdfas");
            map.put("fsdf","sdfsadfsa");
            map.put("sd","sdfsadfsa");
            map.put("sds","sdfsadfsa");
            map.put("sdfa","sdfsadfsa");
            map.put("dsfe","sdfsadfsa");
            map.put("csa","sdfsadfsa");
            mapList.add(map);
            String[] title = {"合伙人类型","合伙人名称","级别","出资分期","缴纳年限","认缴金额(万元)","实缴金额(万元)","当前权益","持有状态"};

            //创建表格
            Table table = new Table(title.length);
            table.setWidth(98);

            for (String string : title){
                Cell cell = new Cell(string);
                table.addCell(cell);
            }
            /*for (Map string : mapList){
                Collection<String> values = string.values();
                for (String s:values) {
                    Cell cell = new Cell(s);
                    table.addCell(cell);
                }
            }*/
            table.setAlignment(Element.ALIGN_CENTER);//居中
            table.setAlignment(Element.ALIGN_MIDDLE);//垂直居中
            table.setAutoFillEmptyCells(true);//自动填满
            table.setBorderWidth(1);//边框宽度
            context.setSpacingBefore(3);
            document.add(paragraph);
            document.add(context);
            document.add(table);
            document.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

}
