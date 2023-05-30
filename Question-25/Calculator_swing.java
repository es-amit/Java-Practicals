import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Calculator implements ActionListener{
    JFrame JF;
    JTextField t;
    Font f = new Font("Consolas", Font.PLAIN, 12);
    Container cp;
    JButton button1,button2,button3,button4,button5,button6,button7,button8,button9,button0;
    JButton add,sub,mul,div,eql,clr;
    String msg="";
    String temp;
    double a,b;
    double ans=0;

    

    public static void main(String args[]){
        Calculator cal = new Calculator();

    }

    
    //making GUI 
    Calculator(){
        JF = new JFrame();
        cp = JF.getContentPane();
        cp.setBackground(Color.darkGray);
        Font f =new Font("Consolas", Font.PLAIN, 18);
       JF.setLayout(null);
       JF.setSize(260, 370);
       JF.setVisible(true);
       JF.setTitle("CALCULATOR");
        t = new JTextField(100);
        button0 = new JButton("0");
        button1 = new JButton("1");
        button2 = new JButton("2");
        button3 = new JButton("3");
        button4 = new JButton("4");
        button5 = new JButton("5");
        button6 = new JButton("6");
        button7 = new JButton("7");
        button8 = new JButton("8");
        button9 = new JButton("9");
        //operation buttons
         add = new JButton("+");
         sub= new JButton("-");
         mul = new JButton("x");
         div = new JButton("/");
         eql= new JButton("=");
         clr = new JButton("C");
        //setting color for button
        t.setBackground(Color.lightGray);
        t.setFont(f);
        button0.setBackground(Color.white);
        button0.setFont(f);
        button1.setBackground(Color.white);
        button1.setFont(f);
        button2.setBackground(Color.white);
        button2.setFont(f);
        button3.setBackground(Color.white);
        button3.setFont(f);
        button4.setBackground(Color.white);
        button4.setFont(f);
        button5.setBackground(Color.white);
        button5.setFont(f);
 
        button6.setBackground(Color.white);
        button6.setFont(f);
        button7.setBackground(Color.white);
        button7.setFont(f);
        button8.setBackground(Color.white);
        button8.setFont(f);
        button9.setBackground(Color.white);
        button9.setFont(f);
        add.setBackground(Color.red);
        add.setFont(f);
        sub.setBackground(Color.red);
        sub.setFont(f);
        div.setBackground(Color.red);
        div.setFont(f);
        mul.setBackground(Color.red);
        mul.setFont(f);
        eql.setBackground(Color.YELLOW);
        eql.setFont(f);
        clr.setBackground(Color.white);
        clr.setFont(f);


        //first row
        JF.add(t);
        //second row
        JF.add(button7);
        JF.add(button8);
        JF.add(button9);
        JF.add(div);
        //third row
        JF.add(button4);    
        JF.add(button5);
        JF.add(button6);
        JF.add(mul);
        //fourth row
        JF.add(button1);
        JF.add(button2);
        JF.add(button3);
        JF.add(sub);
        //fifth row
        JF.add(clr);
        JF.add(button0);
        JF.add(eql);
        JF.add(add);
       
        //setting buttons 
        t.setBounds(30, 30, 200, 40);
        button7.setBounds(30, 80, 44, 44);
        button8.setBounds(82, 80, 44, 44);
        button9.setBounds(134, 80, 44, 44);
        button4.setBounds(30, 132, 44, 44);
        button5.setBounds(82, 132, 44, 44);
        button6.setBounds(134, 132, 44, 44);
        button1.setBounds(30, 184, 44, 44);
        button2.setBounds(82, 184, 44, 44);
        button3.setBounds(134, 184, 44, 44);
        clr.setBounds(30, 236, 44, 44);
        button0.setBounds(82, 236, 44, 44);
        eql.setBounds(134, 236, 44, 44);
        add.setBounds(186, 236, 44, 44);
        sub.setBounds(186, 184, 44, 44);
        mul.setBounds(186, 132, 44, 44);
        div.setBounds(186, 80, 44, 44);
        
        button0.addActionListener(this);
        button1.addActionListener(this);
        button2.addActionListener(this);
        button3.addActionListener(this);
        button4.addActionListener(this);
        button5.addActionListener(this);
        button6.addActionListener(this);
        button7.addActionListener(this);
        button8.addActionListener(this);
        button9.addActionListener(this);
        
        add.addActionListener(this);
        sub.addActionListener(this);
        mul.addActionListener(this);
        div.addActionListener(this);
        eql.addActionListener(this);
        clr.addActionListener(this);

        JF.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    }
    //Action events performed using buttons
    public void actionPerformed(ActionEvent ae){
        String str = ae.getActionCommand();
        if(str.equals("+")||str.equals("-")||str.equals("/")||str.equals("x")){
            try{
                String str1 = t.getText();
                temp = str;
                a = Integer.parseInt(str1);
                msg="";
            }
            catch(Exception e){
                //handled exception
            }
        }
        else if(str.equals("C")){
            t.setText("");
            a=b=0;
            msg="";
        }
        else if(str.equals("=")){
            try{
                String str2 = t.getText();
                b = Integer.parseInt(str2);
                if(temp == "+"){
                    ans= a+b;
                }
                else if(temp =="-"){
                    ans=a-b;
                }
                else if(temp =="x"){
                    ans=a*b;
                }
                else if(temp =="/"){
                    ans=a/b;
                }
                a = ans;
                String str1 = String.valueOf(ans);
                t.setText(""+str1);
                msg ="";
            }
            catch(Exception e){
                //handled exception
            }
        }
        else{
            msg+=str;
            t.setText(""+msg);
        }
        
    }
    public void paint(Graphics g){
        
    }
   
}
