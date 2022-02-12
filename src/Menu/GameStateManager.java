package Menu;


import java.awt.Graphics2D;
import java.util.ArrayList;

public class GameStateManager {
	
	
	private ArrayList<GameState> gamestates;
	private int currentstate;
	
	public static final int MENUSTATE = 0;
	public static final int RESOLUTION = 1;
	public static final int CONTROL = 2;
	
	public GameStateManager()
	{
		gamestates = new ArrayList<GameState>();
		currentstate = 0;
		gamestates.add(new MenuState(this));
		
	}
	
	
	public void setState(int state)
	{
		currentstate = state;
		gamestates.get(currentstate).init();
		
	}
	
	
	public int getWidth()
	{
		return 800;
	}
	
	public int getHeight()
	{
		return 600;
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
