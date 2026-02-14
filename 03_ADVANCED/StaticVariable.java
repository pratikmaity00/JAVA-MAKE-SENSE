class Student {
    static String school = "ABC School";
    public void show() {
        System.out.println("School Name : " + school);
    }
}

public class StaticVariable {
    public static void main(String[] args) {
        Student obj1 = new Student();
        Student obj2 = new Student();
        Student obj3 = new Student();

        Student.school = "XYZ School";

        obj1.show();
        obj2.show();
        obj3.show();

    }
}
