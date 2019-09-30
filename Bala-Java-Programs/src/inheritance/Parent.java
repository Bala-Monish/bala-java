package inheritance;

public class Parent implements ParentIf{

	private String privateString = "privateString";
	public String publicString = "publicString";
	protected String protectedString = "protectedString";
	String defaultString = "defaultString";
	@Override
	public void acquireKnowledge() {
		System.out.println("Acquire knowledge on Forming");
	}
	 
}
