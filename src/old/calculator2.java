package old;
import java.util.Scanner;

public class calculator2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sequance(scanner);
        scanner.close();
    }
    
    public static void Sequance(Scanner scanner){
        System.out.println("Please input the expression");
        String input = scanner.nextLine();
        System.out.println("The answer is " + input);
    }
}
