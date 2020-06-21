
public class InCountry implements Chain
{
    private  Chain nextInChain;   
  
    public void setNextChain(Chain nextChain) 
    {       
     nextInChain = nextChain;       
    }
     
    public void calculate(Packages request) 
    {
        
        if(request.getCheckWanted() == "InCountry")
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
                    + request.getPackageName() + " which will be delivered within Bulgaria.\n~~~ ~~~");
            
      } 
        else 
      {
             
            nextInChain.calculate(request);

             
        }         
   }
	
}
