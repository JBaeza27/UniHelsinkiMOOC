
import java.nio.file.Paths;
import java.util.Scanner;

public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        
        
        System.out.print("File? ");
        String file = scanner.nextLine();
        System.out.print("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.print("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        
        try(Scanner readingFile = new Scanner(Paths.get(file))){
            while(readingFile.hasNextLine()){
                int number = Integer.valueOf(readingFile.nextLine()); /*reading next value in file as a integer
           fileReader.nextLine(); return type is originally a string. we swith it to integer to read the it as an integer.
                We can check the type of the mehod .nextLine() by shift clicking it.
*/
              
                if(number <= upperBound && number >= lowerBound){
                    count++;
                }
            } 
        }catch(Exception e){
            System.out.println("Error reading " + e);
        }
        System.out.println("Numbers: " + count);
    }

}
