
public class InTown implements Chain
{
    private  Chain nextInChain;   
  
    public void setNextChain(Chain nextChain) 
    {       
     nextInChain = nextChain;       
    }
     
    public void calculate(Packages request) 
    {
        
        if(request.getCheckWanted() == "InTown")
        {
        	//calling observer
        	Subject subject = new Subject();
        	new ReadyObserver(subject);
            subject.setState(1);
            
            Context context = new Context();
            StartState startState = new StartState();
            StopState stopState = new StopState();
           
            //calling state
            startState.doAction(context);
            System.out.println(context.getState().toString());
                    
            stopState.doAction(context);

            System.out.println(context.getState().toString());
            
             //chain
             
        	System.out.print("~~~ ~~~\n A new package to " + request.getPackageDestination() + " has been registered!\n It contains " 
                    + request.getPackageName() + " which will be delivered within Plovdiv.\n~~~ ~~~");
            
      }
        else 
        {
             
    	  System.out.print("This package cannot be changed!"
    	  		+ "\nAre you sure that it's using 'OutOfCountry',"
    			  + "'InCountry', or 'InTown' ?");           
        }         
   }
	
}
