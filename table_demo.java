import javax.swing.JFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class table_demo extends JFrame {
    JTable tbl;
    String[] cols={"name","address"};
    String [][] rows={
        {"Raj","AAA"},
        {"Anita","BBB"},
        {"Bivek","CCC"}
    };
    public table_demo(){
        tbl= new JTable(rows,cols);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(300,300);
        add(tbl);
    }
    public static void main(String[] args) {
        new table_demo();
    }

}
