import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

// class Pet to store pet information in the form of an Object
class Pet {
    String name;
    int age;
    int health;
    int hunger;
}

class PetGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        gameSequence(scanner);
        scanner.close(); // Close the scanner
    }

    public static List<Pet> gameSequence(Scanner scanner) {
        System.out.println("Welcome to the Pet Game!");
        int numPets = askForNumberOfPets(scanner);
        List<Pet> pets = new ArrayList<>();

        for (int i = 1; i <= numPets; i++) {
            System.out.println("=========================");
            System.out.println("Creating Pet " + i);
            Pet pet = petCreator(scanner);
            initialStats(pet);
            pets.add(pet);
        }

        gameLoop(pets, scanner);

        return pets;
    }

    public static int askForNumberOfPets(Scanner scanner) {
        int numPets = 0;
        while (numPets <= 0) {
            System.out.println("How many pets would you like to create?");
            numPets = Integer.parseInt(scanner.nextLine());
            if (numPets <= 0) {
                System.out.println("Please enter a valid number of pets (greater than 0).");
            }
        }
        return numPets;
    }

    public static Pet createPet(String givenName, int givenAge, int givenHealth, int givenHunger) {
        Pet pet = new Pet();
        pet.name = givenName;
        pet.age = givenAge;
        pet.health = givenHealth;
        pet.hunger = givenHunger;
        return pet;
    }

    public static Pet petCreator(Scanner scanner) {
        final int petAge = 0;
        System.out.println("What would you like to name your pet?");
        String petName = scanner.nextLine();
        int petHunger = getHungerState();
        int petHealth = getHealthState();
        Pet pet = createPet(petName, petAge, petHealth, petHunger);
        return pet;
    }

    public static void initialStats(Pet pet) {
        String translatedHunger = hungerConvertToWords(pet.hunger);
        System.out.println(pet.name + "'s hunger level is " + translatedHunger);
        System.out.println(pet.name + "'s health is " + pet.health);
    }

    public static void gameLoop(List<Pet> pets, Scanner scanner) {
        int numRounds = 10; // Number of rounds
        for (int round = 1; round <= numRounds; round++) {
            for (Pet pet : pets) {
                if (pet.health > 0 && pet.hunger > 0) {
                    String translatedHunger = hungerConvertToWords(pet.hunger);
                    System.out.println("=========================");
                    System.out.println("Round " + round + ":");
                    System.out.println(pet.name + "'s hunger level is " + translatedHunger + ". And health level is " + pet.health + ".");
                    userQuery(pet, scanner);
                    pet.hunger = hungerReducer(pet);
                }
            }
        }
        winScreen(pets);
    }

    // start of hungerReducer function that reduces random ammount of hunger
    public static int hungerReducer(Pet pet)
    {
        int value = (int)(Math.random() * 2);
        int hunger = pet.hunger - value;
        return hunger;
    } // END hungerReducer

    public static void userQuery(Pet pet, Scanner scanner) {
        int userInput;
        System.out.println("What do you want to do with " + pet.name + "?");
        System.out.println("1: Feed it. 2: Hug it. 3: Medicine");
        userInput = Integer.parseInt(scanner.nextLine());
        userChoice(userInput, pet, scanner);
    }

    public static void userChoice(int userInput, Pet pet, Scanner scanner) {
        switch (userInput) {
            case 1:
                System.out.println("Feeding " + pet.name + "!");
                if (pet.hunger >= 5) {
                    pet.hunger = 5;
                } else {
                    pet.hunger++;
                }
                break;
            case 2:
                System.out.println("Hugging " + pet.name + "!");
                pet.hunger--;
                break;
            case 3:
                System.out.println("Administering medicine to " + pet.name + "!");
                if (pet.health >= 8) {
                    pet.health = 8;
                } else {
                    pet.health++;
                    pet.hunger--;
                }
                break;
            default:
                System.out.println("Invalid input, try again.");
                userQuery(pet, scanner);
                break;
        }
    }

    public static String hungerConvertToWords(int hunger) {
        String convertedHunger;
        switch (hunger) {
            case 0:
                convertedHunger = "starved";
                break;
            case 1:
                convertedHunger = "ravenous";
                break;
            case 2:
                convertedHunger = "famished";
                break;
            case 3:
                convertedHunger = "hungry";
                break;
            case 4:
                convertedHunger = "satisfied";
                break;
            case 5:
                convertedHunger = "full";
                break;
            default:
                convertedHunger = "unknown";
                break;
        }
        return convertedHunger;
    }

    public static int getHungerState() {
        return (int) (Math.random() * 5) + 1;
    }

    public static int getHealthState() {
        return (int) (Math.random() * 7) + 1;
    }

    public static void winScreen(List<Pet> pets) {
        System.out.println("Congratulations! You won!");
        for (Pet pet : pets) {
            System.out.println(pet.name + "'s hunger is " + hungerConvertToWords(pet.hunger) + ". And their health is " + pet.health + ".");
        }
    }
}
