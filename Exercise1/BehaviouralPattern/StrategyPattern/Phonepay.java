package StrategyPattern;

import java.util.logging.Logger;

public class Phonepay implements PaymentStrategy {
    private static final Logger logger= Logger.getLogger(Phonepay.class.getName());
    public void pay(int amount)
    {
        logger.info("Amount: "+ amount +" You paid in phone pay");
    }
}
