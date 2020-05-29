package MediatorFactory;

public class Bot 
{
	public void printMessage() 
	{
		System.out.println("//Cat-Bot//: The word 'cat' is forbidden in this chat!");
	}
	public void removeUser(Users user) 
	{
		MessageManager.RemoveUser(user);
	}
}
