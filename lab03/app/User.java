package app;

public class User {

    private String login;
    private String password;
    private int age;


    public User(String login, String password, int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Wiek nie może być ujemny!");
        }
        this.login = login;
        this.password = password;
        this.age = age;
    }


    public String getLogin() {
        return login;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Wiek nie może być ujemny!");
        }
        this.age = age;
    }


    public boolean checkPassword(String inputPassword) {
        return this.password != null && this.password.equals(inputPassword);
    }

    public void showUser() {
        System.out.println("Login: " + login + ", hasło: *****, wiek: " + age);
    }
}