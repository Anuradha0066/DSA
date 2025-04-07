package loops;

import java.util.Scanner;

public class ques5 {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("enter a number");
//         int n=sc.nextInt();
//         if(n<=0){
//             System.out.println("please enter positive intger");
//         }
//         else{
//             fibonacci(n);
//         }
//         sc.close();
//     }
//    public static void fibonacci(int n){
//     int a=0,b=1;
//     System.out.println(n);

//     for(int i=1;i<=n;i++){
//         System.out.println(a);
//        int nextterm = a+b;
//        a=b;
//        b= nextterm;
//     }
//     System.out.println();
//    }
    
// }



// public static void main(String[] args) {
//     Scanner scanner = new Scanner(System.in);

//     System.out.print("Enter the number of terms (n): ");
//     int n = scanner.nextInt();

//     if (n <= 0) {
//         System.out.println("Please enter a positive integer.");
//     } else {
//         printques5(n);
//     }

//     scanner.close();
// }

// public static void printques5(int n) {
//     int firstTerm = 0, secondTerm = 1;

//     System.out.print("Fibonacci Series up to " + n + " terms: ");

//     for (int i = 1; i <= n; ++i) {
//         System.out.print(firstTerm + " ");

//         int nextTerm = firstTerm + secondTerm;
//         firstTerm = secondTerm;
//         secondTerm = nextTerm;
//     }
//     System.out.println(); //add a newline for better output.
// }
// }


public static void main(String[] args) {
    int n = 3; // Number of terms to print
    printFibonacci(n);
}

public static void printFibonacci(int n) {
    int a = 0, b = 1;

    System.out.print("Fibonacci Series: ");

    for (int i = 0; i < n; i++) {
        System.out.print(a + " ");
        int temp = a;
        a = b;
        b = temp + b;
    }
    System.out.println(); //newline for clean output.
}
}