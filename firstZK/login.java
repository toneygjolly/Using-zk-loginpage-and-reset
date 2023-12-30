package firstZK;

import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Label;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

public class login extends SelectorComposer<Window> {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    @Wire
    private Label loginLabel;
    @Wire
    private Textbox loginText;
    @Wire
    private Textbox passText;
    
    @Listen("onClick=#loginButton")
    public void login() 
    {
        String username=loginText.getValue();
        String password=passText.getValue();
        if(username.equals("athira") && password.equals("athira123"))
        {
            alert("Login sucessfully");
        }
        else
        {
            alert("invalid user");
        }
    }
    @Listen("onClick=#reset")
    public void onReset()
    {
        loginText.setValue("");
        passText.setValue("");
        
    }
    
}
