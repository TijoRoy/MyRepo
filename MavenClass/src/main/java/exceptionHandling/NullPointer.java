package exceptionHandling;

public class NullPointer 
{
	void show()
	{
		try
		{
			String s=null;
			System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		System.out.println("Null Pointer Exception Handled");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NullPointer obj=new NullPointer ();
		obj.show();

	}

}
