import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class midterm extends JFrame implements ActionListener {
    JTextField t1,t2;
    JLabel num1,num2,sum;
    JButton btn;
    midterm(){
        num1= new JLabel("num1");
        t1= new JTextField(10);
        num2= new JLabel("num2");
        t2= new JTextField(10);
        sum=new JLabel("sum");
        btn= new JButton("Add");
        add(num1);add(t1);
        add(num2);add(t2);
        add(sum);
        add(btn);
        setSize(300, 300);
        setVisible(true);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        btn.addActionListener(this);
        
    }
    @Override
    public void actionPerformed(ActionEvent ee){
        int n1= Integer.parseInt(t1.getText());
        int n2= Integer.parseInt(t2.getText());
        int s= n1+n2;
        sum.setText("sum is:"+s);

    }
    public static void main(String[] args) {
        new midterm();
    }

    
}
