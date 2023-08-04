package age439.Space;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.shape.Rectangle;

public class Player{
	private static Player instance = null;
	
	double x,y;
	GraphicsContext gc;
	Image img;
	double width=50, height=50;
	Rectangle r;

	private Player(double x, double y, GraphicsContext gc) {
		//super(x, y, gc);
		super();
		this.x = x;
		this.y = y;
		this.gc = gc;
		img= new Image(this.getClass().getResource("player.gif").toExternalForm());
		r=new Rectangle(0,0,width,height);
	}
	
	public static Player getInstance(double x, double y, GraphicsContext gc) {
		if (instance == null) {
			instance = new Player(x,y,gc);
		}// only one instance of this class exists no matter how many times created
		return instance;
	}
	
//	public void move()
//	{
//		x++;
//	}
	
	public void updateRectangle()
	{
		r.setX(x);
		r.setY(y);
		r.setWidth(width);
		r.setHeight(height);
	}

	public void update()
	{
		if(img!=null) {
			gc.drawImage(img, x, y, 50, 50);
		}
		updateRectangle();
	}

	public void moveRight() {
		x=x+3;		
	}

	public void moveLeft() {
		x=x-3;		
	}
	
	public void moveUp() {
		y=y-3;		
	}
	
	public void moveDown() {
		y=y+3;		
	}
	
}
