package lights;

import java.util.ArrayList;
import java.util.List;

public class RunningHolidayLights implements HolidayLights {
	
	/**
	 * Creates new running holiday lights.
	 * @param length - length of this set of lights.
	 */
	ArrayList<Light> lightList;
	int capacity;
	public RunningHolidayLights(int length) {
		// TODO
		
		lightList = new ArrayList<Light>(length);
		capacity = length;

	}
	
	public ArrayList<Light> next() {
		// TODO
		Light light = new Light(true);
		if(lightList.size() < capacity) {
			
			if(lightList.size()==0)
				lightList.add(light);
		
			else {
				lightList.get(getLength()-1).setOn(false);
				lightList.add(light);
			}
		
		}
		else {
			lightList.removeAll(lightList);
		}
	
		return lightList;
		
	}
	
	/**
	 * Returns the length of this
	 * @return length of this
	 */
	public int getLength() {
		// TODO
		return lightList.size();
	}
						
}