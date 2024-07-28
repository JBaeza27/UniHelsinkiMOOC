
import java.util.Scanner;
import java.util.ArrayList;

public class NumberOfStrings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        
        while(true){
            String input = scanner.nextLine();
            
            if(input.contains("end")){
                break;
            }
            list.add(input);
            
        }
        System.out.println(list.size());
    }
}
