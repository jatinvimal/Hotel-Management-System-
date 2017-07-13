import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by jatin kumar vimal on 29/06/2017.
 */
public class HomePage extends JFrame {
    JPanel panelHome;
    JButton loginbutton,Exitbutton,registrationButton;
    JLabel Homelabel;
    public HomePage(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Home Page");

        loginbutton = new JButton("LOG IN");
        Exitbutton = new JButton("EXIT");
        registrationButton= new JButton("Registration ");
        Homelabel= new JLabel("WELCOME TO OUR HOTEL");
        Homelabel.setFont(new Font("Times New Roman",Font.BOLD,20));
        Homelabel.setBounds(120,120,300,25);
        loginbutton.setBounds(180,180,150,25);
        Exitbutton.setBounds(180,210,150,25);
        registrationButton.setBounds(180,240,150,25);
        panelHome= new JPanel();
        setContentPane(panelHome);
        panelHome.setBackground(Color.lightGray);
        panelHome.setLayout(null);
        panelHome.add(Homelabel);
        panelHome.add(loginbutton);
        panelHome.add(Exitbutton);
        panelHome.add(registrationButton);
        loginbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ActionListenersClass alc=new ActionListenersClass();
                try {
                    alc. OnClickLogIn();
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });

        Exitbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ActionListenersClass exitbutton = new ActionListenersClass();
                exitbutton.OnClickExit();
            }
        });
        registrationButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ActionListenersClass registrationButton= new ActionListenersClass();
                try {
                    registrationButton.OnClickRegButton();
                } catch (Exception e1) {
                    e1.printStackTrace();
                }
            }
        });

        setSize(500,500);
        setVisible(true);
        setResizable(false);
    }
}
