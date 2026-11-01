package pakiet2;
import pakiet1.Person;

public class Employee extends Person {
    String position;


    public Employee(String firstName,String lastName, String position) {
        super(firstName, lastName);
        this.position = position;
    }

    public void showInformation()
    {
        System.out.println("first name: " + getFirstName() + " last name: "+ lastName + " position: " + position);
    }

}
