class Cat extends Animal {
    private boolean hasClaws;

    // Constructor
    public Cat(String name, int age, boolean hasClaws) {
        super(name, age);
        this.hasClaws = hasClaws;
    }

    // Method to make the cat meow
    public void meow() {
        String clawStatus = hasClaws ? "I have claws" : "I don't have claws";
        System.out.println("Meow! " + clawStatus);
    }
}