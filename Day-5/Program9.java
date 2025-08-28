/*
  Q9. Weekend or Weekday?
  Takes day name, prints Weekday or Weekend using switch.
  Sample Input: "Sunday" Sample Output: Weekend
*/
public class Program9 {
    public static void main(String[] args) {
        String day = "Tuesday";
        switch (day) {
            case "Sunday": case "Saturday":
                System.out.println("Weekend");
                break;
            case "Monday": case "Tuesday": case "Wednesday": case "Thursday": case "Friday":
                System.out.println("Weekday");
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
