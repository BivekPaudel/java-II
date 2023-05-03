import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class password extends JFrame implements ActionListener{
    JLabel pass,re_pass,display;
    JTextField pa;JTextField re;
    JButton btn;
public password(){
    pass= new JLabel("pass");
    pa= new JTextField(20);
    re_pass= new JLabel("re_pass");
    re= new JTextField(20);
    btn= new JButton("check");
    display= new JLabel("display");
    btn.addActionListener(this);
    setSize(300,300);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new FlowLayout());
    add(pass);add(pa);
    add(re_pass);add(re);
    add(display);
    add(btn);
    btn.addActionListener(this);
    

}
@Override
public void actionPerformed(ActionEvent e){
    if(pa.getText().equals(re.getText())){
        display.setText("Welcome to the page");

    }
    else{
        display.setText("Please enter the same password");
    }
}
public static void main(String[] args) {
    new password();

}
}