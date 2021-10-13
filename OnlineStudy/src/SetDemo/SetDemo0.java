package SetDemo;

import java.util.HashSet;
import java.util.Set;

public class SetDemo0 {
    public static void main(String[] args) {
        Set set = new HashSet();
        set.add("语文");
        set.add("数学");
        System.out.println("集合的长度为：" + set.size());
        set.add("英语");
        set.add(null);
        System.out.println("集合的长度为：" + set.size());
        set.add("语文");
        System.out.println("集合的长度为：" + set.size());
        System.out.println(set);
    }

}
