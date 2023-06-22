package excel;

import java.io.IOException;

public class ExcelClassDemo1 {

	public static void main(String[] args) throws IOException {

		String d=ExcelClassDemo.getIntegerData(1,0);
		System.out.println(d);
		
		String b=ExcelClassDemo.getStringData(3,1); //this is class name of previous class
System.out.println(b);
	}

}
