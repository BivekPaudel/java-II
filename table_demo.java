import javax.swing.*;
import java.awt.*;
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
        JFrame frame= new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
       frame. setSize(300,300);
        frame.add(tbl);
        frame.add(new JScrollPane(tbl));
        frame.setSize(500,500);
    }

    public static void main(String[] args) {
        new table_demo();
    }

}
