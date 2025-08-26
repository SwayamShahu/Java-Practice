public class Program3 {
    public static void main(String[] args) {
        // 1. Integer types
        byte b = 100; // 1 byte, range: -128 to 127
        short s = 30000; // 2 bytes, range: -32768 to 32767
        int i = 123456; // 4 bytes, common integer type
        long l = 123456789L; // 8 bytes, need 'L' at the end

        // 2. Floating-point types
        float f = 3.14f; // 4 bytes, need 'f' at the end
        double d = 3.1415926535; // 8 bytes, default for decimals

        // 3. Character type
        char c = 'A'; // 2 bytes, single character inside ''

        // 4. Boolean type
        boolean flag = true; // 1 bit (JVM handles as 1 byte)

        // 5. String (not primitive, but very common)
        String str = "Hello Java";

        // Printing all values
        System.out.println("Byte value: " + b);
        System.out.println("Short value: " + s);
        System.out.println("Int value: " + i);
        System.out.println("Long value: " + l);
        System.out.println("Float value: " + f);
        System.out.println("Double value: " + d);
        System.out.println("Char value: " + c);
        System.out.println("Boolean value: " + flag);
        System.out.println("String value: " + str);

        // Extra: Some operations
        System.out.println("Int + Float: " + (i + f));
        System.out.println("Char as number: " + (int) c); // ASCII value of 'A'
        System.out.println("Boolean check: " + (flag && false));
    }

}
