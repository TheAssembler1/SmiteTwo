package widgets;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;

import core.input.MouseInput;
import core.input.MouseMotionInput;
import core.renderer.Renderable;
import core.renderer.Renderer;
import core.updater.Updateable;
import core.updater.Updater;

public class Button implements Renderable{
	private int layer;
	private int x;
	private int y;
	private int width;
	private int height;
	
	public Button(int layer, int x, int y, int width, int height) {
		this.layer = layer;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		
		Renderer.addObject(this);
	}

	@Override
	public void draw(Graphics2D g) {
		// TODO Auto-generated method stub
		g.setColor(Color.BLACK);
		g.drawRect(x, y, width, height);
	}

	@Override
	public int getLayer() {
		return layer;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	public boolean isClicked(int mouseButton) {
		/*
		if(MouseInput.mouseButtons[mouseButton] != null)
			if(mouseColliding() && MouseInput.mouseButtons[MouseEvent.BUTTON1].getID() == MouseEvent.MOUSE_CLICKED)
				return true;
			else 
				return false;
		else
			return false;*/
		return false;
	}
	
	public boolean mouseColliding() {
		if(MouseMotionInput.mouseLocation.x < x + width && MouseMotionInput.mouseLocation.x > x)
			if(MouseMotionInput.mouseLocation.y < y + height && MouseMotionInput.mouseLocation.y > y)
				return true;
			else
				return false;
		else
			return false;
	}
}
