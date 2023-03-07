package Assignment.Conditionals;
import java.util.*;
public class Ques1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length:");
        int l = sc.nextInt();
        System.out.println("Enter breadth:");
        int b = sc.nextInt();
        if(l==b){
            System.out.println("It is a square");
        }
        else{
            System.out.println("It is not a square");
        }
    }
}
