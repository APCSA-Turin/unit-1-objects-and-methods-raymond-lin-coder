public class Student {
    private String name;
    private double gpa;
    public Student(String StudentName, double StudentGpa) {
        name = StudentName;
        gpa = StudentGpa;
    }
    public void introduce() {
        System.out.println("Hello, my name is " + name + " and my GPA is " + gpa + ".");
    }
    public void honorRoll() {
        if (gpa >= 3.5) {
            System.out.println(name + " is on the honor roll.");
        } else {
            System.out.println(name + " is not on the honor roll.");
        }
    }
}
