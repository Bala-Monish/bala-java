package inheritance;
import inheritance.model.elementsData;
public class ember extends fire{
	elementsData emberElem = new elementsData();
	
	
	public void name() {
		emberElem.setElementName("Ember Child of Fire");
		System.out.print("Ember Element Class");
	}


}
