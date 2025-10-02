package StrategyPattern;

public class Phonepay implements PaymentStrategy {
    public void pay(int amount)
    {
        System.out.println("Amount: "+ amount +" You paid in phone pay");
    }
}
