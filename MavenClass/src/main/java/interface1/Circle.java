package interface1;

public class Circle implements Drawable
{
	public void draw()
	{
		System.out.println("drawing circle");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
Circle d=new Circle();
d.draw();
Rectangle e=new Rectangle();
e.draw();
	}

}
