package ExelOperate;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ExcelCreate {
    public  void  creatExecl()
    {
        //创建新工作簿
        HSSFWorkbook workbook = new HSSFWorkbook();
        //新建工作表
        HSSFSheet sheet = workbook.createSheet("StudentInfo");
        //创建行,行号作为参数传递给createRow()方法,第一行从0开始计算
        HSSFRow row = sheet.createRow(0);
        //创建单元格,row已经确定了行号,列号作为参数传递给createCell(),第一列从0开始计算
        HSSFCell cell = row.createCell(0);
        //设置单元格的值,即C1的值(第一行,第三列)
        cell.setCellValue("ID（学生编号）");
        //输出到磁盘中
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(new File("D:\\Students1.xls"));
            workbook.write(fos);
            workbook.close();
            fos.close();
        } catch (Exception e) {
            System.out.println("有错误！！！");
            e.printStackTrace();
        }
        System.out.println("操作成功，请检查数据！！！！！");
    }
}
