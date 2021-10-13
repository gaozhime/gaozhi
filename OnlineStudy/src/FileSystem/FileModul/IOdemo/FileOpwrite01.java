package FileSystem.FileModul.IOdemo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class FileOpwrite01 {
    public static void main(String[] args) {
        File f = new File("write.txt");
        Writer writer = null;
        //获取文件流
        try {
            writer = new FileWriter(f);
            for (int i = 0; i < 10; i++) {
                writer.write("测试第" + i + "行信息\r\n");
            }
            System.out.println("写入数据成功");
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
