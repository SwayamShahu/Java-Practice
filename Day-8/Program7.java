// 7. Check if two Strings are Anagrams (same letters, different order) ■ Input: "listen", "silent" → Output: true

import java.util.Arrays;

public class Program7 {
    public static void main(String[] args) {
        String first = "listen";
        String second = "silent";

        // Check length first
        if (first.length() == second.length()) {
            // Convert to char array
            char[] arr1 = first.toCharArray();
            char[] arr2 = second.toCharArray();

            // Sort both arrays
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            // Compare
            if (Arrays.equals(arr1, arr2)) {
                System.out.println("Anagram: true");
            } else {
                System.out.println("Anagram: false");
            }
        } else {
            System.out.println("Anagram: false");
        }
    }
}
