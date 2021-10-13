package GenericDemo.MyGeneric;

public class Test {
    public static void main(String[] args) {
        MyGeneicDemo<String> demo1 = new MyGeneicDemo<>();
        demo1.setE("我的第1个泛型");
        demo1.setE("我的第2个泛型");
        System.out.println(demo1);

        int[] testlist = {0, 3, 5, 8, 9};
        MyGeneicDemo<int[]> demo2 = new MyGeneicDemo<>();
        demo2.setE(testlist);
        System.out.println(demo2 + "\n" + demo2.getE());
        for (int i = 0; i < demo2.getE().length; i++) {
            System.out.println(demo2.getE()[i]);

        }
    }
}
