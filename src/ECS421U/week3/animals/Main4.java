class Main4 {
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", 3, "Golden Retriever");
        myDog.displayInfo();
        myDog.bark();

        System.out.println();

        Cat myCat = new Cat("Whiskers", 2, true);
        myCat.displayInfo();
        myCat.meow();
    }
}