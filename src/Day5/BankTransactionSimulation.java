package Day5;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String msg) {
        super(msg);
    }
}

class BankAccount {
    private int balance;

    public BankAccount(int initialBalance) {
        balance = initialBalance;
    }

    public synchronized void deposit(int amount) throws Exception {
        if (amount <= 0) {
            throw new Exception("Amount should be positive");
        }
        balance += amount;
        System.out.println(Thread.currentThread().getName() + " deposited " + amount + ", Balance: " + balance);
    }

    public synchronized void withdraw(int amount) throws Exception {
        if (amount <= 0) {
            throw new Exception("Amount should be positive");
        }
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance! Tried to withdraw " + amount + ", Balance: " + balance);
        }
        balance -= amount;
        System.out.println(Thread.currentThread().getName() + " withdrew " + amount + ", Balance: " + balance);
    }

    public int getBalance() {
        return balance;
    }
}

class UserThread extends Thread {
    BankAccount acc;

    UserThread(BankAccount acc, String name) {
        super(name);
        this.acc = acc;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            int amount = (int)(Math.random() * 5000) + 1;
            boolean dep = Math.random() < 0.5;
            try {
                if (dep) {
                    acc.deposit(amount);
                } else {
                    acc.withdraw(amount);
                }
            } catch (Exception e) {
                System.out.println(Thread.currentThread().getName() + " -> " + e.getMessage());
            }

            try {
                Thread.sleep(400);
            } catch (Exception e) {
            }
        }
    }
}

public class BankTransactionSimulation {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(21000);

        UserThread u1 = new UserThread(account, "User1");
        UserThread u2 = new UserThread(account, "User2");
        UserThread u3 = new UserThread(account, "User3");

        u1.start();
        u2.start();
        u3.start();

        try {
            u1.join();
            u2.join();
            u3.join();
        } catch (Exception e) {
        }

        System.out.println("\nFinal Balance: " + account.getBalance());
    }
}
