package ListArrayCapture.Array;

import java.util.List;

public class ComparatoEnty implements Comparable {
    public ComparatoEnty() {
    }

    public ComparatoEnty(List<Student> list) {
        compareTo(list);
    }

    @Override
    public int compareTo(Object o) {
        List<Student> list = (List<Student>) o;
        for (Student ss : list) {

        }
        return 0;
    }
}
