package BankSystem;

import BankSystem.entities.Account;
import BankSystem.entities.BusinessAccount;
import BankSystem.entities.SavingsAccount;

public class Main {
    public static void main(String[] args) {

//        //upcast e downcast -> Direção que a herança está acontecendo
//
//        BusinessAccount bacc = new BusinessAccount(1000, "Natalia", 0.0, 500.0);
//
//        // Upcasting
//        Account acc = bacc;
//
////        acc.setLoanLimit(200.0); Não é possível acessar o setLoanLimit
//        bacc.setLoanLimit(200.0);
//
//        Account acc1 = new Account(1001, "Jose", 0.0);
//
//        Account acc2 = new BusinessAccount(1002, "Fred", 0.0, 200.0);
//
//        Account acc3 = new SavingsAccount(1003, "Silas", 0.0, 0.01);
//
////        acc2.setLoanLimit(200.0); Ainda não é possível acessar os métodos, pois não foi feito
////        acc3.updateBalance(); // o downcasting
//
//        // Downcasting
//
//        SavingsAccount accs = (SavingsAccount) acc3;
//
//        System.out.println(accs.getInterestRate());
//
//        BusinessAccount acc4 = (BusinessAccount) acc2;
//
//        acc4.setLoanLimit(2000.0);
//        acc4.loan(555.5);
//
//        System.out.println(acc4.getBalance());

//        _________________________________________________________

        Account acc1 = new Account(1111, "Shiva", 1000.0);

        acc1.withdraw(250);

        System.out.println(acc1.getBalance());


        Account acc2 = new SavingsAccount(2222, "Ganesha", 1000.0, 0.01);

        acc2.withdraw(300);

        System.out.println(acc2.getBalance());


        Account acc3 = new BusinessAccount(3333, "Krishna", 1000.0, 1000.0);

        acc3.withdraw(350);

        System.out.println(acc3.getBalance());
    }
}
