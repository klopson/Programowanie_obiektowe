public class Person {
    String name;



    public Person(String name)
    {
        this.name = name;
    }

    public void introduceYourself()
    {
        System.out.println("Jestem " + this.name);
    }
    public Person(Person other)
    {
        this.name = other.name;
    }
}
