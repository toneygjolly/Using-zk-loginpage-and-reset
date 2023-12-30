package firstZK;

import java.sql.SQLException;

import org.zkoss.zhtml.Button;
import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Label;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

public class guess extends SelectorComposer<Window>{
	private static final long serialVersionUID=1L;
	@Wire
    private Textbox scoreDisplay;
	@Wire
	private Label l;
	@Wire
	private Textbox name;
	@Wire
	private Button c1;
	@Listen("onClick=#c1")
	public void c11() throws SQLException {
		 int score = 0;
		String name1=name.getValue();
		Usercheck u=new Usercheck();
		boolean found=u.check(name1);
		if(found==true) {
			score += 10;
			//if(username.equals(name) && userpassword.equals(password)) {
				l.setValue("correct well done");
				 scoreDisplay.setValue("Score: " + score);
				
				//Executions.sendRedirect("home.zul");
				}
				//}
				else {
			l.setValue("wrong try again");
				}
	}
}
