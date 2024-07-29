
import java.nio.file.Paths;
import java.util.Scanner;

public class IsItInTheFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Name of the file:");
        String file = scanner.nextLine();

        System.out.println("Search for:");
        String searchedFor = scanner.nextLine();
        
        
        boolean found = false;
        
        

        try ( Scanner readingInput = new Scanner(Paths.get(file))) {
            while (readingInput.hasNextLine()) {
                String row = readingInput.nextLine();

                if (searchedFor.equals(row)) {
                    found = true;
                    break;
                }
            }
            if (found) { //if the boolean is true it prints Found! That's why it is set to false
                System.out.println("Found!");
            } else {
                System.out.println("Not found");
            }
        } catch (Exception e) {
            System.out.println("Reading the file " + file + "failed");
        }
    }
}
