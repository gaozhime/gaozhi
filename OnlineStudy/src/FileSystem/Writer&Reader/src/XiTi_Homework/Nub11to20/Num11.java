package XiTi_Homework.Nub11to20;
//【程序11】
//        题目：有1、2、3、4个数字，能组成多少个互不相同且无重复数字的三位数？都是多少？

//   #=A4-1*A3-1*A2*1
public class Num11 {
    String info = "";

    public Num11(String info) {    //构造函数，指定判断数据的范围
        this.info = info;
    }

    public static void main(String[] args) {
        int a = 10;
        int b = a;
        System.out.printf("a,b修改之前的值分别为：%d,%d\n", a, b);
        a++;
        System.out.printf("a,b修改之后的值分别为：%d,%d\n", a, b);
    }

}
