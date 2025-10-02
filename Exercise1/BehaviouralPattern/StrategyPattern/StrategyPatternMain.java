package StrategyPattern;

public class StrategyPatternMain {

    public static void main(String[] args) {
        PaymentService serv=new PaymentService(new Gpay());
        serv.payAmount(500);
        serv.ChangePaymentmethod(new Phonepay());
        serv.payAmount(1000);
        serv.ChangePaymentmethod(new Paypal());
        serv.payAmount(2000);



    }

}
