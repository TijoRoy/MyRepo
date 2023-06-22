package exceptionHandling;

public class Multicatch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a=10/0;
			System.out.println(a);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e);
			System.out.println("Arithmatic Exception Handled");
		}

		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
			System.out.println("Array Index Out Of Bond Exception Handled");
		}
		System.out.println("Rest of the code");
	}

}
