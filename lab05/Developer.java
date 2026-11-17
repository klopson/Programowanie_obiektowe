public class Developer extends Employee{
    private int projectBonus;

    public Developer(String name, int baseSalary, int projectBonus) {
        super(name, baseSalary);
        this.projectBonus = projectBonus;
    }

    public int getProjectBonus() {
        return projectBonus;
    }
    public int calculateSalary()
    {
        return baseSalary + projectBonus;
    }
}
