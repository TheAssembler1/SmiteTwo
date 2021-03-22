package core;

import java.awt.event.MouseEvent;

import core.input.KeyInput;
import core.input.MouseInput;
import core.input.MouseMotionInput;
import core.renderer.Renderer;
import core.updater.Updater;
import widgets.Button;

public class Entry {
	public static void main(String[] args) {
		Window window = new Window("LilSwingEngine", 500, 500);
		Renderer renderer = new Renderer();
		
		window.add(renderer);
		window.packWindow();
		renderer.addKeyListener(new KeyInput());
		renderer.addMouseListener(new MouseInput());
		renderer.addMouseMotionListener(new MouseMotionInput());
		
		boolean runGame = true;
		
		window.setVisible(true);
		
		Button testButton = new Button(100, 100, 100, 100, 100);
		
		Fps.calcBeginTime();
		while(runGame) {
			if(testButton.isClicked(MouseEvent.BUTTON1))
				System.out.println("CLICKED");
			
			Updater.update();
			renderer.repaint();
			Fps.calcDeltaTime();
		}
	}
}
