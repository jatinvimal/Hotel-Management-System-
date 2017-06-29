/**
 * Created by jatin kumar vimal on 28/06/2017.
 */
public class ActionListenersClass{

    public void OnClickLogIn() {
        new LoginPage();
    }
    public void OnClickExit(){
        new HomePage().setVisible(false);

    }
    public void OnClickRegButton(){
        new SignUpPage();
    }

}

