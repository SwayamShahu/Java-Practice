/*
Challenge 4: The Student Roster
This challenge involves managing a collection of data (an array) inside an object.

Task:
1. Create a Student class that can store grades and calculate an average.
    - Class Name: Student
    - Fields:
        String name;
        int[] grades; (An array to hold the student's grades)
3. Methods:
    - setGrade(int subjectIndex, int grade): A void method that sets the grade for a subject at a specific index in the grades array. Include a check to make sure the index is valid.
    - getAverageGrade(): This method should calculate and return the average of all the grades in the grades array. You will need to use a loop to sum the grades.
    - printSummary(): A void method that prints the student's name and their calculated average grade.
4. In your main method: Create a Student object for 3 subjects, set their grades using setGrade(), and then call printSummary().

*/

class Student{
    String name;
    int[] grade;

    public void setGrade(int subjectIndex, int grade){
        if (subjectIndex < this.grade.length) {
            this.grade[subjectIndex] = grade;
        }
    }

    public double getAverageGrade(){
        int avg = 0;
        for (int i : grade) {
            avg = avg + i;
        }
        return avg/grade.length;
    }

    public void printSummary(){
        System.out.println("Name: " + this.name);
        System.out.println("Average Grade: " + this.getAverageGrade());
    }
}
public class Program4 {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.name = "Sam";
        obj.grade = new int[3];

        obj.setGrade(0, 90);
        obj.setGrade(1, 79);
        obj.setGrade(2, 81);

        System.out.println("Average Grade: " + obj.getAverageGrade());

        obj.printSummary();
    }
}
