
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double sum = 0;
        int totalNumbers = 0;
        
        while (true){
            System.out.println("Give a number: ");
            int value = Integer.valueOf(scanner.nextLine());
            
            if(value > 0 || value < 0){
                sum = value + sum;
                totalNumbers = totalNumbers + 1;
            }
            if(value == 0){
                break;
            }  
        }
        System.out.println("Average of the numbers: " + (sum / totalNumbers));
    }
}
