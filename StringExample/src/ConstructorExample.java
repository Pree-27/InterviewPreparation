
public class ConstructorExample {
	
	
	
	public ConstructorExample() {
		this(3,4,5,6);
		System.out.println("default constructor called");
	}
	public ConstructorExample(int a) {
		this();
		System.out.println("One parameterised constructor called");
	}
	public ConstructorExample(int a,int b) {
		this(3,4,5);
		System.out.println("Two parameterised constructor called");
	}
	public ConstructorExample(int a,int b,int c) {
		this(3);
		System.out.println("Three parameterised constructor called");
	}
	public ConstructorExample(int a,int b,int c,int d) {
		System.out.println("Four parameterised constructor called");
	}
public static void main(String[] args) {
	ConstructorExample ex=new ConstructorExample(5,6);
}
}
