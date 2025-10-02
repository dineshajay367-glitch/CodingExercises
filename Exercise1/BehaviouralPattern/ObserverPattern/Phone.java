package ObserverPattern;
import java.util.*;
public class Phone implements Product {
    private String productname;
    public Phone(String productname)
    {
        this.productname=productname;
    }
    List <Customers> customers= new ArrayList<>();
    public void subscribe(Customers c)
    {
        customers.add(c);
    }
    public void unSubscribe(Customers c)
    {
        customers.remove(c);

    }
    public void notifyCustomer()
    {
        for(Customers customer: customers)
        {
            new Thread(() -> customer.notify(productname)).start();
        }
    }
}