package Package1;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class TC_FileWrite {
	public static void main(String[] args) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter text");
		String text=sc.nextLine();
		FileWriter fw=new FileWriter("C:\\Users\\Shivam.Saroj\\Downloads\\hifilewrite.txt");
		fw.write(text);
		fw.close();
	}

}
