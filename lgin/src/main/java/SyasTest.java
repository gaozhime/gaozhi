import org.omg.PortableServer.portable.Delegate;

public class SyasTest  extends  Thread implements  Runnable
{
    public  static  String syas;
    public  SyasTest(String s)
    {
        setName(s);
    }
    public static  void main(String args[])
    {
         Thread thread1=new SyasTest("sync");
        Thread thread2=new SyasTest("together");
        thread2.start();
        thread1.start();
    }

    public  void run()
    {

        syas=this.getName();
        //System.out.println(syas);
        systest();
    }

    public  void systest()
    {
        try{
     //   synchronized ( syas)
       // {
           if(syas.equals("sync"))
           {

                   while (true) {
                       System.out.println("我是线程1，我正在运行");
                       sleep(3);
                   }
          }
           else
           {
               while(true)
               {
                    System.out.println("我是线程2，我正在运行");
                    sleep(3);
               }
           }

        //}
        }
        catch ( Exception e)
        {System.out.println(e);}
    }
}
