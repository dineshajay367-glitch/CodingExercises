package ObserverPattern;

public class Users implements Customers {
    private String name;
    public Users(String name)
    {
        this.name=name;
    }
    @Override
    public void notify(String product)
    {
        System.out.println("[Notification] " + name +
                ", the product " + product + " is now available!");
    }
}