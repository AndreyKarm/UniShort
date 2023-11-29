import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

class StringMap {
    private Map<String, String> map;

    public StringMap() {
        this.map = new HashMap<>();
    }

    public void put(String key, String value) {
        map.put(key, value);
    }

    public boolean containsKey(String key) {
        return map.containsKey(key);
    }

    public String get(String key) {
        return map.getOrDefault(key, "Default"); // You can change "Default" to any default value
    }

    public void printMapContents() {
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public Entry<String, String>[] entrySet() {
        return null;
    }
}

public class StringMapProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringMap stringMap = new StringMap();

        while (true) {
            System.out.print("Enter new map key or XXX to end: ");
            String key = scanner.nextLine();

            if (key.equals("XXX")) {
                break;
            } else {
                if (isValidKey(key)) {
                    String value = askMap(scanner, key);
                    stringMap.put(key, value);
                } else {
                    System.out.println("Invalid key. Key cannot be empty or start with a digit.");
                }
            }
        }

        System.out.println("Map contents:");
        stringMap.printMapContents();

        scanner.close();
    }

    private static boolean isValidKey(String key) {
        return !key.isEmpty() && !Character.isDigit(key.charAt(0));
    }

    private static String askMap(Scanner scanner, String key) {
        System.out.print("Enter map value for key " + key + ": ");
        return scanner.nextLine();
    }
}

