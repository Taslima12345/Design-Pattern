package command;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

public class PositionChangeCommand extends Command {
	
	private Circle circle;
	private Graphics g;

	
	public PositionChangeCommand(Circle circle, Graphics g) {
		this.circle = circle;
		this.g = g;
	}

	public void execute() {

		circle.draw(g);
	
	}
	
	public Circle getCircle() {
		return circle;
	}
	
}
