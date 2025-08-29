/*
    6) Find the factorial of a number
    Factorial of n is product of all numbers from 1 to n. We use a loop to multiply step by step.
    Sample Input: Input: 5
    Sample Output: Output: 120
*/

public class Program6 {
    public static void main(String[] args) {
        int num = 5;
        int fact = 1;

        while(num > 0){
            fact =  fact * num;
            num --;
        }
        System.out.println(fact);
    }
}
