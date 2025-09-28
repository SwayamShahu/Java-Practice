// Write a program to autobox an array of int to Integer objects.
public class Program2 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Object[] objArr = new Object[arr.length];
        int j = 0;
        for (int i : arr) {
            objArr[j] = Integer.valueOf(i);
            j++;
        }
    }
}
