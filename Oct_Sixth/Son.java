package inheritance;

public class Son extends GrandFather implements Mother,Father{

	public String example = "Sub Class";
	@Override
	public void teach() {
		System.out.println("Multiple Inheritance");
		System.out.println(this.example);
		System.out.println("This is usage of super "+super.example);
	}

	@Override
	public void strict() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void love() {
		// TODO Auto-generated method stub
		
	}
	

}
