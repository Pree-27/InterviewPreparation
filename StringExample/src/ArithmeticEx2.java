
public class ArithmeticEx2 {
	//(((((10+2)+2)-2)*2)/2)
	public int sum(int x1,int x2) {
		
		int sumofTwoNumbers=x1+x2;
		System.out.println("Sum of 2 numbers" +sumofTwoNumbers);
		return sumofTwoNumbers;
		
	}
public int sub(int a1,int a2) {
		
		int subofTwoNumbers=a1-a2;
		System.out.println("Subtraction of 2 numbers" +subofTwoNumbers);
		return subofTwoNumbers;
		
	}
public int mul(int c1,int c2) {
	
	int multiplicationofTwoNumbers=c1*c2;
	System.out.println("multiplication of 2 numbers" +multiplicationofTwoNumbers);
	return multiplicationofTwoNumbers;
	
}
public int Div(int d1,int d2) {
	
	int divisionofTwoNumbers=d1/d2;
	System.out.println("devision of 2 numbers" +divisionofTwoNumbers);
	return divisionofTwoNumbers;
	
}

public static void main(String args[]) {
	ArithmeticEx2 arobj=new ArithmeticEx2();
	int Sum=arobj.Div(arobj.mul(arobj.sub(arobj.sum(arobj.sum(10,2),2 ),2),2),2);
	
	System.out.println("The answer of (((((10+2)+2)-2)*2)/2) is---" +Sum);
}
}