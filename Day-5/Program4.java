/* 
  4. Days in a Month (Switch with Fall-through)
     Take month (1-12) and print days. Not leap year. 31 days: 1,3,5,7,8,10,12 30 days: 4,6,9,11 28 days: 2
     Sample Input: 9 Sample Output: This month has 30 days.
 */

public class Program4 {
    public static void main(String[] args) {
        int month = 5;
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                System.out.println("31 days");
                break;
            case 4: case  6: case 9: case 11:
                System.out.println("30 days");
                break;
            case 2:
                System.out.println("28 Days");
                break;
            default:
                break;
        }
    }
}
