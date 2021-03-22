package core.input;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseInput implements MouseListener{
	
	public static MouseEvent[] mouseButtons = new MouseEvent[MouseEvent.MOUSE_LAST];
	
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println(e.getID());
		mouseButtons[e.getButton()] = e;
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		mouseButtons[e.getButton()] = e;
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
