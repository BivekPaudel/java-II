import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class pane extends JFrame implements  ActionListener{
    JButton btn1,btn2,btn3;
    pane(){
        btn1 = new JButton("open new pane");
        btn2=new JButton("open new frame");
        btn3= new JButton("open message");
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        add(btn1);add(btn2);add(btn3);
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
    }
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==btn1){
        JPanel pa = new JPanel();
        pa.setSize(400, 400);
        pa.setVisible(true);
        JOptionPane.showMessageDialog(pane.this,"Welcome to the panel");
        }
        else if(ae.getSource()==btn2){
            JFrame frame=new JFrame();
            frame.setSize(400,400);
            frame.setVisible(true);
        }
        else{
            JOptionPane.showMessageDialog(pane.this,"Hello");
        }

    }
    public static void main(String[] args) {
        new pane();
    }
    
}
