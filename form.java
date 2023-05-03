import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class form extends JFrame{
    JLabel name;JTextField fname;
    JLabel address; JTextField add;
    JLabel Gender;
    JLabel Hobby;
    JTextField display;
    JButton btn;
    form(){
        name= new JLabel("name");
        address= new JLabel("address");
        Gender= new JLabel("Gender");
        JRadioButton male= new JRadioButton("male");
        JRadioButton female=new JRadioButton("female");
        ButtonGroup group = new ButtonGroup();
        group.add(male);
        group.add(female);


        Hobby=new JLabel("Hobby");
        JCheckBox A=new JCheckBox("A");
        JCheckBox B=new JCheckBox("B");
        JCheckBox c= new JCheckBox("C");
        group.add(A);
        group.add(B);
        group.add(c);
        fname= new JTextField(20);
        add= new JTextField(20);
        display= new JTextField(20);
        
        btn=new JButton("display");
        setSize(300,200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(name);add(fname);
        add(address);add(add);
        add(Gender);
        add(male);
        add(female);
        add(Hobby);
        add(A);
        add(B);
        add(c);

        add(btn);
        add(display);


    }
public static void main(String[] args) {
    new form();
}
}