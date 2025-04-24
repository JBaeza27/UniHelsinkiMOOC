 
import java.util.Scanner;
 
public class LiquidContainers {
 
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
 
        int firstContainer = 0;
        int secondContainer = 0;
 
        while (true) {
            System.out.println("First: " + firstContainer + "/100");
            System.out.println("Second: " + secondContainer + "/100");
 
            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }
 
            String[] parts = input.split(" ");
            input = parts[0];
            int amount = Integer.valueOf(parts[1]);
            
            
            if(input.equals("add") && amount > 0){
                firstContainer += amount;
                if(firstContainer > 100){
                    firstContainer = 100;
                }
            }
            
            if(input.equals("move") && amount > 0){
                if(amount > firstContainer){
                    amount = firstContainer;
                }
                firstContainer -= amount;
                secondContainer += amount;
             
                 if(secondContainer > 100){
                    secondContainer = 100;
                }
            }
            
              if(input.equals("remove") && amount > 0){
                secondContainer -= amount;

               
                 if(secondContainer < 0){
                    secondContainer = 0;
                }
            }
        }
    }
}