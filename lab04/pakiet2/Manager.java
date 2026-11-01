package pakiet2;

public class Manager extends Employee{
    String department;

    public Manager(String firstName, String lastName, String position, String department) {
        super(firstName, lastName, position);
        this.department = department;
    }

    public void showInformation(){
        super.showInformation();
        System.out.println("department: " + department);
    }
}
