package abstraction;

public class C1 extends B1
{
void show()
{
	System.out.println("Morning");
}
void print()
{
	System.out.println("Non Abstract Method");
}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		C1 obj=new C1();
		obj.display();
		obj.show();
		obj.print();

	}

}
