class Student4 {
    String name;
    int id;
    static Student4[] registeredStudents = new Student4[30];
    static int numberOfStudents = 0;

    private Student4(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public static Student4 register(String name, int id) {
        int index = -1;
        for(int i = 0; i<numberOfStudents; i++){
            if(registeredStudents[i].id==id){
                index = i;
                break;
            }
        }

        if(index!=-1){
            return registeredStudents[index];
        }
        else {
            Student4 student = new Student4(name, id);
            registeredStudents[numberOfStudents] = student;
            numberOfStudents++;
            return student;
        }
    }
}