package XiTi_Homework.Numoneth1to10;

import java.util.ArrayList;
import java.util.List;

/**
 * @version 1.0.1
 * @Author gaozhi；
 * @Date 2021-03-02;
 */
//【程序7】
//题目：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
public class Num07 {
    String info = "";

    public Num07(String info) {/**构造函数，接收*/
        this.info = info;
        System.out.println(info + "正在运行########");
    }

    /*@统计词数个数*/
    int numint = 0, numchar = 0, numspa = 0, numother = 0;

    public void countnums(String s) {
        char[] schar = s.toCharArray();
        System.out.println("字符串的原始长度" + s.length());
        System.out.println("转换数组后的长度" + schar.length);
        for (int i = 0; i < schar.length; i++) {
//           if(  'A' <= schar[i] && schar[i] <='Z' || 'a' <= schar[i] && schar[i] <='z' )
            if (Character.isLetter(schar[i]))
                numchar++;
//           else if ('0'<= schar[i] &&  schar[i]<='9')
            else if (Character.isDigit(schar[i]))
                numint++;
            else if (schar[i] == ' ')
                numspa++;
            else
                numother++;
        }
        System.out.println("原数据为：" + s);
        System.out.println("统计字符信息如下:");
        System.out.println("数字：" + numint + ",     字母:" + numchar + ",    空格:" + numspa + ",    其它:" + numother);
        System.out.println(info + "结束执行任务####################");
    }


}
