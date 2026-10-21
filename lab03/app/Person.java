package app;

public class Person {
    private String name;
    private int age;
    private String email;

    public Person(String name,int age,String email)
    {
        this.setName(name);
        this.setAge(age);
        this.setEmail(email);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        if(name == null || name.isEmpty()) {
            {
                System.out.println("Podano złą nazwę");
            }

        }
        else {
            this.name = name;
        }
    }

    public void setAge(int age) {
       if(age < 0 || age > 150)
       {
           System.out.println("Musisz mieć pomiędzy 0 a 150 lat");
       }
       else this.age = age;
    }

    public void setEmail(String email) {
        if(email.contains("@")) {
            this.email = email;
        }
        else System.out.println("musisz mieć znak @");
    }
}
