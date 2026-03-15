package src.com.gla.interfaces-abstraction.Level1;


interface Payment{
    void pay(double amount);
}

class UPI implements Payment{
    public void pay(double amount){
        System.out.println("Paid using UPI: " + amount);
    }
}

class CreditCard implements Payment{
    public void pay(double amount){
        System.out.println("Paid using Credit Card: " + amount);
    }
}

public class DigitalPaymentInterface{
    public static void main(String[] args){
        Payment p = new UPI();
        p.pay(500);
    }
}
