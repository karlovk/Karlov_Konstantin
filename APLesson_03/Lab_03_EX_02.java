import java.util.Scanner;

public class Lab_03_EX_02
{
	public static void main (String[]args )
	{
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("What is your height ? ");
		double h = keyboard.nextInt();
		
		System.out.println("What is your weight ? ");
		double w = keyboard.nextInt();
		
		double HH = h * h ;
		double a = w / HH;
		double bmi = 703 * a;
		
		System.out.println("BMI is  " + bmi );
		
		
	}
}