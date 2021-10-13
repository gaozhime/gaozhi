package XiTi_Homework.Numoneth1to10;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @version 1.0.1
 * @Author gaozhi；
 * @Date 2021-03-02;
 */
//题目：利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，60-89分之间的用B表示，60分以下
//的用C表示。
public class Num05 {
    int num = 0;     //成绩数量
    float maxpoint = 0;      //最高成绩
    String info = "";
    List<Float> recordlist = new ArrayList<>();

    public Num05(int num, int maxpoit, String info) {/**构造函数，判断给定的数必须为正整数*/
        this.info = info;
        this.num = num;
        this.maxpoint = maxpoit;
    }

    /*@生成指定个数个 成绩数据*/
    public void genorecord(int num, float maxpoint) {
        for (int i = 0; i < num; i++) {
            Random rd = new Random();
            recordlist.add(rd.nextFloat() * maxpoint);
        }
    }

    public void showrecordleg() {
        System.out.printf(info + "学生情况如下所示:\n");
        for (Float point : recordlist) {
            System.out.print("成绩:" + point + " & 等级：" +
                    (point >= 120 ? 'A' : (point >= 90 ? 'B' : (point >= 70 ? 'C' : 'D'))) + "; ");
        }
        System.out.println("\n############");
    }

}
