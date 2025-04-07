package Logical_Operators;

public class Employee_eligibility {
    public static void main(String[] args) {
        int hoursWorked=20;
        boolean FullTime=true;

        if (hoursWorked > 40 && FullTime==true) {
            System.out.println("Eligible for overtime pay.");
        } else {
            System.out.println("Not eligible for overtime pay.");
        }
    }
}

