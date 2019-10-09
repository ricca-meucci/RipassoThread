package ripassothread;
import java.util.concurrent.Semaphore;

public class Printer implements Runnable
{
    private Thread thr;
    private Storage st;
    private Semaphore l;
    private Semaphore s;
    
    public Printer(String nome, Storage st, Semaphore l, Semaphore s)
    {
        this.st=st;
        this.l=l;
        this.s=s;
        this.thr=new Thread(this,nome);
        thr.start();
    }
    @Override
    public void run()
    {
        while(true)
        {
            try
            {
                l.acquire();
            }catch(Exception e)
            {
                System.out.println(e);
            }
            System.out.println(st.valore);
            s.release();
        }
    }
}
