import java.util.Scanner;

public class RiverPolutionCount {
    public static void main(String[] param) {
        Scanner scanner = new Scanner(System.in);
        sequance(scanner);
        scanner.close();
    }

    public static void print(String message){
        System.out.println(message);
    }

    public static void sequance(Scanner scanner){
        final int numer_of_samples = 5;
        int biggest_var = 0;
        int measurment = 0;

        for(int i = 1; i <= numer_of_samples; i++){
            print("Sample " + i + ": What was the water quality measurment in CFU/ml?");
            int answer = Integer.parseInt(scanner.nextLine());
            if (answer >= biggest_var){
                biggest_var = answer;
            }
            measurment += answer;
        }

        print("The worst water quality today was " + biggest_var + " CFU/ml.");
        print("The average water quality today was " + Math.round(measurment/numer_of_samples) + " CFU/ml.");
        print("The quality is " + convert_to_str(biggest_var) + " today.");
    }
    
    // convert_to_str function that takes biggest number as input and returns coresponding string.
    public static String convert_to_str(int variable){
        if (variable <= 200){
            return "GOOD";
        }
        else if (variable <= 400){
            return "SUFFICIENT";
        }
        else {
            return "POOR";
        }
    } // END convert_to_str function
}