/*
   2) Palindrome number
   A number is palindrome if it reads the same forward and backward. We reverse the number and compare it with the original.
   Sample Input: Input: 121
   Sample Output: Output: Palindrom
*/
public class Program2 {
    public static void main(String[] args) {
        int num = 121;
        int copy = num;
        int digit;
        int reverse = 0;

        while (num > 0) {
            digit = num % 10;
            // System.out.println(digit);
            reverse = reverse * 10 + digit;
            // System.out.println(reverse);
            num = num / 10;
        }
        if(copy == reverse){
            System.out.println("Palindrom");
        }else{
            System.out.println("Not Palindrom");
        }
    }
}
