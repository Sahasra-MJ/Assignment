package Day4;

abstract class BankAccount {
    double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount {
    double MIN_BALANCE = 1000;

    SavingsAccount(double balance) {
        super(balance);
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (balance - amount >= MIN_BALANCE)
            balance -= amount;
        else
            System.out.println("Cannot withdraw, minimum balance required!");
    }
}

class CurrentAccount extends BankAccount {
    double OVERDRAFT_LIMIT = 5000;

    CurrentAccount(double balance) {
        super(balance);
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (balance - amount >= -OVERDRAFT_LIMIT)
            balance -= amount;
        else
            System.out.println("Cannot withdraw, overdraft limit exceeded!");
    }
}

public class Bank {
    public static void main(String[] args) {
        SavingsAccount sa = new SavingsAccount(2000);
        sa.withdraw(1500);
        sa.deposit(500);

        CurrentAccount ca = new CurrentAccount(1000);
        ca.withdraw(4000);
    }
}

