// Convert a double array to a Double array (autoboxing) and calculate the average.
public class Program5 {
    public static void main(String[] args) {
        double sum = 0;
        double[] arr = {2090.2,30.34,5012.59};
        Double[] doubleArray = new Double[arr.length];
        int j = 0;
        for (double d : arr) {
            sum = sum + d;
            doubleArray[j] = Double.valueOf(d);
            j++;
        }
        System.out.println(sum/arr.length);
    }
}
