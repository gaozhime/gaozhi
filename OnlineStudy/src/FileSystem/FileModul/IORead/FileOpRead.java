package FileSystem.FileModul.IORead;

import java.io.*;

public class FileOpRead {
    public static void main(String[] args) {
        readTxt();


    }

    public static void readTxt() {
        File f = new File("read.txt");
        Reader reader = null;
        //获取文件流
        try {
            reader = new FileReader(f);
            int i;
            while ((i = reader.read()) != -1) {
                System.out.println((char) i);

            }
            System.out.println("读取数据成功");
        } catch (IOException e) {
            e.printStackTrace();
        }

        //关闭文件流
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
