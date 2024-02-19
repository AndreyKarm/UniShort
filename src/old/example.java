package old;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class example {
    // main creates Scanner and passes it to sequance
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        sequence(scanner);
        scanner.close();
    } // END main 

    // start sequance, executes all the program logic
    public static void sequence(Scanner scanner) {
        Map<String, String> stringMap = new HashMap<>(); // StringMap creation
        String stop = "XXX";
        String key;

        while (true) { // writing user input into StringMap
            key = askKey(scanner);
            if (key.equals(stop)) { // If "XXX" stop program
                break;
            } else {
                String value = askMap(scanner, key); // mapping key
                stringMap.put(key, value); // mapping map to the key
            }
        }

        // Outputs all the keys and maps
        for (Map.Entry<String, String> entry : stringMap.entrySet()) { // for every key and map to variable entry in StringMap
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    } //END  sequance 

    // start askKey asks user for key and returns userinput
    public static String askKey(Scanner scanner) {
        System.out.println("Enter new map key or XXX to end: ");
        return scanner.nextLine();
    }// END askKey

    // start askMap asks user for map and returns map to map to the key
    public static String askMap(Scanner scanner, String key) {
        System.out.println("Enter map value for key " + key + ": ");
        return scanner.nextLine();
    } // END askMap
}