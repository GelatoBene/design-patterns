package observer;

public class Run 
{
	public static void main(String[] args) 
	{
		SpectatorsExercising spectatorsExercising = new SpectatorsExercising();
		
		FitnessInstructor fitnessintructor = new FitnessInstructor(spectatorsExercising);
		
		Observer Zdravko= new Spectators();
		Observer Jivko= new Spectators();
		Observer Julius_Caesar= new Spectators();
		
		spectatorsExercising.subscribe(Zdravko);
		spectatorsExercising.subscribe(Jivko);
		spectatorsExercising.subscribe(Julius_Caesar);
		
		fitnessintructor.ChangeExercising("laying down.");
		System.out.println("-+-+-");
		fitnessintructor.ChangeExercising("standing up.");	
	}
}
