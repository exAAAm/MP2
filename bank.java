package assign4;
import java.util.Scanner;
public class assign4 {
	String name;
	float accno,dep,with,bal,no,no1;
	int [] b = new int [20];// Syntax for array
	int [] c = new int [20];
	Scanner input = new Scanner(System.in);
void create()
{
	System.out.println("Enter the Name of the holder");
	name = input.next();
	System.out.println("Enter the Amount to be added");
	bal = input.nextFloat();
	System.out.println("Enter Your MObile number ::");
	no = input.nextFloat();
	System.out.println("Your Mobile number will be Account Number");
	
}
void search()
{
	System.out.println("Enter Your Account Number");
	no1 = input.nextFloat();
	if(no1 == no)
	{
		display();
	}
	else
	{
		System.out.println("You have entered the wrong Account Number");
	}
}
void deposit()
{
	System.out.println("Enter the Amount  of Deposit");
	dep = input.nextFloat();
	bal = bal+dep;
	System.out.println("Your Total Amount is :: "+bal);
}

void withdrawl()
{
	System.out.println("Enter the Amount to withdraw");
	with=input.nextFloat();
	if(bal>=with)
	{
		bal=bal-with;
		System.out.println("Your total amount is :: "+with);
	}
	else
	{
		System.out.println("Transaction fail due to amount Exceed");
	}
}
void display()
{
	System.out.println("NAME :: "+name);
	System.out.println("Account Number :: "+no);
	System.out.println("Balance :: "+bal);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner inputs = new Scanner(System.in);
		int x;
		float y=0;
		assign4 as =new assign4();
		do{
		System.out.println("1.Create Account \n 2.Deposit \n 3.Withdrawl \n 4.Search \n 5.Exit");
		x = inputs.nextInt();
		switch(x)
		{
		case 1:
		{
			as.create();
			break;
		}
		case 2:
		{
			as.deposit();
			break;
		}
		case 3:
		{
			as.withdrawl();
			break;
		}
		case 4:
		{
			as.search();
			break;
		}
		case 5:
		{
			break;
		}
		}
	
	System.out.println("Press 1 for continue and 0 for exit");
	y = inputs.nextFloat();
		}while(y==1);
	}
}

