import java.util.Arrays;
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

    public static int[] countAnimalInstances(Animal[] animal) {
        int[] animalArr = new int[0];
        String[] animalArrNames = new String[0];
        for(int x = 0; x < animal.length; x++) {
            boolean found = false;
            for(int y = 0; y < animalArr.length; y++) {
                if ((animal[x].toString()).equals(animalArrNames[y])) {
                    animalArr[y]++;
                    found = true;
                    break;
                } 
                
            }
            if (!found) {
                animalArr = Arrays.copyOf(animalArr, animalArr.length + 1);
                animalArrNames = Arrays.copyOf(animalArrNames, animalArrNames.length + 1);
                animalArrNames[animalArrNames.length-1] = animal[x].toString();
                animalArr[animalArr.length - 1]++;
            }
        }
        return animalArr;
    }

    public static void main(String[] args) {
        Person person = new Person("David");
        Student student = new Student("Brian", 19286);

        System.out.println(person.printInfo());
        System.out.println(student.printInfo());
    }
}