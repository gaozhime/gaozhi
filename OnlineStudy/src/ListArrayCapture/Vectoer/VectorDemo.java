package ListArrayCapture.Vectoer;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector vector = new Vector();
        vector.add("测试");
        vector.add(0, "开发");
        forvector(vector);

    }

    public static void forvector(Vector v) {
        for (int i = 0; i < v.size(); i++) {
            System.out.println(v.get(i));

        }

    }
}
