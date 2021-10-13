package ComposeFileOperate;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

public class HttpClient {
    public  URL url;String para="";String response="";
    public HttpClient (File webadress,File requstpara, File responsadr )
    {
        try
        {
            //（1）从文件中读取url的值
            String urlcontent=new TextHelper(webadress,"r").operFile(webadress,"r");
            this.url=new URL(urlcontent);
            //（2）【从Ewxcel文件中读取请求参数】
            para=new TextHelper(requstpara,"R").operFile(requstpara,"R");
            System.out.println("从cexel文件中读取到的请求参数为："+para);
            AdropthttpRequst();
        }catch (Exception e)
        {
            System.out.println(e);
        }

    }
    //http请求
    public void AdropthttpRequst()
    {
        //从文件中读取请求参数；
        // para="usernameOrEmailAddress=001936&password=666666&rememberMe=false";
        try
        {
            //【1】创建URL并创建连接
            URLConnection urlConnection=url.openConnection();
            //【2】设置连接属性
            urlConnection.setDoOutput(true);  urlConnection.setDoInput(true);
            urlConnection.setConnectTimeout(1000);
            //[3]打开连接
            urlConnection.connect();
            //[4] 发送请求
            PrintWriter prt=new PrintWriter(new BufferedOutputStream(urlConnection.getOutputStream()));
            prt.println(para);    prt.flush();
            //[5] 获取响应数据
            BufferedReader bfr=new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));

            //[]写入响应数据，并读取出来
            String ss="";
            while((  ss=bfr.readLine())!=null)
            {
                response+=ss;
            }
            System.out.printf("请求参数：%s;\n应响信息%s",para,response);

        }
        catch (Exception e)
        {
            System.out.println(e);
        }


    }
}
