package MyFileHelper;

import java.util.Calendar;
import java.util.Date;

public class MainThread {
    public  static  void main(String args[])
    {

        String path="D:\\";
        String name="错语日志.docx";
        new MyFileWriter(path,name);
        new MyFileReader(path,name);
    }
}
