import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Calculator extends JFrame implements ActionListener{
    JLabel Number1,Number2,result;
    JTextField n1,n2,r;
        JButton Add,Subract,Multiply,Division,calculate;
        Calculator(){
            Number1= new JLabel("Number1");
            n1= new JTextField(20);
            Number2= new JLabel("Number2");
            n2=new JTextField(20);
            Add= new JButton("Add");
            Subract= new JButton("Subract");
            Multiply= new JButton("Multiply");
            Division= new JButton("Division");
            calculate= new JButton("Calculate");
            result = new JLabel("result");
            r= new JTextField();
            setSize(300, 300);
            setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            setLayout(new GridLayout(5,2));
            add(Number1);add(n1);
            add(Number2);add(n2);
            add(Add);add(Subract);
            add(Multiply);add(Division);
            add(result);
            Add.addActionListener(this);
            Subract.addActionListener(this);
            Multiply.addActionListener(this);
            Division.addActionListener(this);
            }
        public void actionperformed(ActionEvent ee){
            int x= Integer.parseInt(n1.getText());
            int y= Integer.parseInt(n2.getText());
            int Add=x+y;
            int Subract=x-y;
            int Multiply=x*y;
            int Division=x/y;
            result.setText(""+Add);
            result.setText(""+Subract);
            result.setText(""+Multiply);
        result.setText(""+Division);

        }
        public static void main(String[] args) {
            new Calculator();
        }
        @Override
        public void actionPerformed(ActionEvent e) {
            
            throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
        }
    }