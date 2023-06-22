package exceptionHandling;

public class ArrayIndexOutOfBond {
	void show()
	{
		try
		{
			int a[]=new int[6];
			a[9]=20;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		System.out.println("Array Exception Handled");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayIndexOutOfBond obj=new ArrayIndexOutOfBond();
		obj.show();

	}
}

