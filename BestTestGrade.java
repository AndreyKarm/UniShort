import java.util.Scanner;

public class BestTestGrade {
    public static void main(String[] param) {
        Scanner scanner = new Scanner(System.in);
        sequance(scanner);
        scanner.close();
    }   

    // print function is used to write 'print' instead of 'System.out.println'
    public static String print(String message){
        System.out.println(message); // prints message
        return message;
    }

    // sequance method consists of all logic, asks question and print out results
    public static void sequance(Scanner scanner){
        /*
         To identify question and answer, they are getting id's like 'question1_1' and 'answer2_3'
         
         There first number stands for test number, for expamle in test 1 section, all 'answer' and 'question'
         variables have 1 at the start.

         The second number stands for kind of test the user took, for example 'question1_1' stands for 'theory',
         '2' stands for dry run, and '3' stands for program. 

         So by looking at any of these variables it's easy to understand test number and kind of test user took.
         So, for example if we take 'question1_1' it's easy to understand it's 1st test and user took theory grade.
         As another expalme I'll take 'answer2_3', it's easy to understand that user took test 2nd test and did program test.
         */


        // Test 1 part
        // Question 1
        final String question1_1 = print("Test 1: What is your 1st theory grade? 1)A+ 2)A 3)B 4)C 5)D 6)F 7)G");
        final int answer1_1 = check_input(scanner, Integer.parseInt(scanner.nextLine()), question1_1);

        // Question 2
        final String question1_2 = print("Test 1: What is your 1st dry run grade? 1)A+ 2)A 3)B 4)C 5)D 6)F 7)G");
        final int answer1_2 = check_input(scanner, Integer.parseInt(scanner.nextLine()), question1_2);

        // Question 3
        final String question1_3 = print("Test 1: What is your 1st program grade? 1)A+ 2)A 3)B 4)C 5)D 6)F 7)G");
        final int answer1_3 = check_input(scanner, Integer.parseInt(scanner.nextLine()), question1_3);

        // Translates inputs into String
        print("Your grades were " + trans_to_str(answer1_1) + " " + trans_to_str(answer1_2) + " " + trans_to_str(answer1_3));

        // Test 2 part
        // Question 4
        final String question2_1 = print("Test 2: What is your 2nd theory grade? 1)A+ 2)A 3)B 4)C 5)D 6)F 7)G");
        final int answer2_1 = check_input(scanner, Integer.parseInt(scanner.nextLine()), question2_1);

        // Question 5
        final String question2_2 = print("Test 2: What is your 2nd dry run grade? 1)A+ 2)A 3)B 4)C 5)D 6)F 7)G");
        final int answer2_2 = check_input(scanner, Integer.parseInt(scanner.nextLine()), question2_2);

        // Question 6
        final String question2_3 = print("Test 2: What is your 2nd program grade? 1)A+ 2)A 3)B 4)C 5)D 6)F 7)G");
        final int answer2_3 = check_input(scanner, Integer.parseInt(scanner.nextLine()), question2_3);

        // Translates inputs into String
        print("Your grades were " + trans_to_str(answer2_1) + " " + trans_to_str(answer2_2) + " " + trans_to_str(answer2_3));

        // Final grades, compares 2 numbers and gives the biggest
        final int best_1_grade = best_grade_compare(answer1_1, answer2_1); // Compares theory grades from test 1 and 2
        final int best_2_grade = best_grade_compare(answer1_2, answer2_2); // Compares dry run grades from test 1 and 2
        final int best_3_grade = best_grade_compare(answer1_3, answer2_3); // Compares program grades from test 1 and 2

        // prints out final grades
        print("Your final three test grades are Theory: " + trans_to_str(best_1_grade) + ", Dry Run: " + trans_to_str(best_2_grade) + ", Program: " + trans_to_str(best_3_grade));
    }

    // method best_frade_compare compares two inputs and gives biggest as a result
    public static int best_grade_compare(int answer1, int answer2){
        if (answer1 >= answer2){
            return answer2;
        }
        else{
            return answer1;
        }
    }

    // method check_input checks if inputed answer from user is correct.
    public static int check_input(Scanner scanner, int input, String question){
        if (input <= 0 || input >= 8){  // checks if the input is smaller or equals to 0. Or is bigger or equals to 8. If yes, then the input is incorrect.
            print("Wrong input! Try again!");
            print(question);
            return input = check_input(scanner, Integer.parseInt(scanner.nextLine()), question);
        }
        else{ // Else the input is incorrect
            return input;
        }
    }

    // method trans_to_string converts inputed number into a string so it could be displayed to the user.
    public static String trans_to_str1(int answer){
        if (answer == 1){
            return "A+";
        }
        else if (answer == 2){
            return "A";
        }
        else if (answer == 3){
            return "B";
        }
        else if (answer == 4){
            return "C";
        }
        else if (answer == 5){
            return "D";
        }
        else if (answer == 6){
            return "F";
        }
        else if (answer == 7){
            return "G";
        }
        else{
            return null;
        }
    }

    public static String trans_to_str(int answer){
        if (answer<8 || answer>1){
            String[] grades = new String[] {"A+", "A", "B", "C", "D", "F", "G"};
            return grades[answer-1];
        }
        else{
            System.out.println("Error!");
            return null;
        }
    }
}