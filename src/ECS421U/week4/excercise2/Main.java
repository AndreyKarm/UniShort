import java.util.Random;

public class Main {
    public static Animal[] populateArray(int size) {
        Random random = new Random();
        Animal[] animals = new Animal[size];
        for (int i = 0; i < size; i++) {
            if (random.nextBoolean()) {
                animals[i] = new Dog();
            } else {
                animals[i] = new Cat();
            }
        }
        return animals;
    }

    public static Animal[][] separateArray(Animal[] animals) {
        int dogCount = 0;
        int catCount = 0;

        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                dogCount++;
            } else if (animal instanceof Cat) {
                catCount++;
            }
        }

        Dog[] dogs = new Dog[dogCount];
        Cat[] cats = new Cat[catCount];

        int dogIndex = 0;
        int catIndex = 0;

        for (Animal animal : animals) {
            if (animal instanceof Dog) {
                dogs[dogIndex++] = (Dog) animal;
            } else {
                cats[catIndex++] = (Cat) animal;
            }
        }

        return new Animal[][] { dogs, cats };
    }

    public static void main(String[] args) {
        Animal[] animals = populateArray(10);

        Animal separatedAnimals[][] = separateArray(animals);

        int dogCounter = 0;
        int catCounter = 0;

        for (Animal animal : separatedAnimals[0]) {
            if (animal instanceof Dog) {
                dogCounter++;
            }
        }

        for (Animal animal : separatedAnimals[1]) {
            if (animal instanceof Cat) {
                catCounter++;
            }
        }

        System.out.println("Number of dogs: " + dogCounter);
        System.out.println("Number of cats: " + catCounter);
    }
}