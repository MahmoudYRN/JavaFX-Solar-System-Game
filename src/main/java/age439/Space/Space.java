package age439.Space;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Space extends Application{

	Model model;
	View view;
	Controller controller;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		Pane root = new Pane();
		Scene scene = new Scene(root,800,500);
		//set root and title	
		primaryStage.setTitle("Solar System");
		primaryStage.setScene(scene);
		primaryStage.setResizable(false);
		primaryStage.show();
		//canvas and graphic context	
		Canvas canvas = new Canvas(800,500);
		GraphicsContext gc = canvas.getGraphicsContext2D();
		//MVC pattern
		model = new Model(gc);
		view = new View(root,canvas,model);
		controller = new Controller(scene, model);
		
	}

}
