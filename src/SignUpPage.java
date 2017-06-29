import javax.swing.*;
import java.awt.*;

/**
 * Created by jatin kumar vimal on 27/06/2017.
 */
public class SignUpPage extends JFrame {
    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11;
    JTextField t1, t2, t3, t4, t5, t6, t7, t8, t9;
    JTextField text1;
    JComboBox<String> cityop;
    JComboBox<Integer> NopOp;
    JComboBox<String> ModeP;
    JRadioButton r1;
    JRadioButton r2;
    String[] Mode = new String[]{"Select Mode..", "Debit Card", "Credit Card", "Other Visa card"};
    String[] city = new String[]{"Select city..", "Delhi", "Uttar pradesh", "Ghaziabad"};
    Integer[] NoP = new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    // JPasswordField j3,j4;
    JPanel p1;
    JButton b1, b2;

    SignUpPage() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 1000);
        setResizable(false);

        l5 = new JLabel("SIGN UP PAGE");
        l1 = new JLabel("Customer-ID");
        l2 = new JLabel("Customer Name");
        l3 = new JLabel("Customer City");
        l4 = new JLabel("Customer Address");
        //l5 = new JLabel("No of Person");
        l6 = new JLabel("No of Person");
        l7 = new JLabel("Mobile No");
        l8 = new JLabel("Mode of Payment");
        l9 = new JLabel("Check In Date");
        l10 = new JLabel("Date of Birth");
        l11 = new JLabel("Gender");
        t1 = new JTextField();
        t2 = new JTextField();
        t3 = new JTextField();
        t4 = new JTextField();
        t5 = new JTextField();
        t6 = new JTextField();
        t7 = new JTextField();
        t8 = new JTextField();
        t9 = new JTextField();
        cityop = new JComboBox<>(city);
        ModeP = new JComboBox<>(Mode);
        NopOp = new JComboBox<>(NoP);

        r1 = new JRadioButton("Male");
        r2 = new JRadioButton("Female");

        text1 = new JTextField();
        b1 = new JButton("CHECK IN");
        b2 = new JButton("EXIT");
        l5.setBounds(250, 60, 500, 25);
        //l5.setSize(25,25);

        l1.setBounds(350, 180, 150, 20);
        l2.setBounds(350, 210, 150, 20);
        l3.setBounds(350, 240, 150, 20);
        l11.setBounds(350, 270, 150, 20);
        l6.setBounds(350, 300, 150, 20);
        l7.setBounds(350, 330, 150, 20);
        l8.setBounds(350, 360, 150, 20);
        l9.setBounds(350, 390, 150, 20);
        l10.setBounds(350, 420, 150, 20);
        l4.setBounds(350, 450, 150, 20);

        t1.setBounds(500, 180, 180, 20);
        t2.setBounds(500, 210, 180, 20);
        cityop.setBounds(500, 240, 180, 20);
        // text1.setBounds(500,270,180,20);
        r1.setBounds(500, 270, 70, 20);
        r2.setBounds(600, 270, 70, 20);
        NopOp.setBounds(500, 300, 180, 20);
        t6.setBounds(500, 330, 180, 20);
        ModeP.setBounds(500, 360, 180, 20);
        //t2.setBounds(500,210,180,20);
        t8.setBounds(500, 390, 180, 20);
        t9.setBounds(500, 420, 180, 20);
        text1.setBounds(500, 450, 180, 80);

        b1.setBounds(350, 550, 150, 25);
        b2.setBounds(530, 550, 150, 25);

        p1 = new JPanel();
        setContentPane(p1);
        setLayout(null);
        p1.setBackground(Color.lightGray);
        l5.setHorizontalAlignment(SwingConstants.CENTER);
        p1.add(l5);
        p1.add(l1);
        p1.add(t1);
        p1.add(l2);
        p1.add(t2);
        p1.add(l3);
        p1.add(cityop);
        p1.add(l6);
        p1.add(NopOp);
        p1.add(l7);
        p1.add(t6);
        p1.add(l8);
        p1.add(ModeP);
        p1.add(l9);
        p1.add(t2);
        p1.add(l10);
        p1.add(t1);
        p1.add(l11);
        p1.add(r1);
        p1.add(r2);
        //p1.add(t2);

        p1.add(l4);
        p1.add(text1);
        ;
        p1.add(l3);
        p1.add(t8);
        p1.add(l4);
        p1.add(t9);
        p1.add(b1);
        p1.add(b2);

        setVisible(true);
    }
}
//    public static void main(String[] args) {
//        new SignUpPage();
//    }
//}
