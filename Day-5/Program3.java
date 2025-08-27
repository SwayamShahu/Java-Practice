/* 
Q3. Nested Age and License Check
   Check if a person can rent a car: - At least 25 years old -> approved. - If under 25 -> must be 21+ AND have waiver.
   Sample Input: age = 22, hasWaiver = true Sample Output: Car rental approved with waiver.
 */

public class Program3 {
    public static void main(String[] args) {
        int age = 25;
        boolean waiver = true;
        if(age >= 25){
            System.out.println("Car rental approved.");
        }else{
            if(age > 21 && waiver == true){
                System.out.println("Car rental approved with waiver.");
            }else{
                System.out.println("Car rental denied.");
            }
        }
    }
}
