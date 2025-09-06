// 5. Remove all spaces from a String (without using replaceAll) ■ Input: "I love Java" → Output: "IloveJava
public class Program5 {
    public static void main(String[] args) {
        String s = "I love Java";
        String newString = "";
        
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ' ') {
                newString = newString + s.charAt(i);
            }
        }
        System.out.println(newString);
    }
}
