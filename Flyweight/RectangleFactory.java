package flyweight;

import java.util.HashMap;
import java.awt.Color;

public class RectangleFactory {

	private static int c =0;
	private static final HashMap <Color, Rectangle> rectsByColor = new HashMap <Color, Rectangle> ();
	   
	public static Rectangle getRect(Color color) {
		Rectangle rect = (Rectangle) rectsByColor.get(color);
					
		if(rect == null) {
			rect = new Rectangle(color);				
			rectsByColor.put(color, rect);
			
			
	         
		}
		
		return rect;
	}
}

