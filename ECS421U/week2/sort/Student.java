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
            if (s[j].name.charAt(0) == s[j + 1].name.charAt(0)) {
                if (s[j + 1].id < s[j].id) {
                    Student temp = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = temp;
                }
            } else if (s[j].name.charAt(0) > s[j + 1].name.charAt(0)) {
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