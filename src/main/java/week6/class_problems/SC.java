package week6.class_problems;

class Student {
    String name;
    double attendance;
    static String collegeName = "SRM Institute of Science and Technology";
    static int studentCount = 0;

    Student(String name, double attendance) {
        this.name = name;
        this.attendance = attendance;
        studentCount++;
    }

    static void printCollegeInfo() {
        System.out.println(collegeName);
        System.out.println("Students created: " + studentCount);
    }
}

public class SC {
    public static void main(String[] args) {
        new Student("Ravi", 90);
        new Student("Anitha", 85);
        Student.printCollegeInfo();
    }
}