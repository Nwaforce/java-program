import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nSelect an operation:");
            System.out.println("1. Simple Interest");
            System.out.println("2. Mean & Standard Deviation");
            System.out.println("3. Variance");
            System.out.println("4. Correlation");
            System.out.println("5. Random Number Generator");
            System.out.println("6. Quadratic Equation");
            System.out.println("7. Regression");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1 -> SimpleInterest.calculate();
                case 2 -> Statistics.calculateMeanAndStdDev();
                case 3 -> Statistics.calculateVariance();
                case 4 -> Correlation.calculate();
                case 5 -> RandomNumberGenerator.generate();
                case 6 -> QuadraticEquation.solve();
                case 7 -> RegressionAnalysis.performRegression();
                case 8 -> {
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Invalid choice, try again.");
            }
        }
    }
}
