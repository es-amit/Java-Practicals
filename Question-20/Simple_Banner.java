import java.applet.*;
import java.awt.*;
import java.lang.Runnable;
/*<applet code = "Simple_Banner" width= 300 height=200></applet >*/
public class Simple_Banner extends Applet implements Runnable{
    String msg = " <--Simple Moving Banner--> ";
    Thread t = null;
    boolean stopflag;
    public void init(){

        setBackground(Color.lightGray);
        setForeground(Color.RED);
    }
    public void start(){
        t = new Thread(this);
        stopflag= false;
        t.start();
    }
    public void run(){
        char ch;
        for(;;){
            try{
                repaint();
                Thread.sleep( 250);
                ch = msg.charAt(0);
                msg = msg.substring(1,msg.length());
                msg+=ch;
                if(stopflag){
                    break;
                }
            }
            catch(InterruptedException e){
                //exception caught
            }
        }
    }
    public void stop(){
        stopflag = true;
        t = null;
    }
    public void paint(Graphics g){
        g.setFont(new Font("Consolas", Font.PLAIN, 26));
        g.drawString(msg, 50, 50);
    }
}
