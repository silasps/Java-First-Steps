package BankSystem.entities;

//final impede que sejam criadas outras classes que extendam seus métodos
public final class SavingsAccount extends Account{ //Conta Poupança
    private Double interestRate;

    public SavingsAccount(){
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate){
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance += balance * interestRate;
    }

    @Override //Override sobrescreve o método da classe mãe
    public void withdraw(double amount){
        balance -= amount;
    }
}
