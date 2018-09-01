
package animalthread;

import com.sun.istack.internal.logging.Logger;
import java.util.logging.Level;
import javax.swing.JProgressBar;

public class BarProgress extends Thread {
    private int secs;
    private JProgressBar jProgressBar1; 
    
    public BarProgress(JProgressBar jProgressBar1) {
        this.jProgressBar1 = jProgressBar1;
    }
    
    @Override
    public void run() {
        for(int secs = 0; secs <= 100; secs++) {
            try {
                jProgressBar1.setValue(secs);
                Thread.sleep(50);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
                System.out.println("Error ");
            }
            
        }
    }
    
}
