import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java .awt.Event;
public class table extends JFrame implements ActionListener {
    JTable tbl;
    String cols[]= {"s.n","name","address","number"};
    String rows[][]={
    {"1","bivek","Bhaktapur","222222222"}  

    };
    public table(){
        tbl= new JTable(rows,cols);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(500,300);
        add(tbl);
    }
public static void main(String[] args) {
    new table();
}
@Override
public void actionPerformed(ActionEvent e) {
    // TODO Auto-generated method stub
    //throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
}
}
