package Package1;

import java.util.Scanner;

class AgeException extends Exception
{
	private int age;
	AgeException(int a)
	{
		this.age=a;
	}
	public String toString()
	{
		return age+" is an invalid age";
	}
}
class emp
{
	String name;
	int age;
	void getempdetails() throws AgeException
	{
		System.out.println("Enter your name:");
		Scanner sc=new Scanner(System.in);
		name=sc.next();
		System.out.print("Enter your age");
		age=sc.nextInt();
		if(age<16)
		{
			
		}
	}
}
public class TC_UserDefinedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		emp obj=new emp();
		obj.getempdetails();
	}

}
