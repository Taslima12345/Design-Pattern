package MediatorDesignPattern;

public interface IMediator {
	
	 	public void registerRunway(Runway runway); 
	  
	    public void registerFlight(Colleague flight); 
	  
	    public boolean isLandingOk(); 
	  
	    public void setLandingStatus(boolean status); 
}
