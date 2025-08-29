/* 
    7) Print Fibonacci series up to n terms
    Fibonacci starts with 0,1 and next terms are sum of previous two terms. Loop is used to generate sequence.
    Sample Input: Input: 7
    Sample Output: Output: 0 1 1 2 3 5 8
*/

public class Program7 {
    public static void main(String[] args) {
        int n = 10;
        int f = 0;
        int s = 1;
        int next;
        System.out.print(f + " ");
        System.out.print(s + " ");

        n = n -2;
        while(n > 0){
            next = f + s;
            System.out.print(next + " ");  
            f = s;
            s = next;
            n--;
        }

    }
}
