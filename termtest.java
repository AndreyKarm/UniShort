import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class termtest{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        Sequance(scanner);
    }

    public static void Sequance(Scanner scanner){
    
    }

    public static String askQuestionStr(Scanner scanner, String question){
        System.out.println(question);
        String answer = scanner.nextLine();
        return answer;
    }

    public static int checkInt(String input, String question, Scanner scanner) {
        if (isInteger(input)) {
            return Integer.parseInt(input);
        } else {
            System.out.println("Wrong input!");
            System.out.println(question);
            String answer = scanner.nextLine();
            return checkInt(answer, question, scanner);
        }
    }

    // method isInteger checks if given number is integer, if yes returns true, else
    // false.
    public static boolean isInteger(String input) {
        Pattern pattern = Pattern.compile("^-?[0-9]+"); // Checks if input integer characters are within 0-9 range
        Matcher matcher = pattern.matcher(input);
        boolean result = matcher.find();
        return result;
    } // isInteger

    public static int Random(int numMin, int numMax){
        Random rand = new Random();
        int result = rand.nextInt((numMax - numMin) + numMin);
        return result;
    }

    public static int askPoints(Scanner scanner) {
        System.out.println("How many points? (>0)");
        String pointNum = scanner.nextLine();
        if (isInteger(pointNum)) {
            int pointNumInt = Integer.parseInt(pointNum);
            if (pointNumInt >= 0) {
                return pointNumInt;
            } else {
                System.out.println("Wrong input!");
                return askPoints(scanner);
            }
        } else {
            System.out.println("Wrong input!");
            return askPoints(scanner);
        }
    }
}