package XiTi_Homework.Numoneth1to10;

import javafx.scene.control.Alert;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0.1
 * @Author gaozhi；
 * @Date 2021-03-02;
 */
//题目：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
//(1)如果这个质数恰等于n，则说明分解质因数的过程已经结束，打印出即可。
//(2)如果n<>k，但n能被k整除，则应打印出k的值，并用n除以k的商,作为新的正整数你n,重复执行第一步。
//(3)如果n不能被k整除，则用k+1作为k的值,重复执行第一步。 
public class Num04未完成_同09 {
    int num = 0;
    String info = "";
    List<Integer> list = new ArrayList<>();

    public Num04未完成_同09(int num, String info) {/**构造函数，判断给定的数必须为正整数*/
        this.info = info;
        this.num = num;
    }


    public void desdiv(int a) {
        int order = 2;   //除数 的取值
        int half = a / 2; //二分之一数值判断；
        if (a <= 2 && list.size() == 0) {   //【1】判断的数据 小于等于2 且 分解分子集合list 为空时，则不用分解；
            System.out.println("请确认输入的数据为大于2的整数\n");
            return;
        } else if (half < 2 && list.size() != 0)  //[2] 分子继续分解，分子为 2时，则直接取当前因子
            list.add(a);
        else {    //[3]可结结分解判断的数
            for (; order < half; ) {//用当前分解的数判断 （依次从 2 至  a/2-1 去除，若能除尽，则终止；a.记录当前除尽的数；b.用除后的结果 继续分然分解）
                if (a % order == 0) {//找到1个数，能整除当前数字a;   结果，跳出，并用结果再进行分解判断
                    list.add(order);
                    desdiv(a / order);
                    break;
                } else
                    order += (order == 2 ? 1 : 2);    //若当前的除数为2，则结束后加1，否则，自动+2(因偶数不可能为质数);
            }

            //【4】若除数取值 > 二分之一数据，说明无可以整除的数据；则添加当前数据本身到可整除列表 （若最后list的长度为1，则说明当前数据只能被1和本身整除，则清空list）
            if (order > half)
                list.add(a);
            System.out.println(list.size());
        }
        //【5】判断整除集合list长度是否为1，若为1则清空；否则>1则不处理
        if (list.size() == 1)
            list.clear();

        //打印分解质数结果
        if (list.size() > 0)   /*当list为空时，表时没有分解结果*/ {
            int i = 0;
            System.out.printf("{0},{1}分解质数后的结果为：{2}\n", info, num, list.size());
            for (; i < list.size() - 1; i++) {
                System.out.printf("{0} * ", list.get(i));
            }
            System.out.println(list.get(i));
        }
        System.out.println("\n###########");
    }


}
