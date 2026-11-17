public class Tester extends Employee {
    private int bugsFound;
    private int bonusPerBug;

    public Tester(String name, int baseSalary, int bugsFound, int bonusPerBug) {
        super(name, baseSalary);
        this.bugsFound = bugsFound;
        this.bonusPerBug = bonusPerBug;
    }

    @Override
    public int calculateSalary() {
        return baseSalary + (bugsFound * bonusPerBug);
    }
}