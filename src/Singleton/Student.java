package Singleton;


/**
 * 保证Student是唯一的
 * 饿汉
 */
public class Student {

    private static Student student = new Student();

    private Student() {

    }

    public static Student getInstance() {
        return student;
    }
}

class StudentDemo {
    public static void main(String[] args) {
        Student s1 = Student.getInstance();
        Student s2 = Student.getInstance();
        System.out.println(s1 == s2);
    }
}
