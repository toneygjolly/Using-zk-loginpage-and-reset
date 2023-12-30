package firstZK;

import java.awt.Button;
import java.sql.SQLException;

import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

public class loginregirster extends SelectorComposer<Window>{
    @Wire
    private Button submitButton;
    @Wire
    private Textbox nameBox;
    @Wire
    private Textbox password;
    
    @Listen("onClick=#submitButton")
    public void onRegisteration() throws SQLException
    {
        boolean found=false;
        String uname=nameBox.getValue();
        String pass=password.getValue();
        Usercheck l=new Usercheck();
        found=l.userRegister(uname, pass);
        if(found)
        {
            alert("username and password is already registered");
        }
        else
        {
            alert("sucessfully Registered");
        }
    }

}
