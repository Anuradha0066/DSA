package Logical_Operators;

public class Quadrant {
    public static void main(String[] args) {
        int x=-3;
        int y=4;

         if (x > 0 && y > 0) {
            System.out.println(" lies in the First Quadrant.");
        } else if (x < 0 && y > 0) {
            System.out.println("lies in the Second Quadrant.");
        } else if (x < 0 && y < 0) {
            System.out.println("lies in the Third Quadrant.");
        } else if (x > 0 && y < 0) {
            System.out.println("lies in the Fourth Quadrant.");
        } else if (x == 0 && y != 0) {
            System.out.println(" lies on an axis.");
        } else if (x != 0 && y == 0) {
            System.out.println (" lies on an axis");
        }
         else {
            System.out.println(" origin.");
        }
    }
}
