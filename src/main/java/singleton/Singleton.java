package singleton;

public class Singleton
{
    //Lazy initialization. Eager is when initialization occurs directly on a field
    private static Singleton singleton;

    private Singleton()
    {
    }

    //Thread safe
    public static synchronized Singleton get()
    {
        if (singleton != null)
        {
            singleton = new Singleton();
        }
        return singleton;
    }
}
