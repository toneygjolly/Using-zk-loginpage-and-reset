package firstZK;

import org.zkoss.zk.ui.Executions;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Button;
import org.zkoss.zul.Window;

public class home extends SelectorComposer<Window>{
	@Wire
	private Button Tiktac;
	@Wire
	private Button hang;
	@Listen("onClick=#Tiktac")
	public void onsubmit()
	{
		Executions.sendRedirect("TTTIK.zul");
	}

}
