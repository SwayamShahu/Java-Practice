// 3. Count vowels and consonants in a String ■ Input: "Java Programming" → Output: Vowels = 5, Consonants = 10
public class Program3 {
    public static void main(String[] args) {
        String s = "Java Programming";
        s = s.trim(); // removes leading/trailing spaces
        int vowels = 0, consonants = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Only consider alphabets
            if (Character.isLetter(ch)) {
                if (ch == 'a' || ch == 'A' || ch == 'e' || ch == 'E' ||
                    ch == 'i' || ch == 'I' || ch == 'o' || ch == 'O' ||
                    ch == 'u' || ch == 'U') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowel Count: " + vowels + " and Consonant Count: " + consonants);
    }
}

