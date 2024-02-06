public class Main2 {
    public static void main(String[] args) {

        Student[] students = {
                new Student("John", 3),
                new Student("Alice", 2),
                new Student("Bob", 1),
                new Student("Bob", 5),
                new Student("Bill", 6),
                new Student("Baa", 7)
        };

        Student.sortStudents(students);

        for (Student s : students) {
            System.out.println("(" + s.name + "," + Integer.toString(s.id) + ")");
        }
    }
}
