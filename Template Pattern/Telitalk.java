package templateDesign;


class Telitalk extends MobileOperator{
	
	void PeakHourBilling(){
		billForPeakHour = 0.25*peakHourTalking;
	}

	void OffPeakHourBilling(){
		billForOffPeakHour = 1.25*offPeakHourTalking;
	}
}
