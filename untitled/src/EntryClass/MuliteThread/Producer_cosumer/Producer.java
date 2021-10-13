package EntryClass.MuliteThread.Producer_cosumer;

public class Producer implements  Runnable
{
    private  Producer_Consumer producer_consumer=null;
    String names=null;            //产品名
    int prices=0;                 //价格
    public  Producer(Producer_Consumer p)
    {
        producer_consumer=p;
    }
    //生产成品
    public  void   run( )
    {
        int i=1;
           // synchronized (this) {
                for (i=1;i<300;i++) {
                    if (i % 3 == 0) {
                        names= "包子";
                        prices = 3;

                    }
                    else if (i % 2 == 0) {
                        names = "馒头";
                        prices = 2;
                    }
                    else {
                        names = "花卷";
                        prices = 1;
                    }
                    producer_consumer.push(names,prices);
//                    producer_consumer.setName(name);
//                    producer_consumer.setPrice(price);
//                    System.out.println("我生产了1个" + producer_consumer.getName() + ",金额:" + producer_consumer.getPrice());
                   /* producer_consumer.name = null;
                    producer_consumer.price = 0;*/
                }

          //  }
    }
}
