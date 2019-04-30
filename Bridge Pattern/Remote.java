package bridgeDesignPattern;

public abstract class Remote {
	
	private Ed device;
	
	public Remote(Ed device)
	{
		this.device = device;
	}
	
	public void one()
	{
		device.One();
	}
	public void two()
	{
		device.two();
	}
	public void three()
	{
		device.three();
	}
	public void four()
	{
		device.four();
	}
	
	public abstract void five();
}
