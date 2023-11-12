/* ***************************************
  @author    Andrii Karmazinskyi
  @SID       230978409
  @date      31 October 2023
  @version   1


   ****************************************/

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LapTimes {
    public static void main(String [] param){
        Scanner scanner = new Scanner(System.in);
        Sequance(scanner);
        scanner.close();
    } // END Main

    // method Sequance consists of all logic
    public static void Sequance(Scanner scanner){
        final int laps = 5; // number of laps
        int total = 0;
        int previousAnswer = 0;
        for (int i = 1; i < laps+1; i++){
            System.out.println("What was lap time " + i + " (in s)?"); // for loops asks questions and respondes acordingly
            String answer = (scanner.nextLine());
            if (checkAnswer(answer, i, total, previousAnswer)){ // if checkAnswer returns true, program stops with message from checkAnswer
                break;
            }
            else if (!(isInteger(answer))){ // if isInteger returns true, it gets converted to false and it means that user inputed not numbers, and asks again for input
                System.out.println("Wrong input!");
                i -= 1;
                continue;
            }
            total += Integer.parseInt(answer);
            previousAnswer = Integer.parseInt(answer);
        }
    } // END Sequance

    // method checkAnswer checks if user response is "XXX" or it prints difference 
    public static boolean checkAnswer(String answer, int i, int total, int previousAnswer){
        if (answer.equals("XXX")){ // if user inputed "XXX" program sends a message and later stops.
            System.out.println("You did " + (i-1) + " laps. Your total time today was " + total + "s");
            return true;
        }
        else if (isInteger(answer)&&!(i == 1)){ // if it's the first question, it doesn't compare
            System.out.println("Difference " + Math.abs(Integer.parseInt(answer) - previousAnswer) + " seconds");
            return false;
        }
        return false;
    } // END checkAnswer

    // isIntegers checks if inputed String consists of numbers
    public static boolean isInteger(String input) {
        Pattern pattern = Pattern.compile("^[0-9]"); // Checks if input integer characters are within 0-9 range
        Matcher matcher = pattern.matcher(input);
        boolean result = matcher.find();
        return result;
    } // END isInteger
}