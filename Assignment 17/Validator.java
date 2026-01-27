package validationapp;

public class Validator {
    public void checkDetails(int age, String dept) throws AgeException {
        if (age < 18 || age > 60) {
            throw new AgeException("Invalid Age: Must be between 18 and 60");
        }
        if (!dept.equalsIgnoreCase("IT") && !dept.equalsIgnoreCase("HR")) {
            throw new AgeException("Invalid Dept: Must be IT or HR");
        }
        System.out.println("Validation Successful for " + dept);
    }
}
