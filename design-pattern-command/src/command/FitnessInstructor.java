package command;

public class FitnessInstructor 
{	
	private Command command;
	
	public Command getCommand() {
		return command;
	}
	
	public void setCommand(Command command) {
		this.command = command;
	}
	
	public void ChangeExercise() {
		System.out.println("+-+- \n Fitness instructor shows something new! \n -+-+-");
		this.command.execute();
	}
}
