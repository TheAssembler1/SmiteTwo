package core;

import javax.swing.JFrame;

public class Window extends JFrame{
	private static double winWidth = 100;
	private static double winHeight = 100;
	private static String winName = "LilSwingEngine";
	
	public Window() {
		setWindowAttributes();
	}
	
	public Window(String winName, double winWidth, double winHeight) {
		super(winName);
		
		Window.winWidth = winWidth;
		Window.winHeight = winHeight;
		
		setWindowAttributes();
	}
	
	public void setWindowAttributes() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void packWindow() {
		pack();
		setResizable(false);
		setLocationRelativeTo(null);
	}
	
	public static double getWinWidth() {
		return winWidth;
	}
	
	public static double getWinHeight() {
		return winHeight;
	}
	
	public static String getWinName() {
		return winName;
		
	}
}