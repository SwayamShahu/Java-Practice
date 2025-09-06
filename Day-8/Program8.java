// 8. Count the number of words in a String ■ Input: "Java is powerful" → Output: 3

public class Program8 {
    public static void main(String[] args) {
        String s = "Java   is   powerful"; 
        s = s.trim(); 

        String[] arr = s.split("\\s+");  

        System.out.println("Word Count: " + arr.length);
    }
}
