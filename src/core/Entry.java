package core;

import core.input.KeyInput;
import core.input.MouseInput;
import core.input.MouseMotionInput;
import core.renderer.Renderer;
import core.updater.Updater;
import game.GameEntry;

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
		
		//NOTE::first instance of the game
		new GameEntry();
		
		Fps.calcBeginTime();
		while(runGame) {
			Updater.update();
			renderer.repaint();
			Fps.calcDeltaTime();
		}
	}
}
