
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        float  sum = 0, timesInputed = 0;
        
        while(true){
            int input = Integer.valueOf(scanner.nextLine());
            
            if(input == -1){
                break;
            }
            list.add(input);
        }
        for(int i: list){
            sum += i;
            timesInputed++;
        }
        
        System.out.println("Average:" +  sum/timesInputed);
        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
    }
}
