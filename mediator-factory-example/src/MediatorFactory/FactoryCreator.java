package MediatorFactory;

public class FactoryCreator extends Factory 
{
	public FactoryCreator() 
	{
		factoryUsers = new FactoryUsers();
		factoryBot = new FactoryBots();	
	}

}
