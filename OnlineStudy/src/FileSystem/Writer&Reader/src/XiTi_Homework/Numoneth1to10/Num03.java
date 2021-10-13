package XiTi_Homework.Numoneth1to10;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0.1
 * @Author gaozhi；
 * @Date 2021-03-02;
 */
//【程序3】
//        题目：打印出所有的"水仙花数"，所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。例如：
public class Num03 {
    int stainx, endinx;
    String info = "";
    List<Integer> list = new ArrayList<>();

    public Num03(int stainx, int endinx, String info) {/**构造函数，指定判断的数据范围*/    //（限定取值范围为  100-999）  考虑起、始值 大小并交换位置
        this.info = info;
        if (stainx > endinx) {  /*保证参数stainx 始终为较小值 ；即若stainx>endinx,则交换位置 */
            var tem = stainx;
            stainx = endinx;
            endinx = tem;
        }
        this.stainx = stainx >= 100 && stainx < 1000 ? stainx : 100;  /*若起始值非 【100，999】,则置其值为100*/
        this.endinx = endinx >= 1000 || endinx <= 100 ? 999 : endinx;  /*若终止值非 (100，999】,则置其值为999*/
    }


    public void isleg() {
        for (int i = stainx; i <= endinx; i++) {
            int thi = i / 100/*百位*/, two = i / 10 % 10,/*十位*/one = i % 10/*个位*/;
            if (i == Math.pow(thi, 3) + Math.pow(two, 3) + Math.pow(one, 3)) {// 各位立方和等于原数，则为水仙花数，记录集合中
                list.add(i);
            }
        }
        //打印水仙花数
        System.out.printf(info + "{0}至{1}数据范围内的水仙花数字分别为:\n", stainx, endinx);
        for (int i : list) {
            System.out.print(i + "   ，");
        }
        System.out.println("\n###########");
    }


}
