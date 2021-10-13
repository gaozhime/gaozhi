package ExcelImplmtnt;

import java.io.File;
import java.io.FileOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
public class ExcelWrite {
    public  String path=null;
    public ExcelWrite( String  path) {
        this.path=path;
        creatExecl();
    }

    public void creatExecl() {
        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("StudentInfo");
        HSSFRow row = sheet.createRow(0);
        HSSFCell cell0 = row.createCell(0);
        HSSFCell cell1 = row.createCell(1);
        HSSFCell cell2 = row.createCell(2);
        cell0.setCellValue("ID（学生编号）");
        cell1.setCellValue("Name(姓名)");
        cell2.setCellValue("Sex(性别)");
        for (int i=1;i<6; i++)
        {
            HSSFRow row1 = sheet.createRow(i);
            for(int j=0;j<3;j++)
            {
                HSSFCell celln=row1.createCell(j);
                String text =String.format("第%d行第%d列的数据",i,j+1);
                celln.setCellValue(text);
            }
        }
        HSSFSheet sheet1 = workbook.createSheet("StudentInfoStep");
        HSSFRow row1 = sheet1.createRow(0);
        HSSFCell cell10 = row1.createCell(0);
        HSSFCell cell11 = row1.createCell(1);
        HSSFCell cell12 = row1.createCell(2);
        cell10.setCellValue("ID（学生编号）");
        cell11.setCellValue("Step(系别)");
        cell12.setCellValue("Class(班级)");
        for (int i=1;i<4; i++)
        {
            HSSFRow row2 = sheet1.createRow(i);
            for(int j=0;j<3;j++)
            {
                HSSFCell celln=row2.createCell(j);
                String text =String.format("第%d行第%d列的数据",i,j+1);
                celln.setCellValue(text);
            }
        }
        FileOutputStream fos = null;
        try {
            File file =new File(path);
            if(! file.exists())
            {///若不存在文件，则新建文件
                file.createNewFile();
                System.out.println("创建文件成功！！");
            }
            System.out.println("文件存在！！");
            fos = new FileOutputStream(new File(path));
            System.out.println("开始写入文件");
            workbook.write(fos);
            System.out.println("写入文件成功");
            workbook.close();
            fos.close();
        } catch (Exception var7) {
            System.out.println("有错误！！！");
            var7.printStackTrace();
        }

        System.out.println("操作成功，请检查数据！！！！！");
    }
}



