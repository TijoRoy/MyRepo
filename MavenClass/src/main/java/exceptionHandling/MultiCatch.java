package exceptionHandling;

public class MultiCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
try
{
	int a[]=new int[5];
	System.out.println(a[10]);
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
