package Conditional;

import java.util.Scanner;

public class Library {
    public static void main(String[] args){
     Scanner sc=new Scanner(System.in);

     System.out.println("Enter the no. of days overdue");
     int days=sc.nextInt();

     System.out.println("enter book type");
     String booktype=sc.next();
     
     
     
     if(booktype.equals("regular")){
        System.out.println(days*0.50);
     }
     else if(booktype.equals("fiction")){
        System.out.println(days*0.75);
     }
     else if(booktype.equals("reference"))
     {
        System.out.println("no late fees");

     }
     else{
        System.out.println("invalid book type");
     }

    }
}
