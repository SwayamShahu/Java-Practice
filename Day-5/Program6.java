/*
    Q6. Traffic Light Simulator
    Takes String color (case-insensitive). Use switch: RED -> Stop YELLOW -> Prepare to stop GREEN -> Go
    Sample Input: "yellow" Sample Output: Prepare to stop
 */
public class Program6 {
    public static void main(String[] args) {
        String color = "RED";
        switch (color){
            case "RED": case "red":
            System.out.println("Stop");
            break;
            case "YELLOW": case "yellow":
            System.out.println("Prepare to stop");
            break;
            case "GREEN": case "green":
            System.out.println("Go");
            break;
            default:
            System.out.println("Wrong");
        }
    }
}
