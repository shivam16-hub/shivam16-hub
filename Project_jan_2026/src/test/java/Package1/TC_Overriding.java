package Package1;
class animal
{
	void sound()
	{
		System.out.println("Animal makes sound");
	}
	}
	class cat extends animal
	{
		
		void sound()
		{
			System.out.println("Cat makes sound");
			
		}
	}

public class TC_Overriding {
public static void main(String[] args)
{
	animal a=new cat();
	a.sound();
}
}
