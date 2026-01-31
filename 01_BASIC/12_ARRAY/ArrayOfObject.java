class Student {
    int roll;
    String name;
    int marks;
}


public class ArrayOfObject {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.roll = 1;
        s1.name = "Pratik";
        s1.marks = 89;

        Student s2= new Student();
        s2.roll = 2;
        s2.name = "Arjun";
        s2.marks = 85;

        Student[] students = new Student[2];
        students[0] = s1;
        students[1] = s2;

        for(int i =  0; i < students.length; i++) {
            System.out.println(students[i].name + " " + students[i].marks);
        }
    }
}
