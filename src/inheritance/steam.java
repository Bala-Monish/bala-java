package inheritance;
import inheritance.model.elementsData;

public class steam implements elementsIF{
	
	elementsData steamElement = new elementsData();

	@Override
	public void name() {
		steamElement.setElementName("Steam Element");
		System.out.println("Steam Element Class");
	}

}
