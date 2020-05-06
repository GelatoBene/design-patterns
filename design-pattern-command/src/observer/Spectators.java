package observer;

public class Spectators implements Observer
{	
	private String exercising;
	private Observable spectatorsExercising;
	
	public void update() 
	{
		if(spectatorsExercising == null) {
			System.out.println("Exercises missing!");
			return;
	}
		
		exercising = spectatorsExercising.getUpdate();
		System.out.println("A spectator is now "+ this.exercising);
		
	}

	public void setSpectatorsExercising(Observable spectatorsExercising) 
	{
		this.spectatorsExercising = spectatorsExercising;
	}
	
	public String getSpectatorsExercising() 
	{
		return this.exercising;
	}

	public void setSpectatorsExercising(String exercising) 
	{
		this.exercising = exercising;
	}
	
}
