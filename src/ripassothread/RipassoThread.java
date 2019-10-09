package ripassothread;

import java.util.concurrent.Semaphore;

public class RipassoThread
{
    public static void main(String[] args)
    {
        Semaphore lettore =new Semaphore(1);
        Semaphore scrittore =new Semaphore(0);
        
        Storage s = new Storage();
        Printer p = new Printer("p1", s,lettore,scrittore);
    }
    
}
