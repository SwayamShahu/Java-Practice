// 6. Find the first non-repeated character in a String ■ Input: "swiss" → Output: 'w'
public class Program6 {
    public static void main(String[] args) {
        String s = "swiss";

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            boolean flag = false;
            for (int j = 0; j < s.length(); j++) {
                if (i != j && s.charAt(j) == c) {
                    flag = true;
                }
            }
            if (flag == false) {
                System.out.println(c);
                return;
            }
        }
    }
}
