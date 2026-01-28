public class Main {
    public static void main(String[] args) {
        Student s1 = new Student(101, "Alice", 3.8);
        System.out.println("Student: " + s1.getName() + ", CGPA: " + s1.getCgpa());

        Student s2 = new Student(102, "Bob", 5.0);
        System.out.println("Student: " + s2.getName() + ", CGPA: " + s2.getCgpa());
    }
}
