import java.util.Locale;
import java.util.Scanner;

public class Exercicio7{
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double x,y;

		x = sc.nextDouble();
		y = sc.nextDouble();

		if(x==0.0 && y==0.0)
			System.out.println("Origem");
		if(x>0.0 && y<0.0)
			System.out.println("Q4");
		if(x>0.0 && y>0.0)
			System.out.println("Q1");
		if(x<0.0 && y<0.0)
			System.out.println("Q3");
		if(x<0.0 && y>0.0)
			System.out.println("Q2");

		
		sc.close();
	}
}