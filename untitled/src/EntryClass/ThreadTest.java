package EntryClass;

import java.util.ArrayList;

public class ThreadTest {
    public static  void main(String args[])
    {
      TicketsDemo ticketsDemo= new  TicketsDemo(5);
      //生成3个线程    张三、李四、王五
     /*  Cosumer zhangsan=new Cosumer("张三",1);
       Cosumer lisi=new Cosumer("李四",1);
       Cosumer wangsu=new Cosumer("王五",2); */
       for (int i=65;i<87;i++)
       {
           String name=((char) i)+"";
           int j=Math.round(1);
           Cosumer cosumer=new Cosumer(name,j);
           cosumer.start();
       }
    }
}
