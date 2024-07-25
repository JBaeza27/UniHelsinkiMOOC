import java.util.Scanner;

public class RepeatingBreakingAndRemembering {
 
    public static void main(String[] args) {
         
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int intReference = 0; // Declaring intReference to keep track of the number of inputs
        double avg = 0;
        int even = 0;
        int odd = 0;
        int mount = 0;
        
        while(true){
            System.out.println("Give numbers:");
            int input = Integer.valueOf(scanner.nextLine());
            if(input == -1){
                break;
            }
            if(input > 0){
                sum += input;
                intReference++; // Incrementing intReference for each valid input
                mount++;
            }
            if(input % 2 == 0){
                even++;
            } else {
                odd++;
            }
            avg = (1.0 * sum / mount);
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + intReference); // Printing intReference instead of count
        System.out.println("Average: " + avg);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
