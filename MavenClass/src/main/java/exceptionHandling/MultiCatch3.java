package exceptionHandling;

public class MultiCatch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			int a[]=new int[5];
			//System.out.println(a[5]);
			a[5]=30/0;
			System.out.println(a[5]);
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
