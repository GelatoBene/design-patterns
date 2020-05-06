package observer;

public class FitnessInstructor 
{
	SpectatorsExercising spectatorsExercising;
	
	public FitnessInstructor(SpectatorsExercising spectatorsExercising)
    {
	this.spectatorsExercising = spectatorsExercising;
    }
	public void ChangeExercising(String newExercises)
	{
		this.spectatorsExercising.setExcercising(newExercises);
	}	
}
