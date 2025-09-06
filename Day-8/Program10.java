// 10. Find the longest word in a sentence ■ Input: "I love programming in Java" → Output: "programming"

public class Program10 {
    public static void main(String[] args) {
        String s = "Java   is   powerful"; 
        s = s.trim(); 

        String[] arr = s.split("\\s+");  

        String longest = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (longest.length() < arr[i].length()) {
                longest = arr[i];
            }
        }

        System.out.println(longest);
    }
}
