package firstZK;

import java.awt.Button;
import java.sql.SQLException;

import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Label;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

public class formpage extends SelectorComposer<Window> {
	private static final long serialVersionUID=1L;
	@Wire
	private Button submitButton;
	
	@Wire
	private Label l;
	@Wire
	private Textbox nameBox;
	@Wire
	private Textbox password;
	@Wire
	private Button resetButton1;
	@Listen("onClick=#resetButton1")
	public void resetButton()
	{
		nameBox.setValue(""); 
        password.setValue("");
	}
	
	@Listen("onClick=#Buttonsubmit")
	public void onsubmit() {
		
		 String username = nameBox.getValue();
	        String userpassword = password.getValue();

	        Usercheck userDAO = new Usercheck();
	        try {
	            boolean isUsernameAvailable = userDAO.isUsernameAvailable(username);
	            if (isUsernameAvailable) {
	                boolean saved = userDAO.saveUser(username, userpassword);
	                if (saved) {
	                    l.setValue("User registered successfully!");
	                } else {
	                    l.setValue("Failed to save user.");
	                }
	            } else {
	                l.setValue("Username already exists.");
	            }
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
		
		
	}
	
	
	
	


