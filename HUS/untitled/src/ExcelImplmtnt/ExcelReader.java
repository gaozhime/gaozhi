package ExcelImplmtnt;

import org.apache.poi.hssf.converter.ExcelToHtmlUtils;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

public class ExcelReader
{
    public String path = null;
    public ExcelReader(String s) {
        this.path = s;
        readExcel();
    }

    public void readExcel()
    {

        List<List<String>> list = new ArrayList<List<String>>();
        try
        {
            ///[1]创建文件输入流
            InputStream ipts = new FileInputStream(path);
            ///[2] 创建工作簿
            HSSFWorkbook workbook = new HSSFWorkbook(ipts);
            ///[3]创建工作表
            //for (int i = 0; i < workbook.getNumberOfSheets(); i++)
            for (int i = 0; i < 1; i++)
            {
                HSSFSheet sheet = workbook.getSheetAt(i);
                ///[4]创建工作行
                int rows = sheet.getLastRowNum();
               // System.out.println(rows + "," + numsinfo);
                for (int j = 0; j < rows; j++)
                {
                    HSSFRow row = sheet.getRow(j);
                    String numsinfo = String.format("工作簿%s的总行数为%d,当前行数%d", sheet.getSheetName(), rows,j);
                    //System.out.println(numsinfo);    //输出当前行号数
                    int mincells = row.getFirstCellNum();
                    int maxcells = row.getLastCellNum();
                    String rowstring = "";   //行信息汇总
                    List<String> rowlis = new ArrayList<String>();
                    for (int cellsnum = mincells; cellsnum < maxcells; cellsnum++)
                    {
                        HSSFCell cell = row.getCell(cellsnum);

                        if (cell != null)
                        {/// 将每行的数据拼接成为字符串
                            rowstring +=row.getCell(cellsnum);
                            System.out.printf("当前行为%d行，共%d列，第%d列\n",j,maxcells,cellsnum  );
                        }
                    }////将每行拼接的字符串添加到集合
                    rowlis.add(rowstring);
                    System.out.printf("第%d行内容：%s\n", j + 1, rowlis);
                    list.add(rowlis);
                }

            }
            System.out.println("execl文件的内容为:"+list);

//            for(List <String> resut : list)
//            {
//                //System.out.println(list.get(i));
//                System.out.println("execl文件的内容为:"+resut);
//                System.out.println("execl文件的内容为:"+resut);
//
//            }

        } catch (Exception e) {
            System.out.println(e);
        }


    }
}



