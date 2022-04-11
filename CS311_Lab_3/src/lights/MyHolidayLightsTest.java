package lights;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class MyHolidayLightsTest {
	
	@Test public void makeOffLight() {
		Light light = new Light();
		
		Assert.assertFalse(light.isOn());
	}
	
	@Test public void makeOnLight() {
		Light light = new Light(true);
		
		Assert.assertTrue(light.isOn());
	}

	@Test public void turnOnLight() {
		Light light = new Light();
		light.setOn(true);
		
		Assert.assertTrue(light.isOn());
	}
	
	@Test public void turnOffLight() {
		Light light = new Light(true);
		light.setOn(false);
		
		Assert.assertFalse(light.isOn());
	}
	
	@Test public void turnOnOnlyOneLight() {
		Light firstLight = new Light();
		Light secondLight = new Light();
		
		firstLight.setOn(true);
		
		Assert.assertTrue(firstLight.isOn());
		Assert.assertFalse(secondLight.isOn());
	}
	
	@Test public void testRandomChange() {
		Light light = new Light(false);
		// Call randomChange up to 100 times.
		// Probabilistically, should turn on at some point.
		boolean lightChanged = false;
		for (int i = 0; i < 100; i++) {
			light.randomChange();
			if (light.isOn()) {
				lightChanged = true;
				break;
			}
		}
		Assert.assertTrue(lightChanged);
		
		// Make sure it can change the other way
		light = new Light(true);
		// Call randomChange up to 100 times.
		// Probabilistically, should turn on at some point.
		lightChanged = false;
		for (int i = 0; i < 100; i++) {
			light.randomChange();
			if (!light.isOn()) {
				lightChanged = true;
				break;
			}
		}
		Assert.assertTrue(lightChanged);
	}
	
	@Test public void testNext() {
		MyHolidayLights hl = new MyHolidayLights(5);
		ArrayList<ColoredLight> al = new ArrayList<ColoredLight>(5);
		ColoredLight cl = new ColoredLight(null);
		cl.setOn(false);
		for(int i=0; i<5; i++) {
			al.add(cl);
		}
		al.get(0).setOn(true);
		al.get(4).setOn(true);
		
		//lightList asaalttai, untraalttai gerliin daraallaar adilhan bgaa esehiig testleh
			Assert.assertEquals(al.get(0).isOn(), hl.next().get(0).isOn()); 
			Assert.assertEquals(al.get(1).isOn(), hl.next().get(1).isOn()); 
			Assert.assertEquals(al.get(2).isOn(), hl.next().get(2).isOn()); 
			Assert.assertEquals(al.get(3).isOn(), hl.next().get(3).isOn()); 
			Assert.assertEquals(al.get(4).isOn(), hl.next().get(4).isOn()); 
			
	}
}
