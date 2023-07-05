import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class newForm extends JFrame {
    JLabel Name,Gender,country;
    JTextField Na;

    JButton show;
    newForm(){
        Name= new JLabel("Name");
        Na=new JTextField(20);
        ButtonGroup Gender= new ButtonGroup();
        JRadioButton male= new JRadioButton("M");
        JRadioButton female= new JRadioButton("F");
        JComboBox country= new JComboBox();
        JCheckBox movie= new JCheckBox();
        JCheckBox cricket= new JCheckBox();
        show= new JButton("show"); 
        setSize(400, 400);
        setVisible(true);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        add(Name);add(Na);
        add(country);
        add(movie);add(cricket);
        add(show);


        




    }
    public static void main(String[] args) {
        new newForm();
    }
}
