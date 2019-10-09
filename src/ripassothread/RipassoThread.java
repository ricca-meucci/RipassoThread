package ripassothread;

public class RipassoThread
{
    public static void main(String[] args)
    {
        Storage s = new Storage();
        Counter c = new Counter("c1", s);
        Printer p = new Printer("p1", s);
    }
    
}
