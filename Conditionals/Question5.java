package Assignment.Conditionals;
import java.util.*;
public class Question5 {
    public static void main(String[] args) {
        char operator;
        double num1 = 0;
        double num2 = 0;
        double ans;

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter an operator(+, - , *, /)");
        operator = sc.next().charAt(0);
        System.out.println("Enter two number");
        num1 = sc.nextDouble();
        num2 = sc.nextDouble();
        switch (operator) {
            case '+':
            ans = num1 + num2;
            System.out.println(ans);
            break;

            case '-':
            ans = num1 - num2;
            System.out.println(ans);
            break;

            case '*':
            ans = num1 * num2;
            System.out.println(ans);
            break;

            case '/':
            ans = num1 / num2;
            System.out.println(ans);
            break;
            default:
            System.out.println("Invalid Entered value!!");

        }

    }
}