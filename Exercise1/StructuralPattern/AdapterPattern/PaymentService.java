package AdapterPattern;

public class PaymentService {
    public void paymentProcess(Currency currency)
    {
        System.out.println("Payment Processed: "+ currency.getAmount());
    }
}