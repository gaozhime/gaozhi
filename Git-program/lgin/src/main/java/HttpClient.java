import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class HttpClient
{
    public  static  void main(String[] args)
    {
        URL url;
        try{
            //[1]创建url连接对象
            url=new URL("http://www.baidu.com");
            //[2]  创建url连接对象
            URLConnection connection=url.openConnection();
            //[3]设置url连接属性
            connection.setDefaultUseCaches(true);
            connection.setUseCaches(true);
            connection.setDoOutput(true);

            //[4]打开url连接
           connection.connect();

           //[5] 从url中获取数据
            BufferedReader brf =new BufferedReader(new InputStreamReader(connection.getInputStream(),"utf-8"));       //url.getContent();

            String respond=null,temp=brf.readLine();
           // int n=-1;
           // byte[] b=new byte[2000]

          /*  while ((temp=brf.readline())!=-1)
            {
                String s=new String(b,0,n);
                text +=s;
                System.out.println(s+","+text);
            }
            */
           while (temp!=null)
           {
               respond+=temp;
               //System.out.println(brf.readLine());
           }
            System.out.println(respond);
        }
        catch (Exception e)
        {
            System.out.println(e);
        }
    }

}
