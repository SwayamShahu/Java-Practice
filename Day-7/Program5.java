/* 
    5) Find duplicates in an unsorted array
    Approach: Sort + compare neighbors
*/

import java.util.Arrays;

public class Program5 {
    public static void main(String[] args) {
        int arr[] = {9, 4, 5, 7, 2, 7, 1, 5, 10};
        
        Arrays.sort(arr); 
        System.out.println("Sorted: " + Arrays.toString(arr));
        
        System.out.println("Duplicates:");
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] == arr[i - 1]) {
                if (i == 1 || arr[i] != arr[i - 2]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
