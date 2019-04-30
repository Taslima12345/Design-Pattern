package bridgeDesignPattern;

public class PauseRemote extends Remote{
	public PauseRemote(Ed device) {
		super(device);
	}
	
	public void five()
	{
		System.out.println("paused");
	}

}
