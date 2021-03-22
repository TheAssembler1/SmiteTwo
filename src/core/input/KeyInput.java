package core.input;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyInput implements KeyListener{
	public static KeyEvent[] keys = new KeyEvent[KeyEvent.KEY_LAST];

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void keyPressed(KeyEvent e) {
		keys[e.getKeyCode()] = e;
	}

	@Override
	public void keyReleased(KeyEvent e) {
		keys[e.getKeyCode()] = e;
	}
}
