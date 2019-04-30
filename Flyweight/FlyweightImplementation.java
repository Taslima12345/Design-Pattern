package flyweight;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;

import java.awt.event.ActionListener;
import java.util.Random;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;


import java.awt.FlowLayout;

public class FlyweightImplementation {

	
	
	public static void main(String[] args) {
		
		Color[] shapeColor = { Color.orange, Color.red, Color.yellow,
				Color.blue, Color.pink, Color.cyan, Color.green, 
				Color.magenta, Color.black, Color.gray };
		
		long startTime = System.currentTimeMillis();
		for(int i = 0; i < 100000; i++) {
			Random randomGenerator = new Random();						
			int randInt = randomGenerator.nextInt(5);
		
			Rectangle rect = RectangleFactory.getRect(shapeColor[randInt]);
            rect.draw();
          
		}
		 long finishTime = System.currentTimeMillis();
			System.out.println("It took " + (finishTime - startTime) + " miliseconds to draw 1,00,000 shapes "
					+ "using FLYWEIGHT pattern");
	  }
}
