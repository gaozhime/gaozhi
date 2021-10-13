package ComposeFileOperate;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class ExcelOperate {
    public  File f;String type;
   public String  responsexcltents="";   //excel文件的内容
    public ExcelOperate()
    {  }
    public String XlsOper(File f,String type)
    {
        {
            this.f=f;
            this.type=type;}
        if(type.equalsIgnoreCase("R")) {//读取文件
            try {
                //[1] 创建工作簿
                InputStream inputStream = new FileInputStream(f);
                HSSFWorkbook book=new HSSFWorkbook(inputStream);
                //[2] 根据文件的工作表个数分别创建sheet;及下属结构;
                for(int i=0;i<book.getNumberOfSheets();i++)
                {
                    List<String> rowinfo=null;
                    //【2-1】(1) 创建工作表
                    HSSFSheet sheet = book.getSheetAt(i);
                   // sheet.getLastRowNum();
                    //【2-1】(2)创建工作行
                    for(int rows=0;rows <sheet.getLastRowNum();rows++ )
                    { //【2-1】(2)创建工作行
                        HSSFRow row=sheet.getRow(rows);
                        rowinfo=new ArrayList<>();
                        //【2-1】(3)创建工作列
                        for(int cloum=0;cloum< row.getLastCellNum();cloum++)
                        {//【2-1】(3)创建工作列
                            HSSFCell cell=row.getCell(cloum);
                            rowinfo.add(cell.getStringCellValue());
                            responsexcltents+="&"+cell.getStringCellValue().trim();
                        }
                        responsexcltents=responsexcltents.substring(1,responsexcltents.length()-1);
                    }
                }
            } catch (Exception E) {

            }
        }
           else  if(type.equalsIgnoreCase("W"))
        {//写入文件
            responsexcltents="成功!!!!";
        }
        else {System.out.println("文件操作类型不正确，请检查");}
        return  responsexcltents;
    }
}
