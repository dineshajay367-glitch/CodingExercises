package StrategyPattern;

public class PaymentService {
    private PaymentStrategy paymentMethod;
    public PaymentService(PaymentStrategy paymentMethod)
    {
        this.paymentMethod=paymentMethod;
    }
    public void ChangePaymentmethod(PaymentStrategy paymentMethod)
    {
        this.paymentMethod=paymentMethod;
    }
    public void payAmount(int amount)
    {
        paymentMethod.pay(amount);
    }
}
