package MyFileHelper;

import java.io.*;

public class MyFileWriter {
    public  String  path,name;
    public File filename;
    //public FileWriter fw=null;   BufferedWriter brw=null;
    public  FileOutputStream fops=null;
    public  OutputStreamWriter outw=null;
    /* /置文件信息内容 */
    public  MyFileWriter(String path,String name)
    {
        this.path=path ;    this.name=name;
        this.filename = new File(path,name);
        fileJust();
    }
    /**判断文件是否存在*/
    public  void fileJust()
    {
        if(filename.exists())
        {
            //存在，则更新
            try {
                fops=new FileOutputStream(filename,true);
            } catch (IOException e) {
                e.printStackTrace();
            }
            setfilwrnvrioment();
            try {
                outw.append("测试添加文件内容\r\n");
                outw.close();
                fops.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else
        { //不存在，创建
            try {
                fops=new FileOutputStream(filename,false);
            } catch (IOException e) {
                e.printStackTrace();
            }
            setfilwrnvrioment();
//            try {
//                fw=new FileWriter(filename);
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            brw=new BufferedWriter(fw);
            try {
                outw.write("测试新增数据num0001\n");
                outw.close();
                fops.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    //设置filereader、 bufferreader 对象的值
    public  void setfilwrnvrioment()
    {
        try {
            outw=new OutputStreamWriter(fops,"utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    ///真正进行文件操作
    public void  writeFileDate(boolean isexist)
    {
        if(isexist)
        {

        }
        else
        {
            try {
                outw.append("测试新增数据num0001");
                outw.close();
                fops.close();
                //outw.write("测试新增数据num0001");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
