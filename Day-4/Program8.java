/*
7. Check if the 3rd Bit is Set ✅
Write a boolean expression that evaluates to true if the 3rd bit (counting from the right, starting at index 0) of an integer is a 1, and false otherwise. For example, in the number 13 (binary 1101), the 3rd bit is a 1.
*/
public class Program8 {
    public static void main(String[] args) {
        int a = 9;
        System.out.println(((a & 8) == 8));
    }
    
}
