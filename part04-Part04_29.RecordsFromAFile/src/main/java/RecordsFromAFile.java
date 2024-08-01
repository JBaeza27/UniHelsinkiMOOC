
import java.nio.file.Paths;
import java.util.Scanner;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Name of file?");
        String fileName = scanner.nextLine();
        
        try(Scanner readingFile = new Scanner(Paths.get(fileName))){
            
            while(readingFile.hasNextLine()){
                
                String line = readingFile.nextLine(); /*Rememeber we use readingFile here |not scanner| because then we 
                                                        wouldn't be directed to the path of the fileName!*/
                String[] parts = line.split(",");
                
                String name = parts[0];
                int age = Integer.valueOf(parts[1]);

                if (age == 1) {
                    System.out.println(name + ", age: " + age + " year");
                } else {
                    System.out.println(name + ", age: " + age + " years");
                }
            }
        } catch (Exception e) {
            System.out.println("Error " + e);
        }
    }
}
