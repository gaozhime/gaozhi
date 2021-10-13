package VarParam;

import java.util.Arrays;
import java.util.List;

public class VarPara {
    public static void main(String[] args) {
        sumlist(10, "张琴", "王五", "张三");

    }

    public static void sumlist(int i, String... studentname) {
        String info = "";
        for (String s : studentname) {
            System.out.println(info += s + ";\t");
        }
        System.out.println(i);

        int[][] sno = new int[][]{{1, 2, 3, 4}, {9, 2, 1, 0}, {8, 5, 6, 3}};
        List<int[]> ints = Arrays.asList(sno);
        System.out.println(sno + "" + Arrays.asList(ints));
    }
}
