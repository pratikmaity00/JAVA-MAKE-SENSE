public class Grade {
    public static void main(String[] args) {
        // Given marks of 5 subjects, calculate percentage & grade.

        int totalSubject = 5;
        int sub1 = 70;
        int sub2 = 87;
        int sub3 = 75;
        int sub4 = 98;
        int sub5 = 65;

        int total = sub1 + sub2 + sub3 + sub4 + sub5;
        double percentage = total / totalSubject;
        System.out.println("Total: " + total);
        System.out.println("Percentage: " + percentage);

        if(percentage>=90 && percentage<=100) {
            System.out.println("Grade: A+");
        }else if(percentage>=80 && percentage<90) {
            System.out.println("Grade: A");
        }else if(percentage>=70 && percentage<80) {
            System.out.println("Grade: B");
        }else if(percentage>=60 && percentage<70) {
            System.out.println("Grade: C");
        }else {
            System.out.println("Fail");
        }
    }
}
