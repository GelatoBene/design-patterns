package command;

public class LieDown implements Command 
{
	private SpectatorsExercising spectatorsExercising;
	
	public LieDown(SpectatorsExercising spectatorsExercising) 
	{
		this.spectatorsExercising = spectatorsExercising;
	}
	
	@Override
	public void execute() 
	{
		spectatorsExercising.setExercise("has lied down.");
	}
}
