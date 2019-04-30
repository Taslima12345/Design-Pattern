package BuilderDesignPattern;

import java.util.Scanner;

public class Customer {
	
public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		Coocker mealCooker;
		MainCooker maincooker;
			
				mealCooker = new KidsLunch();	
				
				maincooker = new MainCooker(mealCooker);
				maincooker.makeMeal();
				Lunch meal = maincooker.getMeal();
				
				System.out.println("\n==========Lunch for Kids==========\n");
				System.out.println("Main Dish : " + meal.getMainDish());
				System.out.println("Sweet Item: " + meal.getDesert());
				System.out.println("Soft Drink: " + meal.getSoftDrink());
				System.out.println("Gifts: " + meal.getGift() );
							
		
				mealCooker = new AdultsLunch();				
			
				maincooker = new MainCooker(mealCooker);
				maincooker.makeMeal();
				meal = maincooker.getMeal();
				
				System.out.println("\n==========Lunch for Adults==========\n");
				System.out.println("Main Dish: " + meal.getMainDish());
				System.out.println("Sweet Item: " + meal.getDesert());
				System.out.println("Soft Drink: " + meal.getSoftDrink());
				System.out.println("Gifts: " + meal.getGift());
							
		
	}

}
