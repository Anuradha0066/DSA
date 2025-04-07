package Conditional;

import java.util.Scanner;

public class Discount_calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println();
        System.out.println("Enter the total price");
        double price=sc.nextDouble();
        System.out.println("enter number of items");
        int item=sc.nextInt();

        if(price>100 && item>=5){
            double discount=price/10;
            System.out.println("discount: "+discount);
           double new_cost=price -discount;
            System.out.println("After discount Total cost: "+ new_cost );
        }
       else if(50<price && price<100){
        double discount=price/20;
        
            System.out.println("discount: "+discount);
            double new_cost=price -discount;
            System.out.println("After discount Total cost: "+ new_cost );
       }
       else{
        System.out.println("no discount");
       }
    }
    
}
