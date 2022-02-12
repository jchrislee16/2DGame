package Menu;


import java.awt.Graphics2D;
import java.util.ArrayList;

public class GameStateManager {
	
	
	private ArrayList<GameState> gamestates;
	private int currentstate;
	
	// MENUSTATE = 0;
	// RESOLUTION = 1;
	// CONTROL = 2;
	
	private static int width;
	private static int height;
	
	public GameStateManager()
	{
		width = 800;
		height = 600;
		gamestates = new ArrayList<GameState>();
		currentstate = 0;
		gamestates.add(new MenuState(this));
		gamestates.add(new Resolution(this));
		gamestates.add(new Control(this));
		
	}
	
	
	public void setState(int state)
	{
		currentstate = state;
		gamestates.get(currentstate).init();
		
	}
	
	
	public int getWidth()
	{
		return width;
	}
	
	public int getHeight()
	{
		return height;
	}
	
	public void setWidth(int i)
	{
		width = i;
	}
	
	public void setHeight(int i)
	{
		height = i;
	}
	
	
	
	public void update() 
	{
		gamestates.get(currentstate).update();
	}
	
	public void draw(Graphics2D g)
	{
		gamestates.get(currentstate).draw(g);
	}
	
	public void keyPressed(int k) {
		gamestates.get(currentstate).keyPressed(k);
	}
	public void keyReleased(int k) {
		gamestates.get(currentstate).keyReleased(k);
	}
	
	
	
	
	

}
