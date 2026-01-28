public class Student {
    private int id;
    private String name;
    private double cgpa;

    public Student(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        setCgpa(cgpa);
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public double getCgpa() { return cgpa; }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }

    public void setCgpa(double cgpa) {
        if (cgpa >= 0.0 && cgpa <= 4.0) {
            this.cgpa = cgpa;
        } else {
            System.out.println("Error: CGPA must be between 0.0 and 4.0. Setting default 0.0.");
            this.cgpa = 0.0;
        }
    }
}
