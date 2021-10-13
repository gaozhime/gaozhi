package ListArrayCapture.Array;

public class Student {
    public String getSno() {
        return sno;
    }

    public void setSno(String sno) {
        this.sno = sno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //private  int  id ;
    private String sno, name, sex;
    private int age;

    public Student(String sno, String name, String sex, int age) {
        this.sno = sno;
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
}
