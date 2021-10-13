package ComposeFileOperate;

import java.awt.*;
import java.io.*;

public class WordOperate {
    public File f; String context;String retutent="";
    public WordOperate()
    {

    }

    public String  wordOper(File f1,String context1)
    {
        {
            this.f=f;
            this.context=context;
        }
        if(context.equalsIgnoreCase("R"))
        {
            //读文件
            retutent="读取文件内容。。。。。。";
        }
        else {//写文件，context为文件内容
            try {
                if (!f.exists())
                { //文件存在，则创建
                    f.createNewFile(); }
                //[1]创建文件注

                //[2]创建读写流
                BufferedWriter bfw=new OutputStreamWriter(new BufferedWriter(opts));

            }
            catch(Exception E)
            {
                    System.out.println(E);
            }

        }
        return  retutent;
    }

}
