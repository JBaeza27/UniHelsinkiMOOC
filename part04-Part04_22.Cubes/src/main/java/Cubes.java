
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true){
            String input = scanner.nextLine();
            
            if(input.contains("end")){
                break;
            }
      
            int number = Integer.valueOf(input); /*converts input to valueOf number which is int.
                                                   we do this to consider one total 'input'.
                                                                             */
                                                     
            System.out.println(number * number * number);
        }
    }
}
