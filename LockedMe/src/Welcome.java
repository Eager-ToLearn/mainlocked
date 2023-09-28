import java.io.IOException;
import java.util.Scanner;


public class Welcome 
{ 
	public static void Home() throws IOException
	{
	System.out.println("WELCOME TO LOCKED! \n \nDeveloper: Tebogo Makeke\n");
	
		Scanner op = new Scanner(System.in);
		
		System.out.println("Please choose an option to interact with application\n");
		System.out.println("  Main\n1.ListFiles\n 2.Business Operations\n 3.Close Application");
	    int ch = op.nextInt();
	    
	
	
	switch(ch)
	{
	case 1:
		ListFiles Obj = new ListFiles();
		System.out.println(Obj.files);
		
		break;
		
	case 2:
		BusinessLevelOps.operations();
		break;
		
	case 3:
		
		System.exit(0);
		break;
		
		default:
			System.out.println("Invalid Choice");
		
	}
		
	}
	}

