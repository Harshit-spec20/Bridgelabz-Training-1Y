package src.com.gla.interfaces-abstraction.Level1;


interface PaymentProcessor{
    void pay(double amount);

    default void refund(double amount){
        System.out.println("Refund processed: " + amount);
    }
}

class Paypal implements PaymentProcessor{
    public void pay(double amount){
        System.out.println("Paid via Paypal: " + amount);
    }
}

public class PaymentGatewayDefault{
    public static void main(String[] args){
        PaymentProcessor p = new Paypal();
        p.pay(300);
        p.refund(100);
    }
}
