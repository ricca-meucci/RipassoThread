package ripassothread;

import java.util.concurrent.Semaphore;

public class Counter implements Runnable
{
    private Semaphore l;
    private Semaphore s;
    private Storage st;
    private Thread thr;
            
    public Counter(String Nome, Storage st, Semaphore l, Semaphore s)
    {
        this.l = l;
        this.s = s;
        this.st = st;
        this.thr = new Thread(this, Nome);
        thr.start();
    }

    @Override
    public void run()
    {
        while(true)
        {
            try
            {
                s.acquire();
                st.valore++;
                l.release();
            }
            catch(InterruptedException e)
            {
                System.out.println("THREAD INTERROTTO!");
            }
        }
    }
    
}
