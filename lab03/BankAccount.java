public class BankAccount {
    private String owner;
    private double balance;

    public String getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }
    public void deposit(double ammount)
    {
        if (ammount > 0) {
            this.balance = this.balance + ammount;
        }
        else System.out.println("nie podano dodatniej wartości");
    }
    public void withdraw(double ammount)
    {
        if (this.balance > ammount && ammount > 0) {
            this.balance = this.balance - ammount;
        }
        else System.out.println("kwota nie jest dotatnia albo brak środków");
    }

}
