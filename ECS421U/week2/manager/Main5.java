class Main5 {
    public static void main(String[] args) {
        Employee jane = new Employee("jane", null);
        Employee joe = new Employee("joe", jane);
        Employee john = new Employee("john", joe);

        System.out.println(john.getDistrictManager().name); // should print jane
        System.out.println(jane.getDistrictManager().name); // should print jane
    }
}