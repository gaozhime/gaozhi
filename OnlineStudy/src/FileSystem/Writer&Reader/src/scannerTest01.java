import java.util.Scanner;

public class scannerTest01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入1个数据：");
        String tex = sc.nextLine();

        System.out.println("输入的数据为：" + tex + "\n请输入1个整数");
        int mol = sc.nextInt();
        System.out.println(mol + "的余数为" + mol % 3);
    }
}
