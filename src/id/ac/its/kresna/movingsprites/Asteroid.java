package id.ac.its.kresna.movingsprites;

public class Asteroid extends Sprite {

	private final int AsteroidX = 400;
    
	public Asteroid(int x, int y) {
		super(x, y);
		
		initAsteroid();
	}

	public void initAsteroid() {
		
		loadImage("src/resources/asteroid.png");
        getImageDimensions();
	}
	
	public void move() {
        
		if (x < 0) {
            x = AsteroidX;
        }

        x -= 1;
    }
}
