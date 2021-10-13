package SetDemo.LinkedSet;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedSet1 {
    public static void main(String[] args) {
        Set<String> linkset = new LinkedHashSet<>();
        linkset.add("数学");
        linkset.add("语文");

        System.out.println(linkset);
    }
}
