package observer;
import java.util.ArrayList;
import java.util.List;

public class SpectatorsExercising implements Observable
{
	private List<Observer> observers = new ArrayList<Observer>();
	private String training ; 

	public void setExcercising(String training) 
	{
		this.training = training;
		this.notifyObservers();
	}

	
	public String getUpdate() 
	{
		return training;
	}

	
	public void subscribe(Observer observer) 
	{
		observer.setSpectatorsExercising(this);
		this.observers.add(observer);
		
	}

	
	public void unsubscribe(Observer observer) 
	{
		this.observers.remove(observer);
	}

	@Override
	public void notifyObservers() 
	  {
		for(Observer observer: this.observers)
		{
			observer.update();		
		}
	  }
}
