import java.util.Scanner;
class EvenOdd
{
	public static void main(String[]args)
	{

	Scanner s= new Scanner(System.in);
	System.out.println("Enter the value to find out is even or odd");
	int a = s.nextInt();
	String result = a % 2 ==0 ? "Even" : "Odd" ;
	System.out.println("the no. is " + result);

	}

}