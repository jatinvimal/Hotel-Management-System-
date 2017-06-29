import javax.swing.*;
import java.awt.*;

/**
 * Created by jatin kumar vimal on 28/06/2017.
 */
public class LoginPage extends JFrame {
    JLabel label1,label2;
    JTextField textField1,textField2;
    JButton button1;
    JPanel panel1;

    LoginPage(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,500);
        setResizable(false);
      //  setVisible(true);

        label1= new JLabel("USERNAME");
        label2=  new JLabel("PASSWORD");
        textField1=new JTextField();
        textField2 = new JTextField();
        button1=new JButton("LOGIN");


        label1.setBounds(50,120,150,20);
        label2.setBounds(50,150,150,20);

        textField1.setBounds(150,120,150,20);
        textField2.setBounds(150,150,150,20);

        button1.setBounds(180,250,100,20);
        panel1= new JPanel();
        setContentPane(panel1);
        panel1.setBackground(Color.lightGray);
        setLayout(null);
        panel1.add(label1);
        panel1.add(textField1);
        panel1.add(label2);
        panel1.add(textField2);
        panel1.add(button1);
        setVisible(true);


    }

}
