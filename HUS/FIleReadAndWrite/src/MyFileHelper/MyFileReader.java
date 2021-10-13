package MyFileHelper;

import java.io.*;

public class MyFileReader {
    public  String  path,name;
    public File filename;
    /* /置文件信息内容 */
    public MyFileReader(String filepath, String filename)
    {
        this.path=filepath ;    this.name=filename;
        this.filename =new File(filepath,filename);
        fileJust();
    }

    /// 判断文档存在性、文档格式
    public  void  fileJust()
    {
        /*
            [1] 文件是否存在;
            [2]  判断文件类型
           【3】  根据文件类型分别创建不同的文件 读/写方法
        */
        String errorinfo=null;
        //[step1]case1: 文件不存在
        if(!filename.exists())
        {
            errorinfo="文件"+filename+"不存在,请确认信息";
            errorlog(errorinfo);
        }
        //[step1]case2: 文件存在
        else
        {
            //【Step2】  判断文件格式
            if(name.endsWith(".txt")|| name.endsWith(".doc") || name.endsWith(".docx"))
            {
                //case1:   txt或word格式的文档
                readTxtFile();
            }
            else if(name.endsWith("xls") || name.endsWith("xlsx"))
            {  // case2： excel格式的文档
                errorinfo="文件"+filename+"为excel格式的，还未处理，请等待完善.....";
                errorlog(errorinfo);
            }
            else
            {
                //case3: 非excle、word、txt文档
                errorinfo="文件"+filename+"格式的文件，还未处理，请等待完善.....";
                errorlog(errorinfo);
            }
        }
    }
    // txt/word 格式文档读取
    public  void readTxtFile()
    {
        FileReader fr=null;
        BufferedReader brf;
        String readtxt=null;
        try {
            fr=new FileReader(filename); }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        brf=new BufferedReader(fr);
        try {
            readtxt=brf.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            while (readtxt!=null)
            {
                errorlog(readtxt);
                readtxt=brf.readLine();
            }
            fr.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*错误日志*/
    public  void errorlog(String s)
    {
        //【1】 记录错误日志
        System.out.println(s);
    }
}
