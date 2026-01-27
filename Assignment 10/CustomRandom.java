public class CustomRandom {
    
    private static long seed = System.currentTimeMillis();

    private static long transform(long x, long n) {
        if (x == 0) x = 1; 
        return Math.abs(x * (n / x - 1));
    }

    public static int nextInt(int bound) {
        seed = (seed * 1103515245L + 12345L) & 0x7fffffff;
        long result = transform(seed % bound, bound);
        return (int) (result % bound);
    }

    public static double nextDouble() {
        seed = (seed * 1103515245L + 12345L) & 0x7fffffff;
        return (double) seed / Integer.MAX_VALUE;
    }

    public static float nextFloat() {
        return (float) nextDouble();
    }

    public static int nextInt(int min, int max) {
        return nextInt(max - min) + min;
    }
}
