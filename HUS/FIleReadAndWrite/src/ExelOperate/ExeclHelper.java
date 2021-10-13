package ExelOperate;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

public class ExeclHelper {
    String pathname="D：testexle.xls";
    public File file=new File(pathname);
    public void  testExcelOperate()
    {
            try {
                InputStream  inputStream=new FileInputStream(file);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
    }
    ///[1] 创建工作簿
    XSSFWorkbook xssfWorkbook=new XSSFWorkbook();
    ///【2】 创建sheet
    Sheet sheet=xssfWorkbook.createSheet("学生主表");
    ///[3] 创建行
    Row row=sheet.createRow(4);
    ///[4] 创建列
    Cell cell=row.createCell(4);


}
