package MediatorFactory;

public class Factory 
{
	protected FactoryUsers factoryUsers;
	protected FactoryBots factoryBot;
	
	public Users createUser(String name)
	{
		return factoryUsers.createUser(name);		
	}
	public Bot createBot()
	{
		return factoryBot.createBot();
	}
}
