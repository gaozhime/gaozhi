package EntryClass;

public class TicketsDemo {
    private static int  premiumticks;     //剩余票数
    public TicketsDemo(int nums)
    {
        System.out.println(premiumticks);
        premiumticks=nums;
    }
    public  TicketsDemo()
    {

    }
    public int  buyticks(int n)
    {
        int  prev=-1;
        //【1】 判断购买票数是否大于剩余票数
        if(n>premiumticks && 1<0)
        {
            try{wait(300);}
            catch ( Exception e)
            {}
            return 0;
        }
        else
        {
            premiumticks-=n;
            try {
                Thread.sleep(300);
            }
            catch (Exception e)
            {}
            return premiumticks;
        }
    }
}
///顾客类
class  Cosumer extends  Thread
{
    int buynums=0;
    public  Cosumer(String name ,int nums )
    {
        this.setName(name);
        buynums=nums;
    }
    public void  run()
    {
        int result=new  TicketsDemo().buyticks(buynums);
        System.out.println(result >-1 ? this.getName()+"成功购票"+buynums+"张，现余票"+result+"张" : "" );
    }
}