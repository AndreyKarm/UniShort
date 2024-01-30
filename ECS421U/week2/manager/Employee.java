class Employee {
    String name;
    Employee manager;

    Employee(String name, Employee manager) {
        this.name = name;
        this.manager = manager;
    }

    public Employee getDistrictManager() {
        if (manager == null) {
            return this;
        }
        else {
            return manager.getDistrictManager();
        }
    }
}