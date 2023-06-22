package sample;

public class Final {
	final int a = 10;

	void display() {
		a = 20;
		System.out.println(a);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Final obj = new Final();
		obj.display();
	}

}
