/* 
    1) Largest & Smallest element
    Idea: scan once, track min and max. Edge cases: all negative; all equal; single element. Time: O(n) • Space: O(1).
*/

public  class Program1{
    public static void main(String args[]){
        int arr[] = {1,7,8,10,2,4}; 
        int s = arr[0];
        int l = arr[0];

        for(int i=1; i< arr.length; i++){
            if(arr[i] > l){
                l = arr[i];
            }
            if(arr[i] < s){
                s = arr[i];
            }
        }

        System.out.println("Largest number is: " +l);
        System.out.println("Smallest number is: " +s);
    }
}