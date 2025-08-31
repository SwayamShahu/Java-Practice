/* 
    2) Reverse an array (in-place)
    Time: O(n) • Space: O(1)
*/
import java.util.*;
public class Program2 {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};

        for(int i = 0,j = arr.length - 1; i < j; i++ , j--){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
