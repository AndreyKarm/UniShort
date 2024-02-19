class Dog extends Animal {
    private String breed;

    // Constructor
    public Dog(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    // Method to make the dog bark
    public void bark() {
        System.out.println("Woof! I am a " + this.breed);
    }
}