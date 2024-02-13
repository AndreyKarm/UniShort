public class Main {
    public static void main(String[] args) {
        Person person = new Person("David");
        Student student = new Student("Brian", 19286);

        System.out.println(person.printInfo());
        System.out.println(student.printInfo());
    }
}