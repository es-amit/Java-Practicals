import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class question30 extends JFrame implements ActionListener{
    JButton b1,b2,b3;
    Container cp;
    question30(){
        cp = getContentPane();
        b1 = new JButton("Red");
        b2 = new JButton("Blue");
        b3 = new JButton("Green");
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        Panel p = new Panel();
        p.add(b1);
        p.add(b2);
        p.add(b3);
        cp.add(p, "North");
        setTitle("Change Color");
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource().equals(b1)){
            cp.setBackground(Color.red);
        }
        if(ae.getSource().equals(b2)){
            cp.setBackground(Color.blue);
        }
        if(ae.getSource().equals(b3)){
            cp.setBackground(Color.green);
        }
    
        
    }
    public static void main(String[] args) {
        question30 obj = new question30();
    }
}
