/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ripassothread;

/**
 *
 * @author informatica
 */
public class Counter implements Runnable
{
    private Storage st;
    private Thread thr;
            
    public Counter(String Nome, Storage st)
    {
        this.st = st;
        this.thr = new Thread(this, Nome);
        thr.start();
    }

    @Override
    public void run()
    {
        while(true)
        {
            st.valore++;
        }
    }
    
}
