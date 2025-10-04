public class StudentRunner {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 3.8);
        student1.introduce();
        student1.honorRoll();
        Student student2 = new Student("Jack", 3.4);
        student2.introduce();
        student2.honorRoll();
    }
}
