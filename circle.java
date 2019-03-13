package assig2;
import java.util.Scanner; //Import library
public class assig2 {
	Scanner input = new Scanner(System.in);
	float r;
	float c,a,d;
	void input()
	{
		System.out.println("Enter the radius of the circle");//Syntax for the print "System.out.println" ln-new line
		r = input.nextFloat();
	}
	void area()
	{
		a=(float) (3.14*(r*r));
		System.out.println("The area is :: "+a);
	}
	
	void diameter()
	{
		d = (float)(2*r);
		System.out.println("The diameter is :: "+d);
	}
	
	void circumference()
	{
		c= (float)(2*3.14*r);
		System.out.println("The circumference of the circle is :: "+c);
	}

//---------------------------------------------------------------------------------------------------------------------
	//This is the main function
	public static void main(String[] args)//by default in eclipse {
		// TODO Auto-generated method stub
		Scanner inputs = new Scanner(System.in);//Syntax for the scan input where "Scanner" is the object
		String x;
		float y;
		assig2 as =new assig2(); // Syntax to create the object for the class "as"-object for class assig2
		do {
		as.input();
		System.out.print("Enter Ur Choice \n A.Area Of the Circle \n D.Diameter of the Cirle \n C.Circumference of the Circle \n");
		x = inputs.next();
		switch(x)
		{
		case "A":
		{
			as.area();
			break;
		}
		case "D":
		{
			as.diameter();
			break;
		}
		case "C":
		{
			as.circumference();
			break;
		}
	}
		System.out.println("Press 1 for Continue and 0 for exit");
		y=inputs.nextFloat();
		}while(y==1);
}
}

/*
Define class Outside the main Function and call the it by creating Object of class in main function
*/
