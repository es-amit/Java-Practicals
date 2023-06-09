import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class MouseEventTut extends JFrame implements MouseListener, MouseMotionListener{
    String msg="";
    int x =0,y =0;
    JTextField box1,box2;
    Container cp;
    public MouseEventTut(){
        box1 = new JTextField(200);
        box1.setBounds(30, 30, 200, 40);
        box2 = new JTextField(200);
        box2.setBounds(30, 70, 200, 40); 
        cp = getContentPane();
        cp.add(box1);
        cp.add(box2);

        setTitle("Mouse events");
        setLayout(null);
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addMouseMotionListener(this);
        addMouseListener(this);
    }
    public void mouseClicked(MouseEvent e) {
        msg = "Mouse Clicked!!!";
        box2.setText(msg);  
    }  
    public void mouseReleased(MouseEvent me){
        msg = "Mouse Released!!!";
        box2.setText(msg); 
    }
    public void mouseEntered(MouseEvent me){
        msg = "Mouse Entered!!!";
        box2.setText(msg); 
    }
    public void mouseExited(MouseEvent me){
        msg = "Mouse Exited!!!";
        box2.setText(msg); 
    }
    public void mousePressed(MouseEvent me){
        msg = "Mouse Pressed!!!";
        box2.setText(msg);  
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
        box1.setText(msg);
        
        
    }
    public void paint(Graphics g){
        g.drawString(msg, x,y);
    }
    public static void main(String[] args) {
        MouseEventTut obj = new MouseEventTut();
    }
}
