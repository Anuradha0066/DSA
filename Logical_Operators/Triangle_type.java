package Logical_Operators;

public class Triangle_type {
    public static void main(String[] args) {
        int a=3;
        int b=3;
        int c=2;
        if (a == b && b == c) {
            System.out.println("Equilateral triangle");
        } else if (a == b || a == c || b == c) {
            System.out.println("Isosceles triangle");
        } else {
            System.out.println("Scalene triangle");
        }
    }
}
