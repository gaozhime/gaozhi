package ListArrayCapture.Lists;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class Department {
    public static void main(String[] args) {
        Collection collc = new ArrayList();
        collc.add("测试部");
        collc.add("开发");
        collc.add("产品");
        /*遍历集合数据*/
        foreachlist(collc);
    }

    /*遍历 */
    public static void foreachlist(Collection c) {
        Iterator colllciterator = c.iterator();
        while (colllciterator.hasNext()) {
            System.out.println(colllciterator.next());
        }
    }
}
