public class Employee extends Person{
    String position;

    public Employee(String firstName) {
        super(firstName);
    }

    public Employee(String firstName, String position) {
        super(firstName);
        this.position = position;
    }

    public void displayData()
    {
        System.out.println("first name: " + getFirstName() + " position: " + position);
    }
}
