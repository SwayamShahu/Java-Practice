// 1. Reverse a String ■ Input: "Hello" → Output: "olleH"

public class Program1{
    public static void main(String[] args) {
        String s = "Hello";
        String newString = new String("");
        for (int i = s.length() - 1; i >= 0; i--) {
            newString = newString + s.charAt(i);
        }
        System.out.println(newString);
    }
}