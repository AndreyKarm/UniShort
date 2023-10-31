import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Class that contains all the candidate information
class Candidate {
    String name;
    String party;
    int votes;
}

public class Candidates {
    public static void main (String[] param){
        Scanner scanner = new Scanner(System.in);
        Sequance(scanner);
        scanner.close();
    }   

    // method Sequance makes all the logic 
    public static void Sequance(Scanner scanner){
        Candidate candidate1 = new Candidate(); // Questions for Candidate #1
        Questions(scanner, candidate1);
        Candidate candidate2 = new Candidate(); // Questions for Candidate #2
        Questions(scanner, candidate2);
        if(candidate1.votes >= candidate2.votes){ // Comparison of 2 candidates. if #1 has more votes, message gets outputted
            System.out.println( candidate1.name + " of " + candidate1.party + " is declared the winner with " + candidate1.votes + " votes.");
        }
        else{ // Else Candidate #2 wins
            System.out.println( candidate2.name + " of " + candidate2.party + " is declared the winner with " + candidate2.votes + " votes.");
        }
        System.out.println("They have a majority of " + (candidate1.votes+candidate2.votes));
    }

    // method Questions asks user questions about candidates 
    public static void Questions(Scanner scanner, Candidate candidate){
        System.out.println("What is the name of the first candidate?");
        String name = scanner.nextLine();
        System.out.println("What party did they stand for?");
        String party = scanner.nextLine();
        int votes = QuestionNumber(scanner, candidate);
        creatCandidate(name, party, votes);
    }

    public static Candidate creatCandidate(String name, String party, int votes){
        Candidate candidate = new Candidate();
        candidate.name = name;
        candidate.party = party;
        candidate.votes = votes;

        return candidate;
    }

    // method QuestionNumber asks user for a number of votes and checks if the inputed value is a number
    public static int QuestionNumber(Scanner scanner, Candidate candidate){
        System.out.println("How many votes did they gain?");
        String answer = scanner.nextLine();
        if (isInteger(answer)){ // If input is integer result gets returned
            int result = Integer.parseInt(answer);
            return result;
        }
        else{ // Else asks user to try again
            System.out.println("Wrong input!");
            QuestionNumber(scanner, candidate);
            int response = QuestionNumber(scanner, candidate);
            return response;
        }
    }

    // method isInteger checks if given number is integer, if yes returns true, else false.
    public static boolean isInteger(String input) {
        Pattern pattern = Pattern.compile("^[0-9]"); // Checks if input integer characters are within 0-9 range
        Matcher matcher = pattern.matcher(input);
        boolean result = matcher.find();
        return result;
    }
}