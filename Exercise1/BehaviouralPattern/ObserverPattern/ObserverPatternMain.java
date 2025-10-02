package ObserverPattern;

public class ObserverPatternMain {

    public static void main(String[] args) {
        Phone product1=new Phone("iphone 17");
        Customers customer1= new Users("Dinesh");
        Customers customer2= new Users("Deeraj");
        Customers customer3= new Users("Aravind");
        Customers customer4=new Users("Divahar");
        product1.subscribe(customer1);
        product1.subscribe(customer2);
        product1.subscribe(customer3);
        product1.subscribe(customer4);
        product1.unSubscribe(customer3);
        product1.notifyCustomer();



    }

}