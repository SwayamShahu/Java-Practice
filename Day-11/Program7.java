// 7. Sortable Interface: Define an interface Sortable with a method sort() that takes an array of integers. Create two separate classes, BubbleSort and SelectionSort, that implement the Sortable interface and provide their own sorting algorithm implementation in the sort() method.
interface Sortable{
    void sort(int[] arr);
}
class BubbleSort implements Sortable{
    public void sort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1]) {
                    // swap arr[j] and arr[j+1]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
    }
}
class SelectionSort implements Sortable{
    public void sort(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[minIndex])
                    minIndex = j;
            // swap arr[i] and arr[minIndex]
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }
}   
public class Program7 {
    public static void main(String[] args) {
        int[] arr1 = {64, 34, 25, 12, 22, 11, 90};
        int[] arr2 = {64, 34, 25, 12, 22, 11, 90};

        Sortable bubbleSort = new BubbleSort();
        bubbleSort.sort(arr1);
        System.out.println("Sorted array using Bubble Sort:");
        for (int num : arr1) {
            System.out.print(num + " ");
        }
        System.out.println();

        Sortable selectionSort = new SelectionSort();
        selectionSort.sort(arr2);
        System.out.println("Sorted array using Selection Sort:");
        for (int num : arr2) {
            System.out.print(num + " ");
        }
    }
}
