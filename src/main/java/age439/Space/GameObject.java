package age439.Space;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.shape.Rectangle;

public class GameObject {
	protected Image img;
	protected double x, y;
	protected GraphicsContext gc;
	double width=50, height=50;
	Rectangle r;
	String planet;
	Media media;
	MediaPlayer mediaPlayer;
	
	public GameObject(double x, double y,GraphicsContext gc)
	{
		this.gc=gc;
		this.x=x;
		this.y=y;
		r=new Rectangle(0,0,width,height);
	}
	
	
	public void update()
	{
		r.setX(x);
		r.setY(y);
		r.setWidth(width);
		r.setHeight(height);
		
		if(img!=null)
			gc.drawImage(img, x, y, 100, 100);
				
	}
	
	public String getPlanetName() {
		return planet;
	}

	public void setAudio(String Audio) {
		try {
			media = new Media(Audio);
			mediaPlayer = new MediaPlayer(media);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
	}
	
	public void playPlanet() {
		if(mediaPlayer != null) {
			mediaPlayer.play();	
		}
	}
	
	public void stopPlanet() {
		if(mediaPlayer != null) {
			mediaPlayer.stop();	
		}
		//System.out.println(mediaPlayer.getStatus());
	}
}
