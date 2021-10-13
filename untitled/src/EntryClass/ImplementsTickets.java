package EntryClass;

public class ImplementsTickets implements  Runnable {
    private int ticketsnum=0;    //余票数
    int turns=1;                 //票号数
    public ImplementsTickets(int i)
    {
        ticketsnum=i;
        System.out.println("总票数为"+ticketsnum+"张，余票"+ticketsnum+"张");
    }
   public  void  run()
   {
       //lock lc=new lock(truns);
       synchronized (this)
       {
           if(turns<= ticketsnum)
           {
               System.out.println("***订购到了序号为"+turns+"的票，余票"+(ticketsnum-turns)+"张");
               turns++;
           }

       }


    }
}

class BuyTickets
{
    public  static  void main(String args[])
    {
        ImplementsTickets tickes=new ImplementsTickets(50);
        for(int i=0;i<300;i++)
        {
             new Thread(tickes,("用户"+i)).start();
        }
    }


}
