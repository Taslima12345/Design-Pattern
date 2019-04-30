package templateDesign;


class Robi extends MobileOperator{
	
	void PeakHourBilling(){
		billForPeakHour = 0.25*peakHourTalking;
	}

	void OffPeakHourBilling(){
		billForOffPeakHour = 0.8*offPeakHourTalking;
	}
}

