public class Main {
    public static void main(String[] args) {
        Employee emp1 = new FullTimeEmployee("John", 5000);
        Employee emp2 = new PartTimeEmployee("Jane", 20, 100);

        System.out.println(emp1.name + " Salary: $" + emp1.calculateSalary());
        System.out.println(emp2.name + " Salary: $" + emp2.calculateSalary());
    }
}
