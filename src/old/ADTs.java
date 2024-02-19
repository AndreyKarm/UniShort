package old;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Restaurant class stores values
class Restaurant{
    String name;
    int stepfree;
    int toilets;
    int parking;
} // END Restaurant

class ADTs{
    // main executes question() method with all logic, also creates scanner and closes
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Questions(scanner);
        scanner.close();
    } // END main

    //  createRestaurant method stores values from user
    public static Restaurant createRestaurant(String name, int stepfree, int toilets, int parking){
        Restaurant restaurant = new Restaurant();

        restaurant.name = name;
        restaurant.stepfree = stepfree;
        restaurant.toilets = toilets;
        restaurant.parking = parking;

        return restaurant;
    } // END createRestaurant

    // Questions ask user questions and stores info
    public static void Questions(Scanner scanner){
        System.out.println("What is the name of the restaurant?");
        String restaurant_name = scanner.nextLine();

        String question1 = ("What is the nextLine for step-free access?");
        System.out.println(question1);
        String restaurant_stepfreeStr = scanner.nextLine();
        int restaurant_stepfree = IsStrInt(restaurant_stepfreeStr, question1, scanner);

        String question2 = ("What is the score for disabled toilets?");
        System.out.println(question2);
        String restaurant_toiletsStr = scanner.nextLine();
        int restaurant_toilets = IsStrInt(restaurant_toiletsStr, question1, scanner);

        String question3 = ("What is the score for disabled parking?");
        System.out.println(question3);
        String restaurant_parkingStr = scanner.nextLine();
        int restaurant_parking = IsStrInt(restaurant_parkingStr, question1, scanner);

        Result(createRestaurant(restaurant_name, restaurant_stepfree, restaurant_toilets, restaurant_parking));
        System.out.println("Another (y/n)?");
        String userAnswer = scanner.nextLine();
        if (userAnswer.equals("y")){
            Questions(scanner);
        }
    } // END Questions

    public static String getName(Restaurant rest){
        return rest.name;
    }

    public static int getStepfree(Restaurant rest){
        return rest.stepfree;
    }

    public static int getToilets(Restaurant rest){
        return rest.toilets;
    }

    public static int getParking(Restaurant rest){
        return rest.parking;
    }

    // Result checks given info about restaurant and gives rating
    public static void Result(Restaurant rest){
        String rating;
        int total_score = getStepfree(rest) + getToilets(rest) + getParking(rest);
        if (total_score == 9){
            rating = "OUSTANDING";
        }
        else if (total_score > 5){
            rating = "GOOD";
        }
        else{
            rating = "POOR";
        }
        System.out.println(getName(rest) + " has a disability rating of " + rating + ".");
        return;
    } // END Result

    // IsStrInt checks if input is int returns int, else asks user again
    public static int IsStrInt(String input, String question, Scanner scanner){
        if(isInteger(input)){
            return Integer.parseInt(input);
        }
        else{
            System.out.println("Wrong input!");
            System.out.println(question);
            String answer = scanner.nextLine();
            IsStrInt(answer, question, scanner);
            return Integer.parseInt(answer);
        }
    } // END IsStrInt

    // isInteger checks if input is integer
    public static boolean isInteger(String input) {
        Pattern pattern = Pattern.compile("^[0-9]"); // Checks if input integer characters are within 0-9 range
        Matcher matcher = pattern.matcher(input);
        boolean result = matcher.find();
        return result;
    } // END isInteger
}