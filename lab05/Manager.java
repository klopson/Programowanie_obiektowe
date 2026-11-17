public class Manager extends Employee {
    private int managementAllowance;

    public Manager(String name, int baseSalary, int managementAllowance) {
        super(name, baseSalary);
        this.managementAllowance = managementAllowance;
    }

    @Override
    public int calculateSalary() {
        return baseSalary + managementAllowance;
    }
}