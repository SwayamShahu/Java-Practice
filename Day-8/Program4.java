// 4. Find the frequency of a character in a String ■ Input: "programming", char = 'm' → Output: 2

public class Program4 {
    public static void main(String[] args) {
        String s = "programming";
        char target = 'm';   // character to check
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == target) {
                count++;
            }
        }
        System.out.println("Frequency of '" + target + "' in \"" + s + "\" = " + count);
    }
}
