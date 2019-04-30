package MediatorDesignPattern;

public class Runway implements IColleague {
	
	 private IMediator atcMediator; 
	  
	    public Runway(IMediator atcMediator)  
	    { 
	        this.atcMediator = atcMediator; 
	        atcMediator.setLandingStatus(true); 
	    } 
	
	    
	    public void land()  
	    { 
	        System.out.println("Landing permission granted."); 
	        atcMediator.setLandingStatus(true); 
	    } 

}
