import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Login_form implements ActionListener{
    JFrame f;
    JLabel log,user_name,pwd;
    JTextField u_name;
    JPasswordField pass;
    JCheckBox show;
    JButton exit,login;
    Login_form(){

        Font f_head = new Font("Arial", Font.BOLD, 36);             // font for login application
        Font f_all = new Font("Times New Roman",Font.PLAIN, 18);
        Font field = new Font("Times New Roman",Font.PLAIN, 16);
        Font f_button = new Font("Arial Black", Font.PLAIN, 16);
        f= new JFrame();
        // Heading for login application
        log = new JLabel("LOGIN APPLICATION");
        log.setFont(f_head);
        log.setBounds(57,15, 1000,50);
        f.add(log);
        
        // adding username label
        user_name = new JLabel("Username");
        user_name.setFont(f_all);
        user_name.setBounds(30, 110, 100, 18);
        f.add(user_name);

        // adding username text field
        u_name = new JTextField(300);
        u_name.setFont(field);
        u_name.setBounds(150, 110, 250, 25);
        f.add(u_name);


        // adding Password label
        pwd = new JLabel("Password");
        pwd.setFont(f_all);
        pwd.setBounds(30, 170, 100, 18);
        f.add(pwd);

        // adding Password text field
        pass = new JPasswordField(300);
        pass.setFont(field);
        pass.setBounds(150, 168, 250, 25);
        f.add(pass);

        // check box for show password 
        show = new JCheckBox("Show Password");
        show.setBounds(276, 200, 200, 25);
        show.setFont(field);
        f.add(show);

        // exit button 
        exit = new JButton("Exit");
        exit.setFont(f_button);
        exit.setBounds(150, 250, 85, 30);
        f.add(exit);


        // exit button 
        login = new JButton("Login");
        login.setFont(f_button);
        login.setBounds(312, 250, 85, 29);
        f.add(login);

        f.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        f.setTitle("Login Form");
        f.setSize(480,420);  
        f.setLayout(null);  
        f.setVisible(true); 

        //Registration of buttons
        exit.addActionListener(this);
        login.addActionListener(this);
        show.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ae){
        
        // Handling password field with check box show password
        if(show.isSelected()){
            pass.setEchoChar((char)0);
        }else{
            pass.setEchoChar('•');
        }

        // Handling login button event
        String str = ae.getActionCommand();
        String username = u_name.getText();
        String password = new String(pass.getPassword());
        //Handling exit button event
        if(str.equals("Exit")){
            f.dispose();
        }
        if(str.equals("Login") && ((username.equals("es_amit")) && (password.equals("9999100158")))){
            JOptionPane.showMessageDialog(exit, "Successfully logged in");
        }
        else{
            if(str.equals("Exit")||str.equals("Show Password")){
                // nothing to do
            }
            else{
                JOptionPane.showMessageDialog(exit, "Please enter valid username and password!!");
            }
        }
    }

    public static void main(String[] args) {
        Login_form obj = new Login_form();
    }
}
