package Assignment.Conditionals;
import java.util.*;
public class Ques3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cost Price: ");
        int cost_price = sc.nextInt();
        System.out.print("Enter Selling Price: ");
        int selling_price = sc.nextInt();

        if(cost_price < selling_price){
            int profit = selling_price - cost_price;
            System.out.println("Profit = " + profit);
        }
        else{
            int loss = cost_price - selling_price;
            System.out.println("Loss = " + loss);
        }
    }
}
