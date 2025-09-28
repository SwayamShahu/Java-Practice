// Parse a list of String numbers (like ["10", "20", "30"]) and find their sum.
public class Program3 {
    public static void main(String[] args) {
        String[] strArr = {"10","20","30"};

        int sum = 0;
        for (String string : strArr) {
            sum = sum + Integer.valueOf(string);
        }
        System.out.println(sum);
    }
}
