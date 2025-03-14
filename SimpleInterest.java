import java.util.Scanner;

public class SimpleInterest {
    public static void calculate() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter principal amount: ");
        double principal = scanner.nextDouble();

        System.out.print("Enter interest rate (% per year): ");
        double rate = scanner.nextDouble();

        System.out.print("Enter time (years): ");
        double time = scanner.nextDouble();

        double interest = (principal * rate * time) / 100;
        System.out.println("Simple Interest: " + interest);
    }
}
