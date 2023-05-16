import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class format extends JFrame implements ActionListener{
    JLabel Name,Address;
    JTextField Na;
    JTextField Ad;
    JButton btnI,btnR,btnD,btnU;
     format(){
    Name= new JLabel("Name");
    Na= new JTextField(20);
    Address= new JLabel("Address");
    Ad= new JTextField(20);
    btnI = new JButton("Insert");
    btnR = new JButton("Retrieve");
    btnD= new JButton("Delete");
    btnU = new JButton("Update");
    setSize(300, 300);
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setLayout(new GridLayout(5,2));
    add(Name);add(Na);
    add(Address);add(Ad);
    add(btnI);
    add(btnR);
    add(btnD);
    add(btnU);
    btnI.addActionListener(null);
    btnR.addActionListener(null);
    btnD.addActionListener(null);
    btnU.addActionListener(null);
    }
    public void actionPerformed(ActionEvent ee){

    }
    public static void main(String[] args) {
        new format();
    }
}