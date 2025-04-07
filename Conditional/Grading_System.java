package Conditional;

import java.util.Scanner;

public class Grading_System {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks of subject 1");
        int sub1=sc.nextInt();
        System.out.println("enter marks of subject 2");

        int sub2=sc.nextInt();
        System.out.println("enter marks of subject 3");

        int sub3=sc.nextInt();
        double avg=(sub1+sub2+sub3)/3;
        System.out.println("Average: "+avg);

        if(avg>=90){
            System.out.println("Grade A");
        }
        else if(avg>=80){
            System.out.println("Grade B");
        }
        else if(avg>=70){
            System.out.println("Grade C");
        }
        else if(avg>=60){
            System.out.println("Grade D");
        }
        else{
            System.out.println("Grade F");
        }
            
    
    }
    
}
