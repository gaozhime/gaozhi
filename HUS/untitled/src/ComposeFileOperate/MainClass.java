package ComposeFileOperate;

import java.io.File;

public class MainClass {
    public static void main(String args[])
    {
        //设置配置地址信息
  //      String para="\"usernameOrEmailAddress=001936&password=666666&rememberMe=false\"";
        try{
             File webadress=new File("D:\\idea_settingfile\\address.txt");
                File    paraadress=new File("D:\\idea_settingfile\\para.xls");
                File responadress=new File("D:\\idea_settingfile\\response.doc");
                new HttpClient(webadress,paraadress,responadress);
        }catch (Exception E)
        {
            System.out.println(E);
        }
    }
}
