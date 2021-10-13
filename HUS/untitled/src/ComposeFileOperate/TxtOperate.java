package ComposeFileOperate;

import java.io.*;

public class TxtOperate {
    File f;String type;
    public TxtOperate(File f,String type)
    {
        this.f=f;
        this.type=type;
    }

    public String judgeReadWrite(File f,String type)
    {
        String retruntext="";
        if(type.equalsIgnoreCase("R"))
        {
            //读取文件
            try{
                //【1】创建文件流
                InputStreamReader fr=new InputStreamReader(new FileInputStream(f));
                BufferedReader brfi = new BufferedReader(fr) ;
                //【2】读取文件内容：目前取最后1条数据为有效数据
                retruntext=brfi.readLine();
                String temp=retruntext;
                while (temp!=null)
                {
                    retruntext= (temp=brfi.readLine())!=null ? temp : retruntext;
                    System.out.printf("赋值网址成功,网址内容为%s\n",retruntext);
                }
                //【关闭流】
                brfi.close();
                fr.close();
            }
            catch ( Exception e)
            {
                System.out.println("获取网址信息出错\n");
                System.out.println(e);}
        }
        else if(type.equalsIgnoreCase("W"))
        {
            retruntext="TxtOperate类中未获取到网址";
            System.out.println(retruntext);

        }
        return retruntext;
    }
}
