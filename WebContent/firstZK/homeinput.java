package firstZK;



import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Datebox;
import org.zkoss.zul.Doublebox;
import org.zkoss.zul.Intbox;
import org.zkoss.zul.Window;

public class homeinput extends SelectorComposer<Window> {
@Wire
private Datebox createdDatebox;
@Wire
private Intbox barcodeIntbox;
@Wire
private Doublebox unitPriceDoublebox;
public void dateBox()
{
	Date datebox = createdDatebox.getValue();
	System.out.println("Date"+datebox);
	DateFormat formator=new SimpleDateFormat(createdDate.getformat());
	showNotif("changed to:"+formatter.format(barcode),"error",barcodeIntbox);
	
}
@Listen("onchange =#barcodeIntbox")
public void changeBarcode() {
	
}
}
