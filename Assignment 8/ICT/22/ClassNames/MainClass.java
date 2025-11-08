package ict._22.ClassNames;

public class MainClass {
    static SumClass sum = new SumClass();
    static DivisorMultipleClass dm = new DivisorMultipleClass();
    static NumberConversionClass nc = new NumberConversionClass();

    public static void main(String[] args) {
        CustomPrintClass.a.pr("Sum: " + sum.getSum());
        CustomPrintClass.a.pr("GCD(24,18): " + dm.gcd(24,18));
        CustomPrintClass.a.pr("LCM(24,18): " + dm.lcm(24,18));
        CustomPrintClass.a.pr("Binary of 25: " + nc.toBinary(25));
        CustomPrintClass.a.pr("Decimal of 11001 (bin): " + nc.toDecimal("11001", 2));
        CustomPrintClass.a.pr("Hex of 255: " + nc.toHex(255));
        CustomPrintClass.a.pr("Octal of 64: " + nc.toOctal(64));
    }
}
