package XiTi_Homework;


import XiTi_Homework.Numoneth1to10.*;

import java.util.Scanner;

public class publicprogram {
    public static void main(String[] args) {

//  /*第二题开始： */
//        int stainx=1001,endinx=1900;
//        new Num02(stainx,endinx,"这是第二题").judgenumres(stainx,endinx);
// /*第二题结束：*/
// /*第3题开始：水仙花数字 */
//        int bnum=100,endnum=999;
//        new Num03(bnum,endnum,"这是第三题").isleg();
// /*第3题结束：*/

// /*第4题开始：分解质数 */
//        int num=4;
//        new Num04(num,"这是第四题,分解质数").desdiv(num);
// /*第4题结束：*/


///*第5题开始：分解质数 */
//        int num5=8,maxpoint=150;
//        Num05 num05=new Num05(num5,maxpoint,"这是第五题,分别查询");
//        num05.genorecord(num5,maxpoint);
//        num05.showrecordleg();
// /*第5题结束：*/

///*第6题开始：分解质数 */
//        int a=21,b=7;
//        Num06 num06=new Num06(a,b,"这是第六题,公倍数、公约数求值");
//        num06.minmul();
//        num06.maxdiv();
///*第6题结束：*/

///*第7题开始：分解质数 */
//        System.out.println("请输入1个需要判断的字符串:");
//        Scanner sc=new Scanner(System.in);
//        String s=sc.nextLine();
//        new Num07("这是第七题,重复数字求和").countnums(s);
///*第7题结束：*/

///*第8题开始：分解质数 */
//        new Num08("这是第八题,统计字符类型数量").addcount();
///*第8题结束：*/

///*第9题开始：分解质数 */
//        new Num09("这是第九题,统计全质子数的个数").allpart(2,5000);
///*第9题结束：*/

// /*第10题开始：分解质数 */
        //var temp=new Num10("这是第十题,统计反弹距离");
        for (int i = 0; i < 11; i++) {
            new Num10("这是第十题,统计反弹距离").distenss(100, i);
        }

        /*第10题结束：*/
    }
}
