/* 
    6) Rotate array right by k (without extra functions)
*/

public class Program6 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
        int k = 2;
        int n = arr.length;

        k = k % n;
        int rotated[] = new int[n];

        for (int i = 0; i < n; i++) {
            rotated[(i + k) % n] = arr[i];
        }

        System.out.println("Array after rotating right by " + k + ":");
        for (int num : rotated) {
            System.out.print(num + " ");
        }
    }
}
