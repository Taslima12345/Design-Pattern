package MediatorDesignPattern;

public class MediatorDesignPattern {
	
	public static void main(String args[])  
    { 
  
        IMediator atcMediator = new Mediator(); 
        Colleague sparrow101 = new Colleague(atcMediator); 
        Runway mainRunway = new Runway(atcMediator); 
        atcMediator.registerFlight(sparrow101); 
        atcMediator.registerRunway(mainRunway); 
        sparrow101.getReady(); 
        mainRunway.land(); 
        sparrow101.land(); 
          
    } 

}
