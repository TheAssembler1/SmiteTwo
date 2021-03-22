package core.input;

import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MouseMotionInput implements MouseMotionListener{
	public static Point mouseLocation = new Point(0, 0);
	
	@Override
	public void mouseDragged(MouseEvent e) {
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		mouseLocation = e.getPoint();
	}

}
