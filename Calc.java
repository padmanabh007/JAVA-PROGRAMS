import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class Calc{

    public static void main(String[] Args){
        Asmdm obj =new Asmdm();
    }
}

class Asmdm implements ActionListener{

    JFrame jf;
    JLabel L1;
    JTextField t1,t2;
    JButton b1,b2,b3,b4,b5;
    
    public Asmdm(){

        jf=new JFrame();
        L1=new  JLabel("RESULT");
        t1=new JTextField(20);
        t2=new JTextField(20);
        b1=new JButton("Add");
        b2=new JButton("Subtract");
        b3=new JButton("Multipy");
        b4=new JButton("Divides");
        b5=new JButton("Modulus");

        jf.add(t1);
        jf.add(t2);
        jf.add(b1);
        jf.add(b2);
        jf.add(b3);
        jf.add(b4);
        jf.add(b5);
        jf.add(L1);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);

        jf.setLayout(new FlowLayout());
        jf.setVisible(true);
        jf.setSize(500,150);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent ae){
        int n1=Integer.parseInt(t1.getText());
        int n2=Integer.parseInt(t2.getText());
        float Value=0;

        if(ae.getSource()==b1){
            Value=n1+n2;
        }
        else if(ae.getSource()==b2){
            Value=n1-n2;
        }
        else if(ae.getSource()==b3){
            Value=n1*n2;
        }
        else if(ae.getSource()==b4){
            Value=n1/n2;
        }
        else{
            Value=n1%n2;
        }
        L1.setText("Result = "+ Value);
    } 
}
