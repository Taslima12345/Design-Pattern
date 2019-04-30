package command;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class RemoteControl {
	
	private Circle circle;  
	private List <Command> doL = new ArrayList <Command> ();
	private List <Command> undoL = new ArrayList <Command> (); 
  
	
	public Circle getCircle() {
		return circle;
	}
  
    public void press(Command command) 
    { 
        command.execute(); 
        
        doL.add(command);
        circle = command.getCircle();
        
    } 
    
    public void undo() 
    { 
    	if(doL.size() <= 1) {
    		System.out.println("Cannot Undo. No previous command.");
    	}
    	else {
    		System.out.println("aschi...!");
    		undoL.add(doL.get(doL.size() - 1));
    		doL.remove(doL.size() - 1);
        	
    		doL.get(doL.size() - 1).execute(); 
    		circle = doL.get(doL.size() - 1).getCircle();
    	}
    } 
    
    public void redo() 
    { 
    	if(undoL.size() >= 1) {
    		doL.add(undoL.get(undoL.size() - 1));
    		undoL.remove(undoL.size() - 1);
	    	
	    	doL.get(doL.size() - 1).execute();
	    	circle = doL.get(doL.size() - 1).getCircle();
    	}
    	else {
    		System.out.println("Cannot Redo. No previous Undo command.");
    	}
    }
}
