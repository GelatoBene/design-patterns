package MediatorFactory;

public class Users 
{
	   private String name;

	   public String getName() 
	   {
	      return name;
	   }

	   public void setName(String name) 
	   {
	      this.name = name;
	   }

	   public Users(String name)
	   {
	      this.name  = name;
	   }

	   public void sendMessage(String message)
	   {
	      MessageManager.showMessage(this,message);
	   }
}
