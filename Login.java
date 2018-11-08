
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hallgato
 */
public class Login extends JFrame implements ActionListener{
    
    private JButton bt;
    
    private JTextField tf1;
    private JTextField tf2;
    
    private JLabel lb1;
    private JLabel lb2;
    private JLabel lb3;
    
    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
    private JPanel p4;

    public Login(String title) throws HeadlessException {
        super(title);
        
        this.bt= new JButton("OK");
        
        this.tf1= new JTextField(30);
        this.tf2= new JTextField(30);
        
        this.lb1=new JLabel("Username");
        this.lb2=new JLabel("Password");
        this.lb3=new JLabel();
        
        this.p1= new JPanel();
        this.p2= new JPanel();
        this.p3= new JPanel();
        this.p4= new JPanel();
        
        GridLayout gr= new GridLayout(4,1);
        setLayout(gr);
        
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        p1.add(lb1);
        p1.add(tf1);
        p2.add(lb2);
        p2.add(tf2);
        p3.add(bt);
        p4.add(lb3);
        
        this.add(p1);
        this.add(p2);
        this.add(p3);
        this.add(p4);
        
        bt.addActionListener(this);
        
        super.pack();
    }

    public static void main(String[] args) {
        Login log= new Login("Login");
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==bt);
        {
            if(tf1.getText().equals("BZS") && tf2.getText().equals("prog2"))
                lb3.setText("Siker");
            else
                lb3.setText("Error");
        }
    }
    
}
