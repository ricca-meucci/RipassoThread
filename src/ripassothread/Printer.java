package ripassothread;

public class Printer implements Runnable
{
    private Thread thr;
    private Storage st;
    
    public Printer(String nome, Storage st)
    {
        this.st=st;
        this.thr=new Thread(this,nome);
        thr.start();
    }
    @Override
    public void run()
    {
        while(true)
            System.out.println(st.valore);
    }
}
