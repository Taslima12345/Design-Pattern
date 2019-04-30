package bridgeDesignPattern;

public class MainClass {
	
	public static void main(String [] args)
	{
		Remote t = new PauseRemote(new Tv());
		
		t.five();
		
		System.out.println();
		
		Remote d = new MuteRemote(new Dvd());
		
		d.five();
		
	}
	
	

}
