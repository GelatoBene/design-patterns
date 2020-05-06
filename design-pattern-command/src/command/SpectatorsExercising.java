package command;
import java.util.ArrayList;
import java.util.List;

public class SpectatorsExercising 
{
	private String exercising;
	
	private List<Spectators> spectators = new ArrayList<Spectators>();
	
	public void setExercise(String exercising)
	{
		this.exercising = exercising;
		for(Spectators spectators: this.spectators) {
			spectators.setExercise(this.exercising);
	}	
		
	}
	public void subscribe(Spectators spectators) {
		this.spectators.add(spectators);		
	}
}
