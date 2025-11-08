package ict._22.ClassNames;

public class NumberConversionClass {
    public String toBinary(int n) {
        return Integer.toBinaryString(n);
    }
    public String toDecimal(String s, int base) {
        return String.valueOf(Integer.parseInt(s, base));
    }
    public String toHex(int n) {
        return Integer.toHexString(n).toUpperCase();
    }
    public String toOctal(int n) {
        return Integer.toOctalString(n);
    }
}
