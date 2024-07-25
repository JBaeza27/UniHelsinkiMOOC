
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = "";
        int sum = 0 , count = 0, birthYear = 0, nameLength = 0, temp =0;
        
        while (true){
            String input = scanner.nextLine();
            
            if(input.equals("")){
                break;
            }
            
            String[] details = input.split(",");
            sum += Integer.valueOf(details[1]);
            count++;
            nameLength = details[0].length();
            
            if (temp < nameLength){
                temp = nameLength;
                name = details[0];
            }
        }
        System.out.println("Longest name: " + name);
        System.out.println("Average of birth years: " + 1.0 * sum / count);

    }
}
