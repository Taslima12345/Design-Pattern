package command;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class CircleCommandTest extends JPanel {
	
	private static JFrame frame;
	RemoteControl remote;

	JComboBox comboColor, comboSize, comboPos;
	int X = 300, Y = 150, size = 75;
	Color color = Color.cyan;

	
	/**
	 * Create the panel.
	 */
	public CircleCommandTest() {

		remote = new RemoteControl();
		
		setBackground(new Color(255, 255, 255));
		setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 0, 0));
		panel.setBounds(0, 400, 720, 180);
		add(panel);
		panel.setLayout(null);
		
		JButton btnDraw = new JButton("Draw");
		btnDraw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				Circle circle = new Circle(X, Y, size, color);
				Command command = new ColorChangeCommand(circle, getGraphics());
				remote.press(command);
			}
		});
		btnDraw.setBounds(5, 20, 80, 25);
		panel.add(btnDraw);
		
		JButton btnUndo = new JButton("Undo");
		btnUndo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eu) {

				remote.undo();
			}
		});
		btnUndo.setBounds(100, 20, 80, 25);
		panel.add(btnUndo);
		
		JButton btnRedo = new JButton("Redo");
		btnRedo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent er) {

				remote.redo();
			}
		});
		btnRedo.setBounds(195, 20, 80, 25);
		panel.add(btnRedo);
		
		
		JButton btnL = new JButton("Large");
		btnL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent el) {

				changeSize(10);
			}
		});
		btnL.setBounds(300, 20, 80, 25);
		panel.add(btnL);
		
		JButton btnS = new JButton("Small");
		btnS.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent es) {

				changeSize(-10);
			}
		});
		btnS.setBounds(300, 45, 80, 25);
		panel.add(btnS);
		
		JButton btnLeft = new JButton("Left");
		btnLeft.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ell) {

				changePos(-10, 0);
			}
		});
		btnLeft.setBounds(420, 20, 80, 25);
		panel.add(btnLeft);
		
		JButton btnRt = new JButton("Right");
		btnRt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent err) {

				changePos(10, 0);
			}
		});
		btnRt.setBounds(420, 45, 80, 25);
		panel.add(btnRt);
		
		JButton btnUp = new JButton("Up");
		btnUp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent euu) {

				changePos(0, -10);
			}
		});
		btnUp.setBounds(420, 70, 80, 25);
		panel.add(btnUp);
		
		JButton btnD = new JButton("Down");
		btnD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent edd) {

				changePos(0, 10);
			}
		});
		btnD.setBounds(420, 95, 80, 25);
		panel.add(btnD);
		
		JButton btncy = new JButton("Cyan");
		btncy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ec) {

				//remote.redo();
				//System.out.println("ekhane");
				changeColor(Color.cyan);
			}
		});
		btncy.setBounds(550, 20, 80, 25);
		panel.add(btncy);
		
		JButton btnB = new JButton("Blue");
		btnB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent eb) {

				changeColor(Color.blue);
			}
		});
		btnB.setBounds(550, 45, 80, 25);
		panel.add(btnB);
		
		JButton btnrd = new JButton("Red");
		btnrd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent erd) {

				changeColor(Color.red);
			}
		});
		btnrd.setBounds(550, 70, 80, 25);
		panel.add(btnrd);
		

	}
	
	public static void main(String[] args) {
	    JFrame.setDefaultLookAndFeelDecorated(true);
	    frame = new JFrame("My COMMAND Panel");
	    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    frame.setBackground(Color.white);
	    frame.setSize(720, 580);
	 
	    CircleCommandTest panel = new CircleCommandTest();
	 
	    frame.getContentPane().add(panel);
	 
	    frame.setVisible(true);
	  }

	
	public void changeColor(Color col) {
		System.out.println("Color Changed.");
		Command command; 
		Circle circle;
		//color = remote.getCircle().color;
		color = col;
		X = remote.getCircle().x;
		Y = remote.getCircle().y;
		size = remote.getCircle().radius;
		circle = new Circle(X, Y, size, color);
		command = new ColorChangeCommand(circle, getGraphics());
		this.remote.press(command);
	}
	
	
	public void changePos(int dx, int dy) {
		System.out.println("Position Changed.");
		Command command; 
		Circle circle;
		X = remote.getCircle().x;
		Y = remote.getCircle().y;
		X += dx;
		Y += dy;
		color = remote.getCircle().color;
		size = remote.getCircle().radius;
		circle = new Circle(X, Y, size, color);
		command = new SizeChangeCommand(circle, getGraphics());	
		this.remote.press(command);
	}
	
	public void changeSize(int ds){
		System.out.println("Size Changed.");
		Command command; 
		Circle circle;
		size = remote.getCircle().radius;
		size += ds;
		
		X = remote.getCircle().x;
		Y = remote.getCircle().y;
		color = remote.getCircle().color;
		circle = new Circle(X, Y, size, color);
		command = new SizeChangeCommand(circle, getGraphics());
		this.remote.press(command);
	}
	
}
