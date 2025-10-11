package ObserverPattern;

import java.util.*;
import java.util.logging.Logger;

public class Phone implements Product {
    private static final Logger logger= Logger.getLogger(Phone.class.getName());
    private String productname;
    public Phone(String productname)
    {
        this.productname=productname;
        logger.info("Product created: "+ productname);
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
            Runnable task=new Runnable(){
                @Override
                public void run() {
                    customer.notify(productname);
                }
            };
            Thread thread=new Thread(task);
            thread.start();
        }
    }
}