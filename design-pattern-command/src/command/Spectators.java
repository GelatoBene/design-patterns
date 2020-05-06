package command;

public class Spectators 
{	
private String exercise;
private String name;

public void setExercise(String exercise)
{
	this.exercise = exercise;
	
	System.out.println("A spectator " + this.exercise);
}
}
