
import java.util.ArrayList;
import java.util.Scanner;

public class OnlyTheseNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                break;
            }

            numbers.add(number);
        }
        System.out.println("From where? ");
        int given1 = Integer.valueOf(scanner.nextLine());
        System.out.println("To where? ");
        int given2 = Integer.valueOf(scanner.nextLine());
        
       while(given2 >= given1){
           System.out.println(numbers.get(given1));
           given1++;
       }
        

    }
}
