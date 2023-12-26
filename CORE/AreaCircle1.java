class AreaCircle1
{
	public static void main(String[]args)
	{
	area1(5);
	}

	public static double area1(int radius)
	{
	//int radius = 2 ;//Error
	double area = 3.14 * radius * radius ;
	System.out.println("the area of the circle is "+ area);
	return area;
	}
}