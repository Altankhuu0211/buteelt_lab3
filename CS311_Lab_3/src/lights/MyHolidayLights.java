package lights;

import java.util.ArrayList;

public class MyHolidayLights {

	ArrayList<ColoredLight> lightList;
	int capacity;
	int count=0;
	boolean back = false;
	
	public MyHolidayLights(int length) {
		// TODO
		
		lightList = new ArrayList<ColoredLight>(length);
		capacity = length;
		ColoredLight light = new ColoredLight(null);
		light.setOn(false);
		
		for(int i=0; i<capacity; i++) {
			lightList.add(light);
		}
		
	}
	
	public ArrayList<ColoredLight> next() {
		// TODO
		
		ColoredLight light = new ColoredLight(null);
		
		light.setOn(true);
		light.randomChange();
		
		
			lightList.remove(count);
			lightList.add(count, light);
			lightList.remove(capacity-1-count);
			lightList.add(capacity-1-count, light);	
		
		
		/*if(count!=0) {
			lightList.get(count-1).setOn(false);
			lightList.get(capacity-1-count-1).setOn(false);
		}*/
		
		if(count==capacity/2) {	
			count=0;
		}
		else
			count++;
			
		
		return lightList;
		
	}
	
	
	public int getLength() {
		// TODO
		return lightList.size();
	}
}
