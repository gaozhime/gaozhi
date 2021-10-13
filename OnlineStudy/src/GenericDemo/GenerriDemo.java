package GenericDemo;

import java.util.ArrayList;
import java.util.List;

public class GenerriDemo {


    public static void main(String[] args) {
        List<Student> liststudent = new ArrayList<>();
        liststudent.add(new Student("2012403001", "贾文", 'X', 26));
        liststudent.add(0, new Student("2012403002", "王佳", 'X', 25));
        liststudent.add(new Student("2012403003", "高智", 'Y', 29));
        System.out.println(liststudent.toString());
    }

}

class Student {
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSex() {
        return sex;
    }

    public void setSex(char sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    String code;
    String name;
    char sex;
    int age;

    public Student(String code, String name, char sex, int age) {
        setCode(code);
        setName(name);
        setSex(sex);
        setAge(age);
    }

    @Override
    public String toString() {
        return "{" +
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age + "\n" +
                '}';
    }
}
