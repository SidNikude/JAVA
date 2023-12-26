class Local4
{
	public static void main(String[]args)
	{
	System.out.println("Main Begins");
	int a = 10;
	int b = 20;
	{
	System.out.println("Inner Block Begins");
	int c = 20;
	a = b + c ;
	System.out.println(a);
	System.out.println(c);
	System.out.println("Inner Block Ends");
	}
		
	
	System.out.println("Main Block Ends");

	}
}