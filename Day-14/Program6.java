// Implement a method that checks if a string is numeric using wrapper classes.
public class Program6 {

    public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false; 
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isNumeric("12345")); 
        System.out.println(isNumeric("12a3"));  
        System.out.println(isNumeric(""));     
    }
}
