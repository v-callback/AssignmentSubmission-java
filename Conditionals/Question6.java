package Assignment.Conditionals;
import java.util.*;
public class Question6 {
    public static void main(String[] args) {
        float marks;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Marks: ");
        marks=sc.nextFloat();
        if(marks <= 100 && marks >= 90) {
            System.out.println("Your Grade is A+");
        }
        else if(marks <= 90 && marks >= 80)  {
            System.out.println("Your grade is A");
        }
        else if(marks <= 80 && marks >= 70)  {
            System.out.println("Your grade is B+");
        }
        else if(marks <= 70 && marks >= 60)  {
            System.out.println("Your grade is B");
        }
        else if(marks <= 60 && marks >= 50)  {
            System.out.println("Your grade is C");
        }
        else if(marks <= 50 && marks >= 40)  {
            System.out.println("Your grade is D");
        }
        else if(marks <= 40 && marks >= 30)  {
            System.out.println("Your grade is E");
        }
        else {
            System.out.println("Your grade is F");
        }
    }
}
