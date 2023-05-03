import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class mywindow extends JFrame implements ActionListener{
    JMenuBar mb;
    JMenuItem file,edit,view;
    JMenuItem nnew,open,cut,copy,paste;
    public mywindow(){
        
        mb=new JMenuBar();
        file=new JMenu("File");
        edit=new JMenu("edit");
        view=new JMenu("view");
        nnew= new JMenuItem("nnew");
        open= new JMenuItem("open");
        cut=new JMenuItem("cut");
        copy=new JMenuItem("copy");
        file.add(nnew);
        file.add(open);
        edit.add(cut);
        edit.add(copy);
        mb.add(file);
        mb.add(edit);
        add(mb);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        setSize(500,500);
        nnew.addActionListener(this);


    }
    @Override
    public void actionPerformed(ActionEvent e){
JFrame f= new JFrame();
f.setSize(600,600);
f.setVisible(true);
    }
    public static void main(String[] args) {
        new mywindow();
        
    }

    
}
