package ObserverPattern;

public interface Product{
    public void subscribe(Customers c);
    public void unSubscribe(Customers c);
    public void notifyCustomer();

}