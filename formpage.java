package firstZK;

import java.awt.Button;

import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

public class formpage extends SelectorComposer<Window> {
	private static final long serialVersionUID=2L;
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
		
	}
	
	
	
	

}
