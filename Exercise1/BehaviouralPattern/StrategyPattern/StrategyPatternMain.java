package StrategyPattern;

public class StrategyPatternMain {

    public static void main(String[] args) {
        PaymentService paymentmethod=new PaymentService(new Gpay());
        paymentmethod.payAmount(500);
        paymentmethod.ChangePaymentmethod(new Phonepay());
        paymentmethod.payAmount(1000);
        paymentmethod.ChangePaymentmethod(new Paypal());
        paymentmethod.payAmount(2000);



    }

}
