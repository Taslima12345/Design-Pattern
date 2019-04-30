package templateDesign;


class Airtel extends MobileOperator{

	void PeakHourBilling(){
		billForPeakHour = 0.5*peakHourTalking;
	}

	void OffPeakHourBilling(){
		billForOffPeakHour = 0.75*offPeakHourTalking;
	}
}