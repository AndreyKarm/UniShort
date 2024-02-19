package old;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Sequance(scanner);
        scanner.close();
    }

    public static void Sequance(Scanner scanner){
        int pointNum = askPoints(scanner);
        final int pointNumOld = pointNum;
        System.out.println("Enter integer coordinates.");
        int[] Array = coordinates(pointNum, scanner);
        double calculationX = ((double)Array[0]/(double)pointNumOld);
        double calculationY = ((double)Array[1]/(double)pointNumOld);

        System.out.println("The mid-point is: ("+calculationX+", "+calculationY+").");
    }

    public static int askPoints(Scanner scanner){
        System.out.println("How many points? (>0)");
        String pointNum = scanner.nextLine();
        if (isInteger(pointNum)){
            int pointNumInt = Integer.parseInt(pointNum);
            if (pointNumInt >= 0){
                return pointNumInt;
            }
            else{
                System.out.println("Wrong input!");
                return askPoints(scanner);
            }
        }
        else{
            System.out.println("Wrong input!");
            return askPoints(scanner);
        }
    }

    public static int[] coordinates(int pointNum, Scanner scanner){
        int[] Array = new int[2];
        int cycle = 1;
        int x = 0;
        int y = 0;
        while (!(pointNum == 0)){
            String xQuestion = "x_" + cycle;
            String questionX = ("Enter " + xQuestion);
            System.out.println(questionX);
            String xInput = scanner.nextLine();
            int outputX = checkInt(xInput, questionX, scanner);
            String yQuestion = "y_" + cycle;
            String questionY = ("Enter " + yQuestion);
            System.out.println(questionY);
            String yInput = scanner.nextLine();
            int outputY = checkInt(yInput, questionY, scanner);
            x += outputX;
            y += outputY;
            pointNum--;
            cycle++;
        }
        Array[0] = x;
        Array[1] = y;
        return Array;
    }

    public static int checkInt(String input, String question, Scanner scanner){
        if (isInteger(input)){
            return Integer.parseInt(input);
        }
        else{
            System.out.println("Wrong input!");
            System.out.println(question);
            String answer = scanner.nextLine();
            return checkInt(answer, question, scanner);
        }
    }

    // method isInteger checks if given number is integer, if yes returns true, else false.
    public static boolean isInteger(String input) {
        Pattern pattern = Pattern.compile("^-?[0-9]+"); // Checks if input integer characters are within 0-9 range
        Matcher matcher = pattern.matcher(input);
        boolean result = matcher.find();
        return result;
    } // isInteger
}