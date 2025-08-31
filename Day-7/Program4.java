/* 
    4) Second largest
*/

/* 
    4) Second largest (distinct, fixed)
*/


public class Program4 {
    public static void main(String[] args) {
        int arr[] = {1, 6, 8, 9, 9, 10, 6};

        int l = arr[0];
        int sl = -1; 

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > l) {
                sl = l;
                l = arr[i];
            } else if (arr[i] < l) {
                if (sl == -1 || arr[i] > sl) {
                    sl = arr[i];
                }
            }
        }

        if (sl == -1) {
            System.out.println("Second largest not found");
        } else {
            System.out.println("Second largest: " + sl);
        }
    }
}
