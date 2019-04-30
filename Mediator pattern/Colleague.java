package MediatorDesignPattern;

public class Colleague implements IColleague {
	
	private IMediator atcMediator; 
	  
    public Colleague(IMediator atcMediator)  
    { 
        this.atcMediator = atcMediator; 
    } 
  
    public void land()  
    { 
        if (atcMediator.isLandingOk())  
        { 
            System.out.println("Successfully Landed."); 
            atcMediator.setLandingStatus(true); 
        } 
        else
            System.out.println("Waiting for landing."); 
    } 
  
    public void getReady()  
    { 
        System.out.println("Ready for landing."); 
    } 

}
