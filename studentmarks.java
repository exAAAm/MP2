package assign1;
import java.util.Scanner;

public class assign1 {
	String name;
	float id,correctness,quality,deduct,grade,score;
	Scanner input = new Scanner(System.in);
	
void marks()
{
	System.out.println("Enter the name of the candidate");
	name = input.next();
	System.out.println("Enter the student ID");
	id = input.nextFloat();
	System.out.println("Enter the Program correctness");
	correctness = input.nextFloat();
	System.out.println("Enter the Quality of the Style");
	quality = input.nextFloat();
	System.out.println("Enter the Marks to be deducted");
	deduct = input.nextFloat();
	System.out.println("ENter the overall score");
	score = input.nextFloat();
}
void calc()
{
	grade = correctness + quality + deduct + score;
	grade = grade/4;
}
void display()
{
	System.out.println("      CS-101 MINI PROJECT-II");
	System.out.println("Programming Assignment 1");
	System.out.println("Student Name ::  "+name);
	System.out.println("STUDENT ID"+id);
	System.out.println("Program correctness"+correctness);
	System.out.println("Quality of the Style"+quality);
	System.out.println("Late Deduction"+deduct);
	System.out.println("Overall Score"+score);
	if(grade>=9)
	{
		System.out.println("Comments::Excellent");
	}
	else if(grade>=8)
	{
		System.out.println("Comments::Very Good");
	}
	else if(grade>=7)
	{
		System.out.println("Commments::Good");

	}
	else if(grade>=6)
	{
		System.out.println("Comments::thik thak");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		assign1 as = new assign1();
		as.marks();
		as.calc();
		as.display();
		
	}

}
