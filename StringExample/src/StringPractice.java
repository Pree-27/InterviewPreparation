
public class StringPractice {
      public static void main(String[] args) {
		String Myname="Pr";
		String MydaughterName="Vi";
		String MyMaidenName="Preethi Mandarthi";
		
	int	asciiCompareresult=Myname.compareTo(MydaughterName);
		System.out.println("Asci Differenec" +asciiCompareresult);
		if(Myname==MydaughterName)
			System.out.println("The address of Myname and MydaughterName is  same");
	
		else 
			System.out.println("The address of Myname and MydaughterName is not same");
	
      if(Myname==MyMaidenName) {
			System.out.println("The address of Myname and MyMaidenName is  same");
		}
		else 
			System.out.println("The Address of Myname and MyMaidenName is  not same");
	}
}
