package age439.Space;

import java.util.ArrayList;

import javafx.scene.canvas.GraphicsContext;

public class Model {

	ArrayList<GameObject> list = new ArrayList<GameObject>();
	SolarSystem solarSystem;
	Player player;
	
	public Model(GraphicsContext gc) {
		//create new player and planets
		player = Player.getInstance(500, 350, gc);
		solarSystem = new SolarSystem(gc);
		list.add(solarSystem.createProduct("mercury", 350, 50));
		list.add(solarSystem.createProduct("venus", 150, 100));
		list.add(solarSystem.createProduct("earth", 250, 150));
		list.add(solarSystem.createProduct("mars", 350, 200));
		list.add(solarSystem.createProduct("jupiter", 100, 250));
		list.add(solarSystem.createProduct("saturn", 250, 250));
		list.add(solarSystem.createProduct("uranus", 350, 350));
		list.add(solarSystem.createProduct("neptune", 500, 150));
		//store all planets in a list
	}
}
