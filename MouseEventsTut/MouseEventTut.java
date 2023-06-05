import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEventTut extends JFrame implements MouseMotionListener{
    String msg="";
    int x =0,y =0;
    JTextField box;
    Container cp;
    public question(){
        box = new JTextField(200);
        box.setBounds(30, 30, 200, 40);
        cp = getContentPane();
        cp.add(box);
        setTitle("Mouse events");
        setLayout(null);
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addMouseMotionListener(this);
    }
    public void mouseDragged(MouseEvent me){
        msg="*";
        x= me.getX();
        y = me.getY();
        repaint();
    }
    public void mouseMoved(MouseEvent me){
        x= me.getX();
        y = me.getY();
        msg = "Mouse moving at: " +x +","+y;
        box.setText(msg);
        
        
    }
    public void paint(Graphics g){
        g.drawString(msg, x,y);
    }
    public static void main(String[] args) {
        MouseEventTut obj = new MouseEventTut();
    }
}
