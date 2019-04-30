package BuilderDesignPattern;

class AdultsLunch implements Coocker{

	private Lunch meal;
	
	public AdultsLunch(){
	
		this.meal = new Lunch();
	}
	
	public void cookMainDish(){
		
		meal.setMainDish("Pizza");
	}
	
	public void cookDesert(){
	
		meal.setDesert("Cheese Cake");
	}
	
	public void prepareSoftDrink(){
	
		meal.setSoftDrink("Fanta");
	}
	
	public void makeGift(){
	
		meal.setGift("Key Ring");
	}
	
	public Lunch getMeal(){
		
		return this.meal;
	}
}
