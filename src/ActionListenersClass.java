import static com.sun.deploy.uitoolkit.ToolkitStore.dispose;

/**
 * Created by jatin kumar vimal on 28/06/2017.
 */
public class ActionListenersClass{

    public void OnClickLogIn() throws Exception {
        dispose();
        new LoginPage();
    }
    public void OnClickExit(){

        new HomePage().dispose();

    }
    public void OnClickRegButton() throws Exception {

        dispose();
        new SignUpPage();
    }

}

