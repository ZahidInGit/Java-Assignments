package validationapp;

public class Main {
    public static void main(String[] args) {
        Validator v = new Validator();
        
        try {
            v.checkDetails(25, "IT");
            v.checkDetails(15, "Sales");
        } catch (AgeException e) {
            System.out.println("Caught Error: " + e.getMessage());
        }
    }
}
