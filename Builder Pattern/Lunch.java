package BuilderDesignPattern;

class Lunch implements FinalLunch{

	private String mainDish;
	private String desert;
	private String softDrink;
	private String gift;
	
	public void setMainDish(String dish){
		this.mainDish = dish;
	}
	
	public void setDesert(String desert){
		this.desert = desert;
	}
	
	public void setSoftDrink(String drink){
		this.softDrink = drink;
	}
	
	public void setGift(String gift){
		this.gift = gift;
	}
	
	public String getMainDish(){ return mainDish; }
	public String getDesert(){ return desert; }
	public String getSoftDrink(){ return softDrink; }
	public String getGift(){ return gift; }
}
