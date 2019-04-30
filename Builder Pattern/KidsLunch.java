package BuilderDesignPattern;

class KidsLunch implements Coocker{

	private Lunch meal;
	
	public KidsLunch(){
	
		this.meal = new Lunch();
	}
	
	public void cookMainDish(){
		
		meal.setMainDish("Burger");
	}
	
	public void cookDesert(){
	
		meal.setDesert("Donut");
	}
	
	public void prepareSoftDrink(){
	
		meal.setSoftDrink("Pepsi");
	}
	
	public void makeGift(){
	
		meal.setGift("Car");
	}
	
	public Lunch getMeal(){
		
		return this.meal;
	}
}
