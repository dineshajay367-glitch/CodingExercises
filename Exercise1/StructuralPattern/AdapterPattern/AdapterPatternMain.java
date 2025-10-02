package AdapterPattern;

public class AdapterPatternMain {

    public static void main(String[] args) {
        PaymentService service=new PaymentService();
        Currency currency1=new Rupee(100);
        service.paymentProcess(currency1);
        Currency currency2=new DollarAdapter(new Dollar(100));
        service.paymentProcess(currency2);
        Currency currency3=new EuroAdapter(new Euro(100));
        service.paymentProcess(currency3);



    }

}