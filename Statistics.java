import java.util.Scanner;

public class Statistics {
    public static void calculateMeanAndStdDev() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = scanner.nextInt();
        double[] numbers = new double[n];

        double sum = 0;
        for (int i = 0; i < n; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextDouble();
            sum += numbers[i];
        }

        double mean = sum / n;
        double variance = 0;
        for (double num : numbers) {
            variance += Math.pow(num - mean, 2);
        }
        variance /= n;
        double stdDev = Math.sqrt(variance);

        System.out.println("Mean: " + mean);
        System.out.println("Standard Deviation: " + stdDev);
    }

    public static void calculateVariance() {
        System.out.println("Variance is calculated in Mean & Standard Deviation.");
    }
}
