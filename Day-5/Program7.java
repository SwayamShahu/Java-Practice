/*
    7. The Triangle Type Identifier
    Given three sides a, b, c: - Equilateral: all equal - Isosceles: two equal - Scalene: all different
    Sample Input: a=7, b=7, c=4 Sample Output: Isosceles Triangle
*/
public class Program7 {
    public static void main(String[] args) {
        int a,b,c;
        a = 5;
        b = 7;
        c = 7;
        if (a == b && b == c) {
            System.out.println("Equilateral ");
        }else if((a == b && b != c) || (a==c && c != b)){
            System.out.println("Isosceles Triangle");
        }else{
            System.out.println("Scalene Triangle");
        }
    }
}
