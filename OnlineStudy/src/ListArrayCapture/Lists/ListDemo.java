package ListArrayCapture.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListDemo {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add("测试");
        list.add("产品");
        ForList(list);
        //在第i个位置插入数据
        list.add(0, "项目经理");
        list.add(3, "PMO");
        //遍历List集合
        System.out.println("改变了顺序后的集合");
        ForeachPrint(list);
        foreachList(list);
    }

    //迭代器遍历
    public static void ForeachPrint(List list) {
        ListIterator listIterator = list.listIterator();
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }
    }

    //for遍历
    public static void ForList(List list) {
        System.out.println("for循环遍历集合");
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals("测试"))
                list.add("for循环中添加数据！");
            //  3. 获得元素值
            System.out.println(list.get(i));
        }
    }

    public static void foreachList(List list) {
        System.out.println("foreach循环集合");
        for (Object s : list) {
            System.out.println((String) s);
        }
    }
}
