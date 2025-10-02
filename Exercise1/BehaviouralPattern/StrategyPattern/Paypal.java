package StrategyPattern;

public class Paypal implements PaymentStrategy {
    public void pay(int amount)
    {
        System.out.println("Amount: "+ amount +" You paid in paypal");
    }
}
