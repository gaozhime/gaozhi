package EntryClass.MuliteThread.Producer_cosumer;

public class Cosumer implements  Runnable
{
    private  Producer_Consumer producer_consumer=null;
    public  Cosumer(Producer_Consumer p)
    {
        producer_consumer=p;

    }
    public  void run()
    {
        System.out.println("消费者线程进入正常");
        //synchronized (this)
       // {
            int i=1;
            for (i=1;i<300;i++) {
                try
                {
                    Thread.sleep(3);
                    producer_consumer.pop();}
                catch ( Exception e)
                {}
                //System.out.println("我消费了1个"+producer_consumer.pop();+"；金额为:"+producer_consumer.getPrice());
                //producer_consumer.setName(null);producer_consumer.setPrice(0);
            }
       // }
    }

}
