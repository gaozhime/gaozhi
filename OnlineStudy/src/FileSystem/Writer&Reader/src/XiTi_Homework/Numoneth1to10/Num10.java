package XiTi_Homework.Numoneth1to10;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0.1
 * @Author gaozhi；
 * @Date 2021-03-02;
 */
//【【程序10】
//题目：一球从100米高度自由落下，每次落地后反跳回原高度的一半；再落下，求它在 第10次落地时，共经过多
//少米？第10次反弹多高？
public class Num10 {
    String info = "";

    public Num10(String info) {/**构造函数，接收*/
        this.info = info;
        System.out.println(info + "正在运行########");
    }

    List<Float> distens = new ArrayList<>();      //存储每1次落地、上长的高度 记录
    Float begin;                           //每一次开始下降的高度
    int times;                            //x次数；
    float currentheight = 0;                //当前反弹高度
    float dist = 0;


    public void distenss(float begin, int times) {

        if (times < 1 || begin < 1) {
            System.out.println("初始高度、次数均需要大于等于1");
            return;
        } else {
            this.begin = begin;
            this.times = times;
            currentheight = begin;

            int i = 1;
            while (i <= times) {
                distens.add(this.currentheight);   //第n次下落、上长的高度/距离
                this.dist += currentheight;
                this.currentheight /= 2;            //第n次下后落反弹的高度
                if (i < times) {
                    distens.add(this.currentheight);   //若达到落地次数，则走过的路不再累加本次的反弹高度
                    dist += this.currentheight;
                }
                i++;
            }
        }
        System.out.println("从" + this.begin + "米高处下落，第" + this.times + "次落地时，共走过了" + dist + "米的距离，反弹高度为:" + currentheight + "米");
        System.out.println(info + "结束执行任务####################");
    }


}

