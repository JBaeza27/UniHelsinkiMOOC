
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Here you can try out the combined functionality of your classes
        TodoList list = new TodoList();
        
        Scanner scanner = new Scanner(System.in);
        UserInterface interfacing = new UserInterface(list, scanner);
        
        interfacing.start();
        
    }
}
