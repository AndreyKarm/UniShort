package old;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Class that contains all the candidate information
class Candidate {
    String name;
    String party;
    int votes;
} // END Candidate

public class Candidates {
    public static void main (String[] param){
        Scanner scanner = new Scanner(System.in);
        Sequance(scanner);
        scanner.close();
    }   

    public static Candidate createCandidate(String name, String party, int votes){
        Candidate candidate = new Candidate();
        candidate.name = name;
        candidate.party = party;
        candidate.votes = votes;
        return candidate;
    }

    // method Sequance makes all the logic 
    public static void Sequance(Scanner scanner){
        int candidateNumber = 1;
        
        Candidate candidate1 = new Candidate();
        String[] a = Questions(scanner, candidate1, candidateNumber);
        String name_a = a[0];
        String party_a = a[1];
        int votes_a = Integer.parseInt(a[2]);
        createCandidate(name_a, party_a, votes_a);
        candidateNumber++;

        Candidate candidate2 = new Candidate();
        String[] b = Questions(scanner, candidate2, candidateNumber);
        String name_b = b[0];
        String party_b = b[1];
        int votes_b = Integer.parseInt(b[2]);
        createCandidate(name_b, party_b, votes_b);

        
        if(votes_a >= votes_b){ // Comparison of 2 candidates. if #1 has more votes, message gets outputted
            System.out.println( name_a + " of " + party_a + " is declared the winner with " + votes_a + " votes.");
        }
        else{ // Else Candidate #2 wins
            System.out.println( name_b + " of " + party_b + " is declared the winner with " + votes_b + " votes.");
        }
        System.out.println("They have a majority of " + (votes_a+votes_b));
    } // END Sequance

    // method Questions asks user questions about candidates 
    public static String[] Questions(Scanner scanner, Candidate candidate, int candidateNumber){
        String plural;
        if (candidateNumber == 1){
            plural = "first";
        }
        else {
            plural = "second";
        }
        System.out.println("What is the name of the " + plural + " candidate?");
        String name = scanner.nextLine();
        System.out.println("What party did they stand for?");
        String party = scanner.nextLine();
        String votes = Integer.toString(QuestionNumber(scanner, candidate));
        return new String[]{name, party, votes};
    } // END Questions

    // method QuestionNumber asks user for a number of votes and checks if the inputed value is a number
    public static int QuestionNumber(Scanner scanner, Candidate candidate){
        String question = ("How many votes did they gain?");
        System.out.println(question);
        String answer = scanner.nextLine();
        if (isInteger(answer)){ // If input is integer result gets returned
            int result = Integer.parseInt(answer);
            return result;
        }
        else{ // Else asks user to try again
            while(true){
                System.out.println("Wrong input!");
                System.out.println(question);
                String answerAgain = scanner.nextLine();
                if (isInteger(answerAgain)){ // If input is integer result gets returned
                    int result = Integer.parseInt(answerAgain);
                    return result;
                }
                else{
                    continue;
                }
            }
        }
    } // END QuestionNumber

    // method isInteger checks if given number is integer, if yes returns true, else false.
    public static boolean isInteger(String input) {
        Pattern pattern = Pattern.compile("^[0-9]"); // Checks if input integer characters are within 0-9 range
        Matcher matcher = pattern.matcher(input);
        boolean result = matcher.find();
        return result;
    } // isInteger
}