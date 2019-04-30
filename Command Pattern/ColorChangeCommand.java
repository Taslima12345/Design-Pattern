package command;

import java.awt.Color;
import java.awt.Graphics;
import java.util.List;
import java.util.ArrayList;

public class ColorChangeCommand extends Command {
	
	private Circle circle;
	private Graphics g;

	
	public ColorChangeCommand(Circle circle, Graphics g) {
		this.circle = circle;
		this.g = g;
	}

	public void execute() {

		circle.draw(g);
		//drawnList.add(circle.color);
		
	}
	
	public Circle getCircle() {
		return circle;
	}


}