import java.util.Scanner;
class Fibonacci
{
	public static void main(String[]args)
	{
	Scanner s = new Scanner (System.in);
	System.out.println("Enter the no. of terms to be printed");
	int term = s.nextInt();
	int a = 0 ;
	int b = 1 ;
	System.out.print( a + " " + b + " ");
	for ( int i = 1 ; i <= term - 2 ; i++ )
	{
	int c = a + b;
	System.out.print( c + " ");
	a = b ;
	b = c ;
	
	}
	


	}
}