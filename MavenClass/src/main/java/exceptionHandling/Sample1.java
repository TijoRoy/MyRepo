package exceptionHandling;

public class Sample1 {

	void display()
	{
	try
	{
		int a=10/0;
	}
	catch(ArithmeticException e)
	{
		System.out.println(e);
	}
	System.out.println("Exception Handled");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Sample1 obj=new Sample1();
obj.display();
	}


}
