public class StopState implements State 
{

   public void doAction(Context context) 
   {
      System.out.println("*** ***\nThe employee has checked the package...\n");
      context.setState(this);	
   }

   public String toString()
   {
      return "... the package will now be registered\n*** ***";
   }
}