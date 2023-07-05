import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class prime extends JFrame implements ActionListener{
    JLabel num,output;
    JTextField fnum;
    JButton calculate;
    prime(){
        num= new JLabel("number");
        fnum= new JTextField(20);
        output= new JLabel("output");
        calculate = new JButton("calculate");
      
       setSize(400,500);
       setVisible(true);
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
       setLayout (new FlowLayout());
       add(num);add(fnum);
       add(calculate);
       add(output);
       calculate.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent e){
    int a= Integer.parseInt(fnum.getText());
    int c= 0;
    for(int i=1;i<a;i++){
        if(a%i==0){
            c++;
            

        }}
        if(c<=2){
            output.setText(a+"is a prime number");
        }
        else{
            output.setText(a+"is a composite number");

        }
       
    }

public static void main(String[] args) {
    new prime();
 }
}