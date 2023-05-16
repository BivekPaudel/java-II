import javax.swing.*;
import java.awt.*;
public class table1 extends JFrame{
    JTable tbls;
    String cols[]={"ID","NAME","SALARY"};
    String [][] rows={
        {"101","Amit","670000"},
        {"102","Jai","780000"},
        {"103","sachin","700000"}
    };
    public table1(){
        tbls= new JTable(rows,cols);
        JFrame frame= new JFrame();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());
        frame.setSize(1000, 500);
        frame.add(tbls);
        frame.add(new JScrollPane(tbls));
        setSize(1000, 500);
        
    }
    public static void main(String[] args) {
        new table1();
    }
}
