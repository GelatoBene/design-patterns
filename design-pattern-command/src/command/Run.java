package command;

public class Run 
{	
	public static void main(String[] args) 
	{
		FitnessInstructor instructor = new FitnessInstructor();
		SpectatorsExercising spectatorsExercising = new SpectatorsExercising();
		
		Spectators Zdravko = new Spectators();
		Spectators Jivko = new Spectators();
		Spectators Julius_Caesar = new Spectators();
		
		spectatorsExercising.subscribe(Zdravko);
		spectatorsExercising.subscribe(Jivko);
		spectatorsExercising.subscribe(Julius_Caesar);
				
		Command exerciseStandUp = new StandUp(spectatorsExercising);
		Command exerciseLieDown = new LieDown(spectatorsExercising); 
		
		instructor.setCommand(exerciseStandUp);
		instructor.ChangeExercise();
		
		instructor.setCommand(exerciseLieDown);
		instructor.ChangeExercise();	
	}
}
