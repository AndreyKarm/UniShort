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

    public static void main(String[] args) {
        Animal[] animals = populateArray(10);
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}