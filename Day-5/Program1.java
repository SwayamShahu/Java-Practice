/*
Q`1. The Grade Classifier
     Write a program that takes an integer score (0-100) and prints the corresponding letter grade. 90-100: "A" 80-89: "B" 70-79: "C" 60-69: "D" 0-59: "F"
     Sample Input: 85 Sample Output: B
*/
public class Program1 {
    public static void main(String[] args) {
        int score = 95;
        if(score>= 90 && score <= 100){
            System.out.println("A");
        }else if(score < 90 && score >= 80){
            System.out.println("B");
        }else if(score >= 70  && score < 80){
            System.out.println("C");
        }else if(score >= 60 && score < 70){
            System.out.println("D");
        }else{
            System.out.println("F");
        }
    }
}
