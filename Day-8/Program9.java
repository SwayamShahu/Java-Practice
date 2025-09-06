// 9. Check if one String is a rotation of another ■ Input: "abcd", "cdab" → Output: tru
public class Program9 {
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "cdab";

        if (s1.length() == s2.length() && (s1 + s1).contains(s2)) {
            System.out.println("Rotation: true");
        } else {
            System.out.println("Rotation: false");
        }
    }
}
