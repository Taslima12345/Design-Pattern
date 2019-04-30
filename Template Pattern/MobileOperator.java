package templateDesign;

abstract class MobileOperator{

	public double peakHourTalking;
	public double billForPeakHour;

	public double offPeakHourTalking;
	public double billForOffPeakHour;

	public double peakHourRate;
	public double offPeakHourRate;

	public String myStartingTime, myEndingTime;

	final void BillTheCustomer(){

		PeakHourRange();
		GetTalkTimeInSec();
		
		PeakHourBilling();
		OffPeakHourBilling();

		printTheBill();
	}


	abstract void PeakHourBilling();
	abstract void OffPeakHourBilling();

	void PeakHourRange(){
		String peakStarts = "12:30:00";	
		String peakEnds = "15:00:00";		
	}
	


	void GetTalkTimeInSec(){

    	String[] startingParts = myStartingTime.split(":");
    	String[] endingParts = myEndingTime.split(":");

    	double peakStartTotalSec = 12*3600 + 30*60 + 0;
    	double peakEndTotalSec =15*3600 + 0*60 + 0;

    	double myStartingTotalSec = Integer.parseInt(startingParts[0])*3600 + 
    				Integer.parseInt(startingParts[1])*60 + Integer.parseInt(startingParts[2]);
    	double myEndingTotalSec = Integer.parseInt(endingParts[0])*3600 + 
    				Integer.parseInt(endingParts[1])*60 + Integer.parseInt(endingParts[2]);


    	if(myStartingTotalSec>=peakStartTotalSec && myEndingTotalSec<=peakEndTotalSec){

    		peakHourTalking = myEndingTotalSec-myStartingTotalSec;
    		
    	}
    	
    	else if(myStartingTotalSec<peakStartTotalSec && myEndingTotalSec<peakStartTotalSec){
    		peakHourTalking = 0;
    		offPeakHourTalking = myEndingTotalSec- myStartingTotalSec;
    	}

    	else if(myStartingTotalSec>peakEndTotalSec && myEndingTotalSec>peakEndTotalSec){
    		peakHourTalking = 0;
    		offPeakHourTalking = myEndingTotalSec- myStartingTotalSec;
    	}
    	
    	else if(myStartingTotalSec<peakStartTotalSec && myEndingTotalSec<=peakEndTotalSec){
    		peakHourTalking = (myEndingTotalSec- peakStartTotalSec);
    		offPeakHourTalking = peakStartTotalSec- myStartingTotalSec;
    	}

    	else if(myStartingTotalSec>=peakStartTotalSec && myEndingTotalSec>peakEndTotalSec){
    		peakHourTalking = peakEndTotalSec- myStartingTotalSec;
    		offPeakHourTalking = myEndingTotalSec- peakEndTotalSec;
    	}

    	else if(myStartingTotalSec<peakStartTotalSec && myEndingTotalSec>peakEndTotalSec){
    		peakHourTalking = peakEndTotalSec- peakStartTotalSec;
    		offPeakHourTalking = (peakStartTotalSec-myStartingTotalSec) + (myEndingTotalSec-peakEndTotalSec);
    	}


	}

	void printTheBill(){
		System.out.println("Peak Hour Talking: "+ peakHourTalking);
		System.out.println("Off-Peak Hour Talking: "+ offPeakHourTalking);
		System.out.println("Total Bill: "+ (billForPeakHour+ billForOffPeakHour));
	}

}
