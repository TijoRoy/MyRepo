package exceptionHandling;

public class FinallySample {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try
		{
			int a=25/5;
			System.out.println(a);
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("Finally clock is always exceuted");
		}
		System.out.println("Rest of the Code");
	}

}
