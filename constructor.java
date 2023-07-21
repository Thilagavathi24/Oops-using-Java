class construct
{
	int num;
	
	construct(int n)
	{
		num=n;
		if(n%2==0)
		   System.out.println("Even");
		else
		   System.out.println("Odd");
	}
	
	public static void main(String args[])
	{
		construct c1= new construct(55);
		construct c2= new construct(40);
	
	}
}