package FileWriterReader;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ScannerTest {
    public static void main(String[] args) {
        input:
        System.out.println("请输入1个整数");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        while (i <= 0 || i >= 100) {
            System.out.println("输入参数有误，请重新输入");
            Scanner sc1 = new Scanner(System.in);
            i = sc.nextInt();
        }
        System.out.println("输入的数据合法：" + i);
    }
}
