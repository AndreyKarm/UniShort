class Student {
    String name;
    int id;

    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    static boolean checkDuplicates(Student[] s) {
        for (int i = 0; i < s.length; i++) {
            for (int x = i + 1; x < s.length; x++) {
                if (s[i].id == s[x].id) {
                    return true;
                }
            }
        }
        return false;
    }

    static void sortStudents(Student[] s) {
    boolean swapped;
    for (int i = 0; i < s.length - 1; i++) {
        swapped = false;
        for (int j = 0; j < s.length - i - 1; j++) {
            if (s[j].name.compareTo(s[j + 1].name) > 0 || (s[j].name.equals(s[j + 1].name) && s[j].id > s[j + 1].id)) {
                Student temp = s[j];
                s[j] = s[j + 1];
                s[j + 1] = temp;
                swapped = true;
            }
        }
        if (!swapped)
            break;
        }
    }
}