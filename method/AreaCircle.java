class AreaCircle
{
	public static void main(String[]args)
	{
	area1(5);
	}

	public static int area1(int radius)
	{
	//int radius = 2 ;//Error
	int area = 3 * radius * radius ;
	System.out.println("the area of the circle is "+ area);
	return area;
	}
}