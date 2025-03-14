import java.util.Random;
import java.util.Scanner;

public class RandomNumberGenerator {
    public static void generate() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of random values: ");
        int count = scanner.nextInt();

        Random rand = new Random();
        System.out.println("Random Numbers:");
        for (int i = 0; i < count; i++) {
            System.out.println(rand.nextInt(100)); // Random number between 0 and 99
        }
    }
}
