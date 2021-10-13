package EntryClass.MuliteThread.Producer_cosumer;

import EntryClass.MuliteThread.Producer_cosumer.Cosumer;
import EntryClass.MuliteThread.Producer_cosumer.Producer;
import EntryClass.MuliteThread.Producer_cosumer.Producer_Consumer;

public class MainControlClass
{
    public static void main(String args[])
    {
        Producer_Consumer pc=new Producer_Consumer();
        Producer producer=new Producer(pc);
        Thread producerthread=new Thread(producer);
        Cosumer cosumer =new Cosumer(pc);
        Thread cosumerthread=new Thread(cosumer);
            producerthread.start();
            cosumerthread.start();
    }
}
