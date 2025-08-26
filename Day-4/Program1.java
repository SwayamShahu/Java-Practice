// Sample program to demonstrate all 6 types of operators in Java
public class Program1 {
    public static void main(String[] args) {
        
        // 1. Arithmetic Operators (+, -, *, /, %)
        int a = 10, b = 3;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b)); // 10 + 3 = 13
        System.out.println("a - b = " + (a - b)); // 10 - 3 = 7
        System.out.println("a * b = " + (a * b)); // 10 * 3 = 30
        System.out.println("a / b = " + (a / b)); // 10 / 3 = 3 (integer division)
        System.out.println("a % b = " + (a % b)); // 10 % 3 = 1 (remainder)

        // 2. Relational (Comparison) Operators (==, !=, >, <, >=, <=)
        System.out.println("\nRelational Operators:");
        System.out.println("a == b : " + (a == b)); // false
        System.out.println("a != b : " + (a != b)); // true
        System.out.println("a > b  : " + (a > b));  // true
        System.out.println("a < b  : " + (a < b));  // false
        System.out.println("a >= b : " + (a >= b)); // true
        System.out.println("a <= b : " + (a <= b)); // false

        // 3. Logical Operators (&&, ||, !)
        boolean x = true, y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("x && y = " + (x && y)); // false
        System.out.println("x || y = " + (x || y)); // true
        System.out.println("!x     = " + (!x));     // false

        // 4. Increment / Decrement Operators (++, --)
        int num = 5;
        System.out.println("\nIncrement / Decrement Operators:");
        System.out.println("num = " + num);     // 5
        System.out.println("num++ = " + (num++)); // Post-increment → prints 5, then num becomes 6
        System.out.println("++num = " + (++num)); // Pre-increment  → num becomes 7, then prints 7
        System.out.println("num-- = " + (num--)); // Post-decrement → prints 7, then num becomes 6
        System.out.println("--num = " + (--num)); // Pre-decrement  → num becomes 5, then prints 5

        // 5. Assignment Operators (=, +=, -=, *=, /=, %=)
        int c = 10;
        System.out.println("\nAssignment Operators:");
        System.out.println("c = " + c);   // 10
        c += 5;  // c = c + 5
        System.out.println("c += 5 → " + c); // 15
        c -= 3;  // c = c - 3
        System.out.println("c -= 3 → " + c); // 12
        c *= 2;  // c = c * 2
        System.out.println("c *= 2 → " + c); // 24
        c /= 4;  // c = c / 4
        System.out.println("c /= 4 → " + c); // 6
        c %= 4;  // c = c % 4
        System.out.println("c %= 4 → " + c); // 2

        // 6. Bitwise Operators (&, |, ^, ~, <<, >>, >>>)
        int p = 5, q = 3; // Binary of 5 → 0101, 3 → 0011
        System.out.println("\nBitwise Operators:");
        System.out.println("p & q  = " + (p & q));  // 0101 & 0011 = 0001 → 1
        System.out.println("p | q  = " + (p | q));  // 0101 | 0011 = 0111 → 7
        System.out.println("p ^ q  = " + (p ^ q));  // 0101 ^ 0011 = 0110 → 6
        System.out.println("~p     = " + (~p));     // bitwise NOT of 0101 → ...1010 (2's complement) = -6
        System.out.println("p << 1 = " + (p << 1)); // 0101 << 1 → 1010 → 10
        System.out.println("p >> 1 = " + (p >> 1)); // 0101 >> 1 → 0010 → 2
        System.out.println("p >>> 1 = " + (p >>> 1)); // unsigned right shift → 2
    }
}
