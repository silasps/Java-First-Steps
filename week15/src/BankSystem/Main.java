package BankSystem;

import BankSystem.entities.Account;
import BankSystem.entities.BusinessAccount;
import BankSystem.entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {

        //upcast e downcast -> Direção que a herança está acontecendo

        // downcast
        BusinessAccount bacc = new BusinessAccount(1000, "Natalia", 0.0, 500.0);
        Account acc = bacc;

        Account acc1 = new Account(1001, "Jose", 0.0);

        Account acc2 = new BusinessAccount(1002, "Fred", 0.0, 200.0);

        Account acc3 = new SavingsAccount(1003, "Silas", 0.0, 0.01);


        BusinessAccount acc4 = ((BusinessAccount)acc2);

//        acc4.setLoanLimit(3500.0);
//        acc4.loan(500.0);
//        System.out.println(acc4.getBalance());

        if(acc2 instanceof BusinessAccount){ //verificar se a conta é de instância BusinessAccount

            BusinessAccount acc5 = (BusinessAccount)acc2;
            acc5.setLoanLimit(2000.0);
            acc5.loan(200.0);
            System.out.println(acc5.getBalance());

//            ((BusinessAccount) acc2).setLoanLimit(300.0);
        }

        if(acc3 instanceof BusinessAccount){
            System.out.println("instance of!");
        } else {
            System.out.println("Warning!");
        }
    }
}
