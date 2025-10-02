package StrategyPattern;

public class Gpay implements PaymentStrategy {
        public void pay(int amount)
        {
            System.out.println("Amount: "+ amount +" You paid in Gpay");
        }
    }

