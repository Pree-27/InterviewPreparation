
public class ClassExample {

//(6+8)(12-6)
public int sum(int a,int b) {
	int sum=a+b;
	return sum;
	
}

public int sub(int x,int y) {
	int sub=x-y;
	return sub;
	
}

public int mul(int p,int q) {
	int mul=p*q;
	return mul;
	
}
public static void main(String args[]) {
	ClassExample x=new ClassExample();
	int Sum=x.sum( 6,8);
	int Sub=x.sub(12,6);
	int result=x.mul(Sum,Sub);
	System.out.println(result);

}

}