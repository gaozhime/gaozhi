package ComposeFileOperate;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class TextHelper {
    /// 参数： 文件 path, 操作类型 ：opertype(必须在 'A、C、D、O、W')
    public  File f;
    public String type;
    public    TextHelper(File file, String opertype)
    {
        f=file;  type=opertype;
    }

    public String  operFile(File f,String type)
    {
         String  httpresons=null;
         System.out.println(f.getName());
        if(f.getName().endsWith(".txt"))
        {
            //文件为.txt;则调用txt操作该当
           httpresons= new TxtOperate(f,type).judgeReadWrite(f,type);
           System.out.println("TextHelper收到的地址\n"+httpresons);
        }
        else if(f.getName().endsWith(".xls") || f.getName().endsWith(".xlsl"))
        {
            ///文件为excel，则调用excel文件操作方法
            if(f.getName().endsWith(".xls"))
            {
                //为xls文件，则调用xls的方法
                httpresons=new ExcelOperate().XlsOper(f,type);

            }
        }
        else if(f.getName().endsWith(".doc") || f.getName().endsWith(".docx"))
        {
            //文件为word，则调用word文件操作方法
            new TxtOperate(f,type).judgeReadWrite(f,type);
        }
        else
        {
            System.out.printf("暂不支持此文件%s的类型操作！！！\n",f.getName());
            Thread.yield();
        }
        return httpresons;
    }

}
