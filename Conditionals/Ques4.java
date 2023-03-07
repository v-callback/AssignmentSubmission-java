package Assignment.Conditionals;
import java.util.*;
public class Ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int num1 = sc.nextInt();
        if(num1 < 0){
            System.out.println("This number is negative and skipped");
        }
    }
}
