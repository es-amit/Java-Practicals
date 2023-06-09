import java.awt.*;
import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JTextField;
public class question_24 extends JFrame implements KeyListener{
    String msg="";
    JTextField box1,box2;
    int x =0, y=0;
    Container cp;
    public question_24(){
        box1 = new JTextField(200);
        box1.setBounds(30, 30, 200, 40);
        
        cp = getContentPane();
        cp.add(box1);
        setTitle("Mouse events");
        setLayout(null);
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addKeyListener(this);
        requestFocus();
    }
    public void keyPressed(KeyEvent ke){
        box1.setText("Key Pressed");
    }
    public void keyReleased(KeyEvent ke){
        box1.setText("Key Released");
    }
    public void keyTyped(KeyEvent ke){
        msg+=ke.getKeyChar();
        repaint();
    }
    public void paint(Graphics g){
        x= 100;
        y=100;
        g.setFont(new Font("Consolas",Font.PLAIN,20));
        g.drawString(msg, x, y);
    }
    public static void main(String[] args) {
        question_24 ob = new question_24();
    }
    
}
