class a1
{
	{
		System.out.println("this disp");
	}
	public void disp()
	{
		System.out.println("iib of base class ");
	}
}
public class test1 extends a1
{
	public static void main(String []args)
	{
		a1 a = new a1();
		a.disp();							
	}														
}

