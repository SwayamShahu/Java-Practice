/* 
    3) Count number of digits
    We divide the number by 10 in a loop until it becomes 0. The number of divisions done gives the number of digits.
    Sample Input: Input: 98765
    Sample Output: Output: 5 digits
*/

public class Program3 {
    public static void main(String[] args) {
        int num = 123;
        int count = 0;

        while (num > 0) {
            count ++;
            num = num / 10;
        }

        System.out.println(count + " digits");      
    }
}
