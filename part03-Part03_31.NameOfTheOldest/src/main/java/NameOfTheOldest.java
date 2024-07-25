
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age, n = 0;
        String name = "";

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] array = input.split(","); //array is refering to lily, 2

            age = Integer.valueOf(array[1]); // since the 2 is the second after the split of , that is why we use 1

            if (age > n) {
                n = age;
                name = array[0];
            }
            System.out.println("Name of the oldest" + name);
        }

    }
}
