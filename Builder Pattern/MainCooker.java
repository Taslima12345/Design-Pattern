package BuilderDesignPattern;

public class MainCooker{

	private Coocker Coocker;
	
	public MainCooker(Coocker cooker){
	
		Coocker = cooker;
	}
	
	public Lunch getMeal(){
		
		return this.Coocker.getMeal();
	}
	
	public void makeMeal(){
		
		this.Coocker.cookMainDish();
		this.Coocker.cookDesert();
		this.Coocker.prepareSoftDrink();
		this.Coocker.makeGift();
	}
}