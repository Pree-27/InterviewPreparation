
public class clarguements {
public static void main(String[] preethi) {
	System.out.println("total number of arguemnets :" +preethi.length);
	Object obj=new Object();
	obj=preethi;
	
	for(int i=0;i<preethi.length;i++) {
		System.out.println("Arguements passsed through commandline :" +obj.toString());
	}
	System.out.println("Arguements passsed through commandline :" +preethi.toString());
}
}
