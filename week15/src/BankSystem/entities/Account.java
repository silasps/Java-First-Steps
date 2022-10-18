package BankSystem.entities;

//superclasse
public class Account {

    private Integer number;
    private String holder;
    protected Double balance;

    public Account(){

    }

    //Constructor
    public Account (Integer number, String holder, Double balance) {

        this.number = number;
        this.holder = holder;
        this.balance = balance;
    }

    //Getters
    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public Double getBalance() {
        return balance;
    }

    //Setters
    public void setNumber(Integer number) {
        this.number = number;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount){
        balance -= amount;
    }

    public void deposit(double amount){
        balance += amount;
    }
}
