package command;

public class StandUp implements Command 
{
	private SpectatorsExercising spectatorsExercising;
	
	public StandUp(SpectatorsExercising spectatorsExercising) 
	{
		this.spectatorsExercising = spectatorsExercising;
	}
	
	@Override
	public void execute() 
	{
		spectatorsExercising.setExercise("has stood up.");
	}
}
