package StrategyPattern;

import java.util.logging.Logger;

public class Paypal implements PaymentStrategy {
    private static final Logger logger= Logger.getLogger(Paypal.class.getName());
    public void pay(int amount)
    {
        logger.info("Amount: "+ amount +" You paid in paypal");
    }
}
