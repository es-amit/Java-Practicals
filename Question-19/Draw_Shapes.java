import java.awt.*;
import javax.swing.*;

public class Draw_Shapes extends JFrame{
    Container cp;
    JPanel p;
    Draw_Shapes(){
        cp = getContentPane();
        setTitle("Drawing Shapes");
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }
    public void paint(Graphics g){
        g.setColor(Color.RED);
        g.fillRect(100, 100, 200, 100);
        g.fillOval(130, 250, 100, 100);
    }
    public static void main(String[] args) {
        Draw_Shapes obj = new Draw_Shapes();
    }
}
