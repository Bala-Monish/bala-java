package inheritance;

public class testInherit {

	public static void main(String[] args) {
		elements mainElement = new elements();
		mainElement.desc();
		fire fireElem = new fire();
		fireElem.name();
		water waterElem = new water();
		waterElem.name();
		steam steamElem = new steam();
		steamElem.name();
		waterElem.desc();//using base class method
		
		
		elements first = new water();
		first.name();
		first.display();
	}

}
