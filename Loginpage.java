import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Loginpage extends JFrame implements ActionListener {
    private JLabel username,password;
    private JTextField uname;
    private JPasswordField pass;
    private JButton login;
    Loginpage(){
        setTitle("Loginpage");
        getContentPane().setBackground(Color.lightGray);;
       username= new JLabel("username:");
        uname = new JTextField(20);

        password= new JLabel("password:");
        pass = new JPasswordField(20);

        login = new JButton("Login");
        setVisible(true);
        setSize(300, 200);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(username);
        add(uname);
        add(password);
        add(pass);
        add(login);
        login.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent ee){
        String username= uname.getText();
        String password= pass.getText();
        if(username.equals("admin") && password.equals("admin123")){
            JOptionPane.showMessageDialog(Loginpage.this,"Login successfull!!");
        }
        else{
            JOptionPane.showMessageDialog(Loginpage.this,"**Login Failed**");
        }

    }

public static void main(String[] args) {
    new Loginpage();
}

    
}
