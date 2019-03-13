package inherit;
import java.util.Scanner;
public class inherit {
	float diameter,radius,circumference,area;
	Scanner input = new Scanner(System.in);
	
	void are()
	{
		area=(float) (3.14*(radius*radius));
		System.out.println("The area is :: "+area);
	}
	void circum()
	{
		circumference = (float)(2*3.14*radius);
		System.out.println("The circumference of the circle is :: "+circumference);
	}
	void diam()
	{
		diameter = (float)(2*radius);
		System.out.println("The diameter is :: "+diameter);
	}
//------------------------------------------------------------------------------------------------------------------------------
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		inherit1 ih =new inherit1();
		ih.input();
		ih.are();
		ih.diam();
		ih.circum();
	}
//----------------------------------------------------------------------------------------------------------------------------
}

class inherit1 extends inherit //Extends is a syntax for inheriting y=the class properties
{
	void input()
	{
		System.out.println("Enter the radius of the circle");
		radius = input.nextFloat();
	}
}



