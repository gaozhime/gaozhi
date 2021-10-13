package HTTPHelper;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class HttpRequstEntry {
    public String url=null,para=null;
    public  HttpRequstEntry(String url,String para)
    {   ///设置请求地址、请求参数
        this.url=url;this.para=para;
        RequstApply();
    }
    public void RequstApply() {
        try {
            //[1] 创建Url
            URL urladdress=new URL(url);
            //[2] 创建URL连接
            URLConnection urlConnection=urladdress.openConnection();
            //[3]设置URL连接属性
            urlConnection.setDefaultUseCaches(true);
            urlConnection.setDoInput(true);
            urlConnection.setDoOutput(true);
            urlConnection.setConnectTimeout(50000);
            //[4]打开URL连接
            urlConnection.connect();
            //【5】设置请求参数、发送请求
            PrintWriter pwt=new PrintWriter(urlConnection.getOutputStream());
            pwt.print(para);      pwt.flush();
            //[6] 获得响应
            BufferedReader bfrd =new BufferedReader(new InputStreamReader(urlConnection.getInputStream(),"utf-8"));  //  urlConnection.getInputStream());
            String response="";
            String subres="";
            while(( subres=bfrd.readLine())!=null)
            {
                response+=subres;
            }
            System.out.println(response);
            if(response.contains("\"success\": true") )
            {
                System.out.println("成功");
            }
            else
            {
                System.out.println("失败");
            }
        }
        catch (Exception E)
        {
            System.out.println("有异常未处理");
            System.out.println(E);
        }

    }
}
