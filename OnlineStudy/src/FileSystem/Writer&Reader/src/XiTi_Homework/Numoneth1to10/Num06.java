package XiTi_Homework.Numoneth1to10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @version 1.0.1
 * @Author gaozhi；
 * @Date 2021-03-02;
 */
//【程序6】
//        题目：输入两个正整数m和n，求其最大公约数和最小公倍数
public class Num06 {
    int a, b;     //求数值的两个数
    int mul, maxdiv;  //公倍数、公约数
    String info = "";
    List<Float> recordlist = new ArrayList<>();

    public Num06(int a, int b, String info) {/**构造函数，判断给定的数必须为正整数*/
        this.info = info;
        if (a > b) {  /*保证参数a 始终为较小值 ；即若a>b,则交换位置 */
            var tem = a;
            a = b;
            b = tem;
        }
        this.a = a;
        this.b = b;
        mul = a * b;  /*公约数置为2数之积；  公约数初始化为 2者之间的最小数*/
        maxdiv = a;
        System.out.println(a + "," + b + "，" + mul + "，" + maxdiv);
    }

    /*@求最小公倍数*/
    public int minmul() {
        for (int i = a; i >= 2; i--) {
            if (a % i == 0 && b % i == 0) {
                mul /= i;
                break;
            }
        }
        System.out.println(a + "与" + b + "的最小公倍数为:" + mul);
        return mul;
    }

    /*最大公约数*/
    public int maxdiv() {
        int i = a;
        for (; i >= 1; i--) {
            if (a % i == 0 && b % i == 0) {
                maxdiv = i;
                break;
            }
        }
        System.out.println(a + "与" + b + "的最大公约数为:" + maxdiv);
        System.out.println(info + "#################");
        return maxdiv;
    }

}
