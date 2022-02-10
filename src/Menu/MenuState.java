package Menu;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

public class MenuState extends GameState{
	
	private int currentChoice = 0;
	private String [] options = 
	{
		"Start",
		"Resolution",
		"Control",
		"Exit"
	};
	private Color titleColor;
	private Font titleFont;
	private Font font;
	
	
	
	public MenuState(GameStateManager gsm)
	{
		try {
		titleColor = new Color(128,0,0);
		titleFont = new Font("Century Gothic", Font.PLAIN, 28);
		font = new Font("Aerial", Font.PLAIN,12);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void init() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void draw(Graphics2D g) {
		g.setColor(titleColor);
		g.setFont(titleFont);
		g.drawString("2DGame", /*gsm.getWidth()*/800 /2, /*gsm.getHeight()*/600/4);
		g.setFont(font);
		for(int i = 0; i < options.length; i++)
		{
			if(i == currentChoice)
			{
				g.setColor(Color.BLACK);
			}
			else
			{
				g.setColor(Color.RED);
			}
			g.drawString(options[i],(int)(/*gsm.getWidth()*/800 /1.5), (int)((i+/*gsm.getHeight()*/600)/4));
		}
		
		
		
		
	}

	
	public void select()
	{
		if(currentChoice == 0){
			
		}
		else if (currentChoice == 1)
		{
			
		}
		else if (currentChoice == 2)
		{
			System.exit(0);
		}
	}
	
	
	@Override
	public void keyPressed(int k) {
		// TODO Auto-generated method stub
		if( k == KeyEvent.VK_ENTER) {
			select();
		}
		if( k == KeyEvent.VK_UP) {
			currentChoice --;
			if(currentChoice == -1)
				currentChoice = options.length - 1;
		}
		if( k == KeyEvent.VK_DOWN) {
			currentChoice ++;
			if(currentChoice == options.length)
				currentChoice = 0;
		}
		
	}

	@Override
	public void keyReleased(int k) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(int k) {
		// TODO Auto-generated method stub
		
	}

}
