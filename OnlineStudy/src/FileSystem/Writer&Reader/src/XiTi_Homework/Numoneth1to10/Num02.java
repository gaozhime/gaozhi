package XiTi_Homework.Numoneth1to10;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ForkJoinPool;

/**
 * @version 1.0.1
 * @Author gaozhi；
 * @Date 2021-03-01;
 */
//题目：判断101-200之间有多少个素数，并输出所有素数。
//        素数又叫质数，就是除了1和它本身之外，再也没有整数能被它整除的数。也就是素数只有两个因子。
public class Num02 {
    int stainx, endinx;   //   stainx:开始序号、endinx 结束序号
    String info = "";
    List<Integer> res = new ArrayList<>();

    public Num02(int stainx, int endinx, String info) {    //构造函数，指定判断数据的范围
        this.stainx = stainx;
        this.endinx = endinx;
        this.info = info;
    }

    public void judgenumres(int stainx, int endinx) {    //调用数据判定方法
        for (int i = stainx; i < endinx + 1; i++) {
            if (is_prime(i)) {
                res.add(i);
            }
        }
        try {
            System.out.println("程序休眠0.5S........");
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.print(info + stainx + "至" + stainx + "之间的质数总数为:" + res.size() + ";其值分别为:\n");
        for (Integer re : res) {
            System.out.print(re + ", ");
        }
        System.out.println("\n###########\n");

    }

    /*判断函数*/
    public boolean is_prime(int i) {  //真是判定数字是否为质数
        boolean rest = false;
        for (int j = 2; j < i / 2; j++) {
            if (i % j == 0)   /*若存在1个非1的数字，能整除，则非质数*/ {
                break;
            } else
                rest = true;
        }
        return rest;
    }

}
