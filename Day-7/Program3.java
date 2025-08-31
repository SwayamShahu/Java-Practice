/* 
    3) Check if array is sorted (ascending)
    Time: O(n) • Space: O(1).
*/
public class Program3 {
    public static void main(String[] args) {
        int arr[] = {1}; 

        if (arr.length == 0 || arr.length == 1) {
            System.out.println("Array is in ascending order !!!!");
            return;
        }

        boolean flag = true;
        
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                System.out.println("Array is not in ascending order");
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("Array is in ascending order !!!!");
        }
    }
}
