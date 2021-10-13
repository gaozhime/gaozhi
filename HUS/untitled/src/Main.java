import ExcelImplmtnt.ExcelReader;
import ExcelImplmtnt.ExcelWrite;
import HTTPHelper.HttpRequstEntry;
import HTTPHelper.VercodeTest;

public class Main {

    public static void main(String[] args)
    {   String path="D:\\Students1.xls";
         String url="http://admin56.jwell56.com/Account/login";
        //String para="{\"usernameOrEmailAddress\":\"001936\",\"password\":\"666666\",\"rememberMe\":\"false\"}";
        String para="usernameOrEmailAddress=001936&password=666666&rememberMe=false";

         new ExcelWrite(path);
        // new ExcelReader(path);
        //new HttpRequstEntry(url,para);
        //new VercodeTest("https://yun.jwell56.com/#/login");



    }
}
