package core.updater;

import java.util.ArrayList;


public class Updater{
	private static ArrayList<Updateable> updateableObject = new ArrayList<Updateable>();
	private static ArrayList<Updateable> newUpdateableObject = new ArrayList<Updateable>();
	private static ArrayList<Updateable> oldUpdateableObject = new ArrayList<Updateable>();

	static public void update(){
		for(Updateable object: updateableObject) {
			object.update();
		}
		for(Updateable object: oldUpdateableObject)
			oldUpdateableObject.remove(object);
		
		updateableObject.addAll(newUpdateableObject);
		newUpdateableObject.clear();
		oldUpdateableObject.clear();
	}
	
	public static void addObject(Updateable object) {
		newUpdateableObject.add(object);
	}
	
	public static void removeObject(Updateable object) {
		oldUpdateableObject.add(object);
	}
}
