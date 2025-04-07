package Logical_Operators;

public class Triangle_validity {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 5;
        if((a + b > c) && (a + c > b) && (b + c > a))  {
            System.out.println("These sides can form a valid triangle.");
        } else {
            System.out.println("These sides cannot form a valid triangle.");
        }
        
    }
}
