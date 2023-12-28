package com.trainingzk;
import java.awt.Button;

import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Label;
import org.zkoss.zul.Window;


public class validaion extends SelectorComposer<Window>
{
private static final long serialVersionUID=1L;
@Wire
private Button Buttonsubmit1;
@Wire
private Label lName;
@Wire
private Button resetButton;
@Wire
private Button Click;
@Listen("onClick=#Buttonsubmit")
public void onSubmit()
{

	lName.setValue("WELCOMEqq");
}
@Listen("onClick=#resetButton")
public void onRest()
{
	lName.setValue("hi,its AN AJAX ZK example");
}
@Listen("onClick=#click")
public void onclick()
{
	lName.setValue("toney");
}
}
