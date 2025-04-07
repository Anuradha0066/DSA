package Conditional;

import java.util.Scanner;

public class Shipping_cost_calc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Weight:");
        int weight=sc.nextInt();
        System.out.println("Enter Distance:");
        int distance=sc.nextInt();

        if(weight<=10 && distance<=100){
            System.out.println("cost is $5");}
            else if(weight>10 && weight<20 && distance>100 && distance<500)
        {System.out.println("cost is $10");

        }
      else{
        System.out.println("cost is $20");
      }

    }
    
}
