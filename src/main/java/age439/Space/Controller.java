package age439.Space;

import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class Controller {

	Model model;
	
	EventHandler<KeyEvent> keyHandler = new EventHandler<KeyEvent> () {
		@Override
		public void handle(KeyEvent keyEvent) {
			//player controls
			if(keyEvent.getCode() == KeyCode.D) {
				model.player.moveRight();
			}
			if(keyEvent.getCode() == KeyCode.A) {
				model.player.moveLeft();
			}
			if(keyEvent.getCode() == KeyCode.W) {
				model.player.moveUp();
			}
			if(keyEvent.getCode() == KeyCode.S) {
				model.player.moveDown();
			}
			//collision detection
			for(GameObject obj:model.list) {
				obj.update();				
				if(model.player.r.intersects(obj.r.getX(),obj.r.getY(),obj.r.getWidth(),obj.r.getHeight()))
				{
					//System.out.print("hit"+obj.getPlanetName()+"\n");	
					obj.playPlanet();					
				}
				else {
					obj.stopPlanet();
				//	System.out.print("bye\n");	
				}
				model.player.update();
			}
		} };
	
	public Controller(Scene scene, Model model) {
		this.model = model;
		scene.setOnKeyPressed(keyHandler);
		//enable player controller
	}

}
