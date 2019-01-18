package double_check;

public class DoubleCheckDemo {
    public static void main(String[] args) {
        Student student = Student.getInstance();
        Student student1 = Student.getInstance();
        if (student.equals(student1)) {
            System.out.println("true");
        }

    }

}

class Student {

    private static Student student = null;

    private Student() {

    }

    public static Student getInstance() {
        if (student == null) {
            synchronized (Student.class) {
                if (student == null) {
                    student = new Student();
                }
            }
        }
        return student;
    }
}
