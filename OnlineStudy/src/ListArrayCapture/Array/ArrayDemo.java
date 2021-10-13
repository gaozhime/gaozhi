package ListArrayCapture.Array;

import java.util.ArrayList;
import java.util.List;

public class ArrayDemo {
    public static List<Student> liststudent = new ArrayList<>();

    public static void main(String[] args) {
        CreatStudent();
        // liststudent.sort(liststudent);
        new ComparatoEnty(liststudent);
    }

    /**
     * 创建学生
     *
     * @return
     */
    public static boolean CreatStudent() {
        boolean succeus = false;
        Student s1 = new Student("20124030001", "李佳", "男", 19);
        Student s2 = new Student("20124030004", "王南", "男", 21);
        Student s3 = new Student("20124030012", "高智", "男", 22);
        Student s4 = new Student("20124030018", "贾文", "女", 20);
        liststudent.add(s1);
        liststudent.add(s2);
        liststudent.add(s3);
        liststudent.add(s4);
        return succeus;
    }
}
