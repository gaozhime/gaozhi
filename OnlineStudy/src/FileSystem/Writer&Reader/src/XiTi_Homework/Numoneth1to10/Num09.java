package XiTi_Homework.Numoneth1to10;

import java.util.*;

/**
 * @version 1.0.1
 * @Author gaozhi；
 * @Date 2021-03-02;
 */
//【程序9】
// 题目：一个数如果恰好等于它的因子之和，这个数就称为"完数"。例如6=1＋2＋3.编程 找出1000以内的所有完
//        数。
public class Num09 {
    String info = "";

    public Num09(String info) {/**构造函数，接收*/
        this.info = info;
        System.out.println(info + "正在运行########");
    }

    List<Integer> res = new ArrayList<>();      //存储每1个质子数
    //List<Integer> partlist=new ArrayList<>();  //每分解1个因子，就添加到集合中；
    int currentnum;                            //每找到1个分子，则将被查找的数重置到currentnum中；

    public void allpart(int begin, int end) {
        for (int i = begin; i <= end; i++) {
            partlist01.clear();
            judgeres(i);
            if (partlist01.size() > 0) {  //当前数据存在质子，则可继续判断是否为全质子数
                int sum = 0;  //每个数 质子的和
                for (int j = 0; j < partlist01.size(); j++) {
                    sum += partlist01.get(j);
                }
                if (i == sum)
                    res.add(i);
                System.out.println(i + "的质子有：" + partlist01.toString());
            }

        }

        System.out.println(begin + "至" + end + "之间的全质子数有：" + res.toString());
        System.out.println(info + "结束执行任务####################");

    }

    List<Integer> partlist01 = new ArrayList<>();     //存储每1个数的全部质子数

    public void judgeres(int value) {
        currentnum = 0;
        int i = 2;
        for (; i <= value / 2; i++) {
            if (value % i == 0) {  //若存在1个数j能带除被判断数据i; 则 (1)添加j 到质子集合中；（2） 用 i/j 的结果，再重新进入判断
                partlist01.add(i);
                currentnum = value / i;
                judgeres(currentnum);
                return;
            }
        }
        if ((i == 2 || i == 3) && partlist01.size() > 0)
            partlist01.add(value);
    }

}

