package XiTi_Homework.Numoneth1to10;

import java.security.Signature;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @version 1.0.1
 * @Author gaozhi；
 * @Date 2021-03-02;
 */
//【程序8】
//求s=a+aa+aaa+aaaa+aa...a的值，其中a是一个数字。例如2+22+222+2222+22222(此时共有5个数相加)，
//思路：随机生成n位相同数值的数字，求其各位值的和； 【】
public class Num08 {
    String info = "";

    public Num08(String info) {/**构造函数，接收*/
        this.info = info;
        System.out.println(info + "正在运行########");
    }

    /*@控制数字相加*/
    public long addcount() {
        List<Integer> numlist = new ArrayList<Integer>();
        System.out.println("请输入想要数字的位数：#如输入3 则生成1个3位数");
        int sizenum = new Scanner(System.in).nextInt();     //数字的最大位数、数量
        System.out.println("请输入数字各位上数值：");
        int numvalue = new Scanner(System.in).nextInt();   //每位数的 值
        int gennum = 0;
        int sum = 0;
        for (int i = 0; i < sizenum; i++) {     //生成n（即numlist） 个1-n位数（每位数值均为 sizenum）
            int realnum = 10 * gennum + numvalue;
            gennum = realnum;
            numlist.add(realnum);
        }
        for (Integer i : numlist) {
            sum += i;
        }

        System.out.println("原数据为：" + numlist.toString());
        System.out.println("各数字之和为:" + sum);
        System.out.println(info + "结束执行任务####################");
        return sum;
    }

}

