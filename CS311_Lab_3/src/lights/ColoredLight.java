package lights;

import java.awt.Color;
import java.util.Random;

public class ColoredLight extends Light{
	
	/**
	 * Creates a new colored light.
	 * @param color - color of this light.
	 */
	
	Color color;
	
	public ColoredLight(Color color) {
		// TODO
		this.color = color;
	}
	
	/**
	 * Returns the color of this light.
	 * @return color of this light.
	 */
	public Color getColor() {
		// TODO
		return color;
	}
	
	/**
	 * Changes the color of this light to be c.
	 */
	public void setColor(Color c) {
		// TODO
		this.color = c;
	}
	
	/**
	 * Randomly changes this light to be on or off and its color.
	 */
	@Override
	public void randomChange() {
		// TODO. 
		// Take advantage of Light.randomChange
		//super.randomChange();
		
		//to get rainbow, pastel colors
		Random random = new Random();
		final float hue = random.nextFloat();
		final float saturation = 0.9f;//1.0 for brilliant, 0.0 for dull
		final float luminance = 1.0f; //1.0 for brighter, 0.0 for black
		color = Color.getHSBColor(hue, saturation, luminance);
		
	}
	
}