// 3. Swap Two Numbers Using Bitwise XOR
public class Program4 {
    public static void main(String[] args) {
        int a = 5;
        int b = 8;
        System.out.println("a = " + a + " b = " + b);
        b = a ^ b;
        a = a ^ b;
        b = a ^ b;
        System.out.println("a = " + a + " b = " + b);
    }
}
