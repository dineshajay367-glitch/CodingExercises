package ObserverPattern;

import java.util.logging.Logger;

public class Users implements Customers {
    private static final Logger logger= Logger.getLogger(Users.class.getName());
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