import javax.swing.*;
public class menuExample extends JFrame {
    JMenu menu1,menu2,menu3;
    JMenuItem i1,i2;
    menuExample(){
        JFrame f= new JFrame();
        JMenuBar mb= new JMenuBar();
        menu1= new JMenu("File");
        i1=new JMenuItem("new");
        i2= new JMenuItem("save");
        menu2=new JMenu("Help");
        menu3= new JMenu("Edit");
        f.setJMenuBar(mb);
        f.setSize(400, 400);
        f.setVisible(true);
        f.setLocationRelativeTo(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mb.add(menu1);
        menu1.add(i1);menu1.add(i2);
        mb.add(menu2);
        mb.add(menu3);
        
    }
    public static void main(String[] args) {
        new menuExample();
    }


    
}
