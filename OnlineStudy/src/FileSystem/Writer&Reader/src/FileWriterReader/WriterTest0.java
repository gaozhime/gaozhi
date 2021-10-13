package FileWriterReader;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.Random;

public class WriterTest0 {
    public static void main(String[] args) {
        Writer writer = null;
        try {
            writer = new FileWriter("w.txt", true);
            Random rd = new Random();
            for (int i = 0; i < 10; i++) {
                int m;
                while ((m = rd.nextInt()) <= 0 || m > 100000)
                    m = rd.nextInt();
                // int num=  (m=rd.nextInt() )>0?  m : rd.nextInt() ;
                writer.write("第二次测试Write写入第" + m + "行数据\r\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        //关闭文件流
        finally {
            try {
                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
