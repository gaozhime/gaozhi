package ListArrayCapture.Collection;

import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Iterator;

public class CollectionTest {
    public static void main(String[] args) {
        Collection departcoll = new ArrayDeque();
        //1. 添加元素
        departcoll.add("公务员");
        departcoll.add("事业单位");

        Collection departcoll2 = new ArrayDeque();
        departcoll2.add("外企");
        departcoll2.add("民企");
        departcoll2.add("合资企业");

        System.out.println(departcoll);
        //2. 移除元素
        departcoll.remove("民企");
        System.out.println(departcoll);

        //3. 将集合合并
        departcoll.addAll(departcoll2);
        System.out.println(departcoll);

        //4. 清空集合
        departcoll2.clear();

        // 5.  集合是否包含元素
        boolean iscontaint = departcoll.containsAll(departcoll2);
        System.out.println(iscontaint);

        //6.  获取集合的大小
        departcoll.size();
        System.out.println(departcoll.size());
        //7. 集合的遍历（itear）
        ItearQuure(departcoll);

    }

    public static void ItearQuure(Collection c) {
        Iterator iterator = c.iterator();
        System.out.println("集合遍历开始#########");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
