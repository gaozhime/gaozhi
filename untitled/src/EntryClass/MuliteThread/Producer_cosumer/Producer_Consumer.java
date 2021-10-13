package EntryClass.MuliteThread.Producer_cosumer;

import java.sql.Struct;
import java.util.Random;

/*
enum  Productname
{
    包子,馒头,花卷
};

class Productinfo{
    String name=null;
    int price=0;
    public  Productinfo(String neme,int price)
    {
        this.name=name;
        this.price=price;
    }
}
*/
public class Producer_Consumer  //implements  Runnable
{
    private   String name;
    private int price=0;
//    public void setName(String name) {
//        this.name = name;
//    }
//    public String getName() {
//        return name;
//    }
 /*   public  void  setPrice(int price)
    {
        this.price=price;
    }
    public  int getPrice()
    {
        return  price;
    }
   */
    public void push(String names,int prices)
    {
        this.name=names;
        this.price=prices;
    }
    public  void pop()
    {
        System.out.println("我消费了1个"+this.name+";价格是："+this.price);
    }
     public static void main(String args[])
     {
     }
//     public  void run()
//    {
//        System.out.println("线程控制开始！！！");
//    }

}
