package StrategyPattern;

import java.util.logging.Logger;

public class Gpay implements PaymentStrategy {
    private static final Logger logger= Logger.getLogger(Gpay.class.getName());
        public void pay(int amount)
        {
            logger.info("Amount: "+ amount +" You paid in Gpay");
        }
    }

