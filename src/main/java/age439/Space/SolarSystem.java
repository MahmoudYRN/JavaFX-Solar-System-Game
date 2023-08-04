package age439.Space;

import javafx.scene.canvas.GraphicsContext;

public class SolarSystem implements SolarSystemInterFace{
	GraphicsContext gc;
	
	@Override
	public GameObject createProduct(String discrim, double x, double y) {
		if(discrim.equals("mars"))
			return new Planet(x,y,gc,"mars");
		else if(discrim.equals("earth"))
			return new Planet(x,y,gc,"earth");
		else if(discrim.equals("mercury"))
			return new Planet(x,y,gc,"mercury");
		else if(discrim.equals("venus"))
			return new Planet(x,y,gc,"venus");
		else if(discrim.equals("jupiter"))
			return new Planet(x,y,gc,"jupiter");
		else if(discrim.equals("saturn"))
			return new Planet(x,y,gc,"saturn");
		else if(discrim.equals("uranus"))
			return new Planet(x,y,gc,"uranus");
		else if(discrim.equals("neptune"))
			return new Planet(x,y,gc,"neptune");
		//etc create planets
		return null;
	}
	
	public SolarSystem(GraphicsContext gc) {
		super();
		this.gc = gc;
	}

}
