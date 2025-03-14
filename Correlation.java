import java.util.Scanner;

public class Correlation {
    public static void calculate() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of data points: ");
        int n = scanner.nextInt();
        double[] x = new double[n];
        double[] y = new double[n];

        System.out.println("Enter values for X:");
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextDouble();
        }

        System.out.println("Enter values for Y:");
        for (int i = 0; i < n; i++) {
            y[i] = scanner.nextDouble();
        }

        double sumX = 0, sumY = 0, sumXY = 0, sumX2 = 0, sumY2 = 0;
        for (int i = 0; i < n; i++) {
            sumX += x[i];
            sumY += y[i];
            sumXY += x[i] * y[i];
            sumX2 += x[i] * x[i];
            sumY2 += y[i] * y[i];
        }

        double correlation = (n * sumXY - sumX * sumY) /
                             (Math.sqrt((n * sumX2 - sumX * sumX) * (n * sumY2 - sumY * sumY)));

        System.out.println("Correlation Coefficient: " + correlation);
    }
}
