public class FactorionChecker {

    public int getFactorial(int n) {
        if (n == 0 || n == 1) return 1;
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public boolean isFactorion(int number) {
        int temp = number;
        int sum = 0;
        
        while (temp > 0) {
            int digit = temp % 10;
            sum += getFactorial(digit);
            temp /= 10;
        }
        
        return sum == number;
    }
}
