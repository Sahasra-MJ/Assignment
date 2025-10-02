package Day3;

public class BankAccount {
    int accountNo;
    double balance;
    BankAccount(int accountNo){
        this.accountNo = accountNo;
        balance = 0;
    }
    BankAccount(int accountNo,double balance){
        this.accountNo = accountNo;
        this.balance = balance;
    }
    void deposit(double amount){
        balance += amount;
        System.out.println("Deposited: " + amount);
    }
    void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance");
        }
    }
    void display(){
        System.out.println("Account No.: " + accountNo);
        System.out.println("Balance: " + balance);
        System.out.println("-----------------------");
    }
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount(11);          // default constructor
        BankAccount b2 = new BankAccount(12, 10000);   // parameterized constructor

        b1.display();
        b1.deposit(5000);
        b1.withdraw(500);
        b1.display();

        b2.display();
        b2.deposit(8000);
        b2.withdraw(1000);
        b2.display();
    }
}
