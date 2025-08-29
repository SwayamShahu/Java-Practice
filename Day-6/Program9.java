/* 
    9) Find the largest digit in a number
    Extract digits using %10 and compare with max. Update max accordingly.
    Sample Input: Input: 5832
    Sample Output: Output: Largest digit = 8
*/
public class Program9 {
    public static void main(String[] args) {
        int num = 872;
        boolean firstDigit = true;
        int largest = 0;
        while(num > 0){
            if(firstDigit){
                largest = num % 10;
                firstDigit = !firstDigit;
            }else{
                int digit = num % 10;
                if(digit > largest){
                    largest = digit;
                }
            }
            num = num /10;
        }
        System.out.println(largest);
    }
}
