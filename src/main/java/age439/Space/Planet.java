package age439.Space;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;

public class Planet extends GameObject{

	public Planet(double x, double y, GraphicsContext gc, String newPlanet) {
		super(x,y,gc);
		planet = newPlanet;
		img = new Image(getClass().getResourceAsStream(newPlanet+".png"));
		//planet = "Earth";
		setAudio(getClass().getResource(newPlanet+".mp3").toString());
		update();
	}
		
}
