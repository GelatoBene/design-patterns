package MediatorFactory;
import java.util.ArrayList;

public class MessageManager 
{

	private static ArrayList<Users> users = new ArrayList();
	
	private static Bot bot;
	private static FactoryCreator factory = new FactoryCreator();
	
	public static void showMessage(Users user, String message)
	{	
		System.out.println("[" + user.getName()+"] "+ ": " + message);
		
		if(bot != null && message.contains("cat"))
		{
			bot.removeUser(user);
			bot.printMessage();			
		}		
		else if(message.equalsIgnoreCase("addBot"))
		{
			bot = factory.createBot();		
		}
	}
	
	public static void AddUser(Users user) 
	{
		if(user!= null) 
		{
			users.add(user);
		}
	}
	
	public static void RemoveUser(Users user) 
	{	
		if(user!= null && users.contains(user)) 
		{	
			users.remove(user);
			System.out.println("-~-\n User " + user.getName() + " has been kicked out due to indecent language \n-~-");
		}
	}
}
