package flyweight;

import java.awt.*;
public class Rectangle {
   private Color color = Color.black;
   
   
   public Rectangle(Color color) {
	   
	   this.color = color;
	   
   }
   
   public void draw() {
	     System.out.println("Rectangle drawn");
   }
   
   
}
