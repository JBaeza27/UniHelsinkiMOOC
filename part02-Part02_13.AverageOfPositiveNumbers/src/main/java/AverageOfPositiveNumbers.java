
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalNumbers = 0;
        double sum = 0;
        int value;

        while (true) {
            value = Integer.valueOf(scanner.nextLine());

            if (value > 0) {
                sum = value + sum;
                totalNumbers++;
            } else if (value == 0) {
                break;
            }
        }
        if (sum != 0) {
            System.out.println(sum / totalNumbers);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
