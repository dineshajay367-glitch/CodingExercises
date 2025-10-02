package SingletonPattern;

public class SingletonMain {
    public static void main(String[] args)
    {
        Runnable task = () ->{
            Singleton s1=Singleton.getInstance();
            System.out.println(Thread.currentThread().getName()+" "+s1.hashCode());
        };
        Thread t1=new Thread(task,"thread1");
        Thread t2=new Thread(task,"thread2");
        t1.start();
        t2.start();

    }
}