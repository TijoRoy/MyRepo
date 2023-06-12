package interface1;

public class A7 implements Printablemulti,Showablemulti
{
public void print()
{
	System.out.println("Hellow");
}
public void show()
{
	System.out.println("Welcome");
}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		A7 obj=new A7();
		obj.print();
		obj.show();

	}

}
