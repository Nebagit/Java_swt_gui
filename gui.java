package GUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class gui extends JFrame implements ActionListener{
    JLabel l1;
    JLabel l2;
    JLabel l3;
    JLabel l4;
    JLabel l5;
    JLabel l6;
    
    JRadioButton r1;
    JRadioButton r2;
    JRadioButton r3;
    JRadioButton r4;
    JRadioButton r5;
    
    JTextField t1;
    JTextField t2;
    JTextField t3;
    JTextField t4;
    JTextField t5;
    JTextField t6;


    
    JRadioButton c1;
    JRadioButton c2;
    JRadioButton c3;
    JRadioButton c4;
    JRadioButton c5;
    
    ButtonGroup b;
    
    JButton button;
    JButton bt;
    JButton bt1;


gui(){
   super("Students Cafe Registration");
   setLayout(new FlowLayout(FlowLayout.LEFT,10,2));
   
   button = new JButton("Save");
   bt=new  JButton("Search");
   
   
   l1=new JLabel("First name");
   l2=new JLabel("Middle name");
   l3=new JLabel("Last name  ");
   l4=new JLabel("Department");
   l5=new JLabel("Meal Card no");
   l6=new JLabel("your campus");
   
   t1=new JTextField(20);
   t2=new JTextField(20);
   t3=new JTextField(20);
   t4=new JTextField(20);
   t5=new JTextField(20);
   t6=new JTextField(20);
   
   r1=new JRadioButton("cafe user",false);
   r2=new JRadioButton("non cafe",false);
   r3=new JRadioButton("unknown",false);
   
   c1=new JRadioButton("4_kilo");
   c2=new JRadioButton("5_kilo");
   c3=new JRadioButton("6_kilo");
   c4=new JRadioButton("Tikur Anbesa");
   c5=new JRadioButton("Lideta");
   
   add(l1);
   add(t1);
   add(l2);
   add(t2);
   add(l3);
   add(t3);
   add(l4);
   add(t4);
   add(l5);
   add(t5);
   
   add(r1);
   add(r2);
   add(r3);
   
   b=new ButtonGroup();
   b.add(r1);
   b.add(r2);
   b.add(r3);

   add(l6);
   add(c1);
   add(c2);
   add(c3);
   add(c4);
   add(c5);
   
   add(button);
   add(bt);
   
   button.addActionListener(this);
   bt.addActionListener(this);

}
public void actionPerformed(ActionEvent it){
    if(it.getSource()==button)
    	
       JOptionPane.showMessageDialog(null,"Information Saved successfully","Message",JOptionPane.INFORMATION_MESSAGE);

}

 public static void main(String[] args){
   gui g=new gui();
     g.setSize(400,500);
   g.setLocationRelativeTo(null);
  g. setVisible(true);
  g.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 }   
}

