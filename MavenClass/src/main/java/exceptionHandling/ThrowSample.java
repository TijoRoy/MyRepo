package exceptionHandling;

public class ThrowSample {
	
	public static void validate(int age)
	{
		if(age<18)
		{
			throw new ArithmeticException("Person is not eligible to vote");
		}
		else
		{
			System.out.println("Person is elibible to vote");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		validate(20); //give value less than 18 to see exception
		System.out.println("rest of the code");
	}

}
