import java.util.Scanner;
class Factorial
{
	public static void main(String[]args)
	{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the value to find out its factorial: ");
	int num = s.nextInt();
	int fact = 1;
	for (int i = num ; i >= 1 ; i--)
	{
	fact = fact * i ;
	}
	System.out.println("The factorial is " + fact);
	}
}