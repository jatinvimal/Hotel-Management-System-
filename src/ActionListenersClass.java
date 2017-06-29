import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Created by jatin kumar vimal on 28/06/2017.
 */
public class ActionListenersClass extends SignUpPage {

    public void OnClickLogIn() {
        if (t1.getText().toString().trim().length() > 0 &&
                t1.getText().toString().trim().length() > 0 &&
                t2.getText().toString().trim().length() > 0 &&
                t3.getText().toString().trim().length() > 0 &&
                t4.toString().trim().length() > 0 &&
                t5.getText().toString().trim().length() > 0 &&
                t6.getText().toString().trim().length() > 0 &&
                t7.getText().toString().trim().length() > 0 &&
                t8.getText().toString().trim().length() > 0 &&
                t9.getText().toString().trim().length() > 0) {
            if (t8.getText().toString().trim().length() == 0) {

                try {

                    Class.forName("com.mysql.jdbc.Driver");
                    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/dbname", "root", "12345");
                    CallableStatement stmt = con.prepareCall("{call addCredentials(?,?,?,?,?,?)}");
                    stmt.setString(1, t1.getText());
                    stmt.setString(2, t2.getText());
                    stmt.setLong(3, cityop.getItemCount());
                    stmt.setString(4, r1.getText());
                    stmt.setString(5, String.valueOf(NopOp.getItemCount()));
                    stmt.setString(6, String.valueOf(t6.getText()));
                    stmt.setString(7, String.valueOf(ModeP.getItemCount()));
                  //  stmt.setString(8,);

                    stmt.execute();


                } catch (Exception e) {

                }
            }
            else{

            }
        }


    }
}

