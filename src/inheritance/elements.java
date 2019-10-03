package inheritance;

import inheritance.model.elementsData;

public class elements {
	elementsData Element = new elementsData();
	
	public void display() {
	String displayName =	Element.getElementName();
	System.out.println(displayName);
		}
	
	public void desc() {
		System.out.println("This is the description of the class");
	}
	
	public void name() {
		Element.setElementName("Base Element");
		System.out.println("Elements Class");
	}
}
