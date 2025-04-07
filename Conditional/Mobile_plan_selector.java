package Conditional;

import java.util.Scanner;

 public class Mobile_plan_selector {

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number of minutes used: ");
    int minutes = scanner.nextInt();

    System.out.print("Enter the number of text messages sent: ");
    int messages = scanner.nextInt();

    double planACost = calculatePlanACost(minutes, messages);
    double planBCost = calculatePlanBCost(minutes, messages);
    double planCCost = 60.0; 

    System.out.printf("Plan A cost: $%.2f%n", planACost);
    System.out.printf("Plan B cost: $%.2f%n", planBCost);
    System.out.printf("Plan C cost: $%.2f%n", planCCost);

    String recommendedPlan = determineRecommendedPlan(planACost, planBCost, planCCost);
    System.out.println("Recommended plan: " + recommendedPlan);

    scanner.close();
}

public static double calculatePlanACost(int minutes, int messages) {
    double cost = 25.0;

    if (minutes > 100) {
        cost += (minutes - 100) * 0.10;
    }

    if (messages > 100) {
        cost += (messages - 100) * 0.05;
    }

    return cost;
}

public static double calculatePlanBCost(int minutes, int messages) {
    double cost = 40.0;

    if (minutes > 200) {
        cost += (minutes - 200) * 0.08;
    }

    if (messages > 200) {
        cost += (messages - 200) * 0.03;
    }

    return cost;
}

public static String determineRecommendedPlan(double planACost, double planBCost, double planCCost) {
    if (planACost <= planBCost && planACost <= planCCost) {
        return "Plan A";
    } else if (planBCost <= planACost && planBCost <= planCCost) {
        return "Plan B";
    } else {
        return "Plan C";
    }

    }
    
}
