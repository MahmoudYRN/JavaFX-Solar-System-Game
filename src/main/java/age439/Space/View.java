package age439.Space;

import javafx.animation.AnimationTimer;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;

public class View {
	
	Model model;
	Pane root;
	Canvas canvas;
	GraphicsContext gc;
	
	AnimationTimer timer = new AnimationTimer() {
		@Override
		public void handle(long arg0) {
			gc.setFill(Color.ORANGE);
			gc.fillRect(0,0,canvas.getWidth(),canvas.getHeight());
			//get all planets
			for(GameObject obj:model.list) {
				obj.update();				
				model.player.update();
			}
		}};
	
	public View(Pane root, Canvas canvas, Model model) {
		this.root = root;
		this.canvas = canvas;
		this.model = model;
		gc = canvas.getGraphicsContext2D();
		root.getChildren().add(canvas);
		//start animation timer
		timer.start();
	}

}
