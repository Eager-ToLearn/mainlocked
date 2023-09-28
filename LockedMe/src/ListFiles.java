import java.io.File;


public class ListFiles 
{
File file = new File("C:\\JavaSessions\\FileFolder");
String[] files = file.list();
{


for (String string : files)
{
	System.out.println(string);
}
}
}