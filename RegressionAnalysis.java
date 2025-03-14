import org.apache.commons.math3.stat.regression.SimpleRegression;
import java.util.Scanner;

public class RegressionAnalysis {
    public static void performRegression() {
        Scanner scanner = new Scanner(System.in);
        SimpleRegression regression = new SimpleRegression();

        System.out.print("Enter number of data points: ");
        int n = scanner.nextInt();
        double[][] data = new double[n][2];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter x" + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Enter y" + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();
            regression.addData(data[i][0], data[i][1]);
        }

        System.out.println("Slope: " + regression.getSlope());
        System.out.println("Intercept: " + regression.getIntercept());
        System.out.println("R-Squared: " + regression.getRSquare());
    }
}
