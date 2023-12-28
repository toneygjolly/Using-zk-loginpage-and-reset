package com.trainingzk;



import java.awt.Button;

import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Label;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

public class login extends SelectorComposer<Window>
{
	private static final long serialVersionUID=1L;
	@Wire
	private Textbox name;
	@Wire
	private Textbox password;
	@Wire
	private Label l;
	@Wire
	private Button Buttonsubmit;
	@Wire
	private Button resetButton;
	@Listen("onClick=#Buttonsubmit")
	public void onsubmit()
	{
			String username=name.getValue();
			String userpassword=password.getValue();
			
			String uname="a";
			String upassword="b";
			if(username.equals(uname) && userpassword.equals(upassword)) {
				l.setValue("logied");
			}
			else {
		l.setValue("invalid username");
			}
	}
	@Listen("onClick=#resetButton")
	public void esetButton()
	{
		name.setValue(""); 
        password.setValue("");
	}
}
