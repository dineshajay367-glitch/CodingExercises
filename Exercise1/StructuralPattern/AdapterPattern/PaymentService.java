package AdapterPattern;

import java.util.logging.Logger;

public class PaymentService {
    private static final Logger logger= Logger.getLogger(PaymentService.class.getName());
    public void paymentProcess(Currency currency)
    {
        logger.info("Payment Processed: "+ currency.getAmount());
    }
}