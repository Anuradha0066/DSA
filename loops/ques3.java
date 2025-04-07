package loops;

import java.util.Scanner;

public class ques3 {
    
    
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = input.nextInt();
            input.close(); // Close the scanner
    
            if (num <= 1) {
                System.out.println(num + " is not a prime number.");
            } else {
                boolean isPrime = true; // Assume it's prime
    
                // Optimized loop (checking up to sqrt(num))
                for (int i = 2; i <= Math.sqrt(num); i++) {
                    if (num % i == 0) {
                        isPrime = false; // Found a divisor
                        break; // No need to check further
                    }
                }
    
                if (isPrime) {
                    System.out.println(num + " is a prime number.");
                } else {
                    System.out.println(num + " is not a prime number.");
                }
            }
        }
    }