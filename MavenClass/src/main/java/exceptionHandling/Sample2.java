package exceptionHandling;

public class Sample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a=10/0;
			System.out.println("rest of the code");
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("Exception Handled");
		}
		

	}

}
