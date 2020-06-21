
public class ReadyObserver extends Observer 
{
	

		   public ReadyObserver(Subject subject)
		   {
		      this.subject = subject;
		      this.subject.attach(this);
		   }

		   @Override
		   public void update() 
		   {
		      System.out.println( "\n--- ---\nThe office is ready for the next customer.\n--- ---" ); 
		   }
		
}
