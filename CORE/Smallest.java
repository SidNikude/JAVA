import java.util.Scanner;
class Smallest
{
	public static void main(String[]args)
	{
	Scanner s = new Scanner(System.in);
	System.out.println("Enter two values");
	int a = s.nextInt();
	int b = s.nextInt();
	int smallest = a < b? a : b ;
	System.out.println("The smallest no. is " + smallest);
}
}