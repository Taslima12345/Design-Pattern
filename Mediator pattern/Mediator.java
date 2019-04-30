package MediatorDesignPattern;

public class Mediator implements IMediator {
	
	    private Colleague flight; 
	    private Runway runway; 
	    public boolean land; 
	  
	    public void registerRunway(Runway runway)  
	    { 
	        this.runway = runway; 
	    } 
	  
	    public void registerFlight(Colleague flight)  
	    { 
	        this.flight = flight; 
	    } 
	  
	    public boolean isLandingOk()  
	    { 
	        return land; 
	    } 
	  
	    @Override
	    public void setLandingStatus(boolean status)  
	    { 
	        land = status; 
	    } 
}
