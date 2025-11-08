package ict._22.ClassNames;

public class SumClass {
    public double getSum() {
        double sum = 0;
        for (double i = 1.0; i >= 0.01; i -= 0.1) sum += i;
        return Math.round(sum * 100.0) / 100.0;
    }
}
