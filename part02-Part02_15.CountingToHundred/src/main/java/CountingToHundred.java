
import java.util.Scanner;

public class CountingToHundred {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int givenNumber = Integer.valueOf(scanner.nextLine());
        
        while(givenNumber <= 100){
            System.out.println(givenNumber);
            givenNumber++;
        }
    }
}
