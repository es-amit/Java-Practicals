import javax.swing.*;
import java.awt.*;
// public class question_28 extends JFrame{
//     JButton b1,b2,b3;
//     FlowLayout f;
//     Container cp;
//     public question_28(){
//         f = new FlowLayout(FlowLayout.LEFT);
//         cp = getContentPane();
//         b1 = new JButton("Button 1");
//         b2 = new JButton("Button 2");
//         b3 = new JButton("Button 3");
//         Panel p = new Panel();
//         p.setLayout(f);
//         p.add(b1);
//         p.add(b2);
//         p.add(b3);
//         cp.add(p, "North");
//         setTitle("Change Color");
//         setSize(400, 400);
//         setVisible(true);
//         setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
//     }
//     public static void main(String[] args) {
//         question_28 obj = new question_28();
//     }
// }

// public class question_28 extends JFrame{
//     JButton b1,b2,b3,b4;
//     GridLayout g;
//     Container cp;
//     public question_28(){
//         g = new GridLayout(2,2);
//         cp = getContentPane();
//         b1 = new JButton("Button 1");
//         b2 = new JButton("Button 2");
//         b3 = new JButton("Button 3");
//         b4 = new JButton("Button 4");
//         Panel p = new Panel();
//         p.setLayout(g);
//         p.add(b1);
//         p.add(b2);
//         p.add(b3);
//         p.add(b4);
//         cp.add(p);
//         setTitle("Change Color");
//         setSize(400, 400);
//         setVisible(true);
//         setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
//     }
//     public static void main(String[] args) {
//         question_28 obj = new question_28();
//     }
// }

// public class question_28 extends JFrame{
//     JButton b1,b2,b3,b4,b5;
//     BorderLayout b;
//     Container cp;
//     public question_28(){
//         b = new BorderLayout();
//         cp = getContentPane();
//         b1 = new JButton("Button 1");
//         b2 = new JButton("Button 2");
//         b3 = new JButton("Button 3");
//         b4 = new JButton("Button 4");
//         b5 = new JButton("Button 5");
//         Panel p = new Panel();
//         p.setLayout(b);
//         p.add(BorderLayout.NORTH,b1);
//         p.add(BorderLayout.SOUTH,b2);
//         p.add(BorderLayout.EAST,b3);
//         p.add(BorderLayout.WEST,b4);
//         p.add(BorderLayout.CENTER,b5);
//         cp.add(p);
//         setTitle("Change Color");
//         setSize(400, 400);
//         setVisible(true);
//         setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
//     }
//     public static void main(String[] args) {
//         question_28 obj = new question_28();
//     }
// }

public class question_28 extends JFrame{
    JButton b1,b2,b3;
    CardLayout c;
    Container cp;
    public question_28(){
        c = new CardLayout();
        cp = getContentPane();
        b1 = new JButton("Button 1");
        b2 = new JButton("Button 2");
        b3 = new JButton("Button 3");
        Panel p = new Panel();
        p.setLayout(c);
        p.add(b1);
        p.add(b2);
        p.add(b3);;
        cp.add(p);
        setTitle("Change Color");
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }
    public static void main(String[] args) {
        question_28 obj = new question_28();
    }
}
