import java.util.Scanner;

public class ExampleOnScanner {
	public static void main(String[] args) {
		System.out.println("Enter marks in paper 1-5: "  );
		Scanner s = new Scanner(System.in);
		int paper1=s.nextInt();
		int paper2=s.nextInt();
		int paper3=s.nextInt();
		int paper4 =s.nextInt();
		int paper5=s.nextInt();
		int sum=paper1+paper2+paper3+paper4+paper5;
		System.out.println("total marks obtained" +sum);
		float percentage=(sum*100)/500;
		System.out.println("Percentage obtained=" +percentage);
		
		
	}

}
