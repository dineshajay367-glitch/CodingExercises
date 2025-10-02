package SingletonPattern;
import java.util.logging.Logger;
public class Singleton {
    private static final Logger logger=Logger.getLogger(Singleton.class.getName());
    private static volatile Singleton instance;
    private Singleton()
    {
        logger.info("Instance is Created");
    }
    public static Singleton getInstance()
    {
        if(instance==null)
        {
            synchronized(Singleton.class)
            {
                if(instance==null)
                {
                    instance=new Singleton();
                }
            }

        }
        return instance;
    }


}