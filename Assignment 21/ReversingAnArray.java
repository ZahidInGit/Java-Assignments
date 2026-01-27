public class ArrayUtils {
    public static void reverse(double[] arr) {
        int start = 0;
        int end = arr.length - 1;

        // Swap elements from the outside in
        while (start < end) {
            double temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        double[] data = {5.8, 2.6, 9.0, 3.4, 7.1};
        reverse(data);
        
        // Print the result to verify
        for (double val : data) {
            System.out.print(val + " ");
        }
    }
}
