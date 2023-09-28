import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
import java.io.File;
import java.lang.String;


public class BusinessLevelOps 
	{
		
		public static void operations() throws IOException
		{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println(" 1.Add\n 2.Delete\n 3.Search\n 4.Return to main menu");
		int option = sc.nextInt();
	
		
		switch(option)
		
		{
		case 1:
			System.out.println("Enter file name you want to add : ");
			String fname = sc.next();
			fname.equalsIgnoreCase(fname);
			
			File  fileAdd = new File("C:\\JavaSessions\\FileFolder\\" + fname);
			if(fileAdd.exists()==true)
			{
				System.out.println("File Already exist");
			}
			else
			{
				fileAdd.createNewFile();
				System.out.println("File Created.....");
			
			}
	        break;
			
		case 2:
			System.out.print("Please enter the file name you want to delete");
			String DelName = sc.next();
			
			File dDel = new File("C:\\JavaSessions\\FileFolder\\" + DelName);
			
			if (dDel.exists()==true)
			{
				dDel.delete();
				System.out.println("File Deleted");
			}
			else
			{
				System.out.println("File Not found");
			}
			
			
		break;
			
		case 3:
			
			System.out.println("Enter the path of the folder: ");
		      String pathStr = sc.next();        
		      System.out.println("Please enter the file name you want to search");
					String FindName = sc.next();
		           
		      File ObjFind = new File(pathStr);
		      String[] list = ObjFind.list();
		      
		      boolean les = false;      
		      for (int i = 0; i < list.length; i++) {
		         if(FindName.equals(list[i])){
		            les = true;
		         }
		      }        
		      if(les)
		      {
		         System.out.println("File Found");
		      }else
		      {
		         System.out.println("File Not Found");
		      }
		      break;
			
			
		     
		case 4:
			try {
				Welcome.Home();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
			break;
			default:
				System.out.println("Invalid input");
		}
		}
		
}      
	    	 

