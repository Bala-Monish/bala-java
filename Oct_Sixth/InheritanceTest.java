package inheritance;

public class InheritanceTest {
	public static int myMethod() {
		int x = 10;
		int y = 10;
		return x+y;
	}
	public void secondMethod() {
		System.out.println("Non Static Method");
	}
	public static void main(String[] args) {
		
		Son son = new Son();
		son.teach();
		int z = myMethod();//Static Methods don't need object creation
		System.out.println("Static Method "+z);
		InheritanceTest nonStaticMethod = new InheritanceTest();
		nonStaticMethod.secondMethod();
	}
}
