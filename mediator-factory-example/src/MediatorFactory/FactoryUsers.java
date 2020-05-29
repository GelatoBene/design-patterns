package MediatorFactory;

public class FactoryUsers 
{
	public Users createUser(String name)
	{
		return new Users(name);
	}
}
