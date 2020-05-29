package MediatorFactory;

public class Main 
{
public static void main(String[] args) 
{
		Factory factory = new FactoryCreator();
		
		Users Gosho = factory.createUser("Gosho");
		Users Mosho = factory.createUser("Mosho");
		Users Bosho = factory.createUser("Bosho");
		
		MessageManager.AddUser(Gosho);
		MessageManager.AddUser(Mosho);
		MessageManager.AddUser(Bosho);
	
		Gosho.sendMessage("Gosho reporting for duty!");
		Mosho.sendMessage("Roger!");
		Bosho.sendMessage("..affirmative");

	
		Gosho.sendMessage("Do you guys see that on the road?");
		Mosho.sendMessage("yes, it seems like a.. a ca--");
		Mosho.sendMessage("addBot");
		Bosho.sendMessage("A cat ?");
		Gosho.sendMessage("Mission success!");
		Mosho.sendMessage("Like taking fish from a cat! Oh, wait..");
		Gosho.sendMessage("Mission double success!");		
	}
}
