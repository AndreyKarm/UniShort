public class Main2 {
    public static void main(String[] args) {

        Student[] studentsArrayWithDuplicate = {
                new Student("Alice", 1),
                new Student("Bob", 2),
                new Student("Charlie", 3),
                new Student("Alice", 1)
        };

        Student[] studentsArrayWithoutDuplicate = {
                new Student("Alice", 1),
                new Student("Bob", 2),
                new Student("Charlie", 3),
                new Student("David", 4)
        };

        System.out.println(Student.checkDuplicates(studentsArrayWithDuplicate));
        System.out.println(Student.checkDuplicates(studentsArrayWithoutDuplicate));
    }
}
