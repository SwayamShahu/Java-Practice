// 2. Check if a String is Palindrome ■ Input: "madam" → Output: true ■ Input: "hello" → Output: false

public class Program2{
    public static void main(String[] args) {
        String s = "hello";
        String reverseString = new String("");
        for (int i = s.length() - 1; i >= 0; i--) {
            reverseString = reverseString + s.charAt(i);
        }
        System.out.println(s.equals(reverseString)); 
    }
}
