package Study.Exceptions;

public class MathExecptionTest {
    public static void main(String[] args) {
        int[] divis = {1, 2, 5, 10};
        int result = 0;  /*计算结果*/
        int t = -111;
 /*       try {
            for (int bnum : divis)
            {
                t=bnum;
                result = divide(10, bnum);
                System.out.printf("被除数为:%d,计算结果为:%d\n",t,result);
            }
        }
        catch (Exception e) {
            //System.out.printf("被除数为:%d时调用发生异常\n", t);
            System.out.println(e.toString());
            e.printStackTrace();
        }*/
        for (int bnum : divis) {
            System.out.println(result = divide(10, bnum));
        }

    }

    public static int divide(int i, int j) {
        int[] arrs = {1, 2, 3};
        try {
            //System.out.println(arrs[10]);
            return i / j;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            return i + j;
        }

    }
}
