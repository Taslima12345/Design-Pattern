package bridgeDesignPattern;

public class MuteRemote extends Remote{
	
		public MuteRemote(Ed device) {
			super(device);
		}
		
		public void five()
		{
			System.out.println("paused");
		}

	}



