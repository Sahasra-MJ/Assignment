package Day4;

interface Payment{
    void pay(double amount);
    void refund(double amount);
}
class CreditCard implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Pay "+amount+ " using CreditCard");
    }
    @Override
    public void refund(double amount) {
        System.out.println("Refund "+amount+ " successfully using CreditCard");
    }
}
class UPI implements Payment{
    @Override
    public void pay(double amount) {
        System.out.println("Pay "+amount+ " using UPI");
    }
    @Override
    public void refund(double amount) {
        System.out.println("Refund "+amount+ " successfully using UPI");
    }
}

public class PaymentSystem {
    public static void main(String[] args) {
        Payment p=new CreditCard();
        p.pay(1000);
        p.refund(100);
        System.out.println("----------------------------------------------");
        Payment p1=new UPI();
        p1.pay(2000);
        p1.refund(1000);
    }
}
