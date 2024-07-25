
import java.util.Scanner;

public class SumOfASequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int i = 0, total = 0;
        
        
        System.out.println("Last number?");
        int number = Integer.valueOf(scanner.nextLine());
        
        
        while(number >= i){
            total += i;
            i++;
        }
        
        System.out.println("The sum is " + total);
        
     
        
        
    
    }
}
