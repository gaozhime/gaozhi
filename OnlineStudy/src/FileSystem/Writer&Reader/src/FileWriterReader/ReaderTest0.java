package FileWriterReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderTest0 {
    public static void main(String[] args) {
        Reader reader = null;
        try {
            reader = new FileReader("w.txt");
            char[] content = new char[1024000];
            try {
                int readno = -1;
                while ((readno = reader.read()) != -1) {
                    System.out.println(new String(content, 0, readno));
                }
            } catch (IOException e) {

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        //关闭流
        finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
