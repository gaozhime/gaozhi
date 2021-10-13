package HTTPHelper;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class VercodeTest {
    //[]
    public  String url=null,para="";
    public VercodeTest(String url)
    {
        this.url=url;
        GetVerCode();
    }

    public void  GetVerCode()
    {
        try {
            //[1] 创建URL
            URL urladress=new URL(url);
            //[2] 创建URL连接对象
            URLConnection urlConnection=urladress.openConnection();
            //[3] 设置连接属性
            urlConnection.setDoInput(true);
            urlConnection.setDoOutput(false);
            //[4]  打开连接
            urlConnection.connect();
            //[5]   设置参数传入
            //【6】  发送带参数请求、刷新
            //【7】设置读入参数
            BufferedReader bfr=new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
            //[7] 获取response
            String response="";
            String tem="";
            while ((tem=bfr.readLine())!=null)
            {
                response+=tem;
            }
            System.out.println(response);
            bfr.close();
        }
        catch (Exception E)
        {System.out.print(E);}
    }
}
