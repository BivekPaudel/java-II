import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

public class addition extends JFrame implements ActionListener {
    JLabel Number1;JLabel Number2;
    JTextField n1;JTextField n2;
    JLabel Sum;
    JButton Calculate;
    addition(){
        Number1= new JLabel("Enter the first number");
        n1=new JTextField(20);
        Number2= new JLabel("Number2");
        n2= new JTextField(20);
        Calculate= new JButton("Calculate");
        setSize(300, 300);
        setVisible(true);
        setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(Number1);add(n1);
        add(Number2);add(n2);
        add(Calculate);
        Calculate.addActionListener(this);
    }
    public void actionPerformed(ActionEvent ee){
        int x=Integer.parseInt(n1.getText());
        int y= Integer.parseInt(n2.getText()); 
        int sum=x+y;
        Calculate.setText(""+sum);

    }
    public static void main(String[] args) {
        new addition();
    }
    
}
