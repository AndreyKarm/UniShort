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
}