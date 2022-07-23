
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;

import javax.swing.JFrame;
import javax.swing.JPanel;

import Menu.GameStateManager;

public class Game extends JPanel implements Runnable, KeyListener {
    
    private static JFrame myFrame; // Frame of the game when opened
    private Thread thread;
    private GameStateManager gsm;
    
    
    private Graphics2D g;
    private BufferedImage image;
    private boolean running;
    
    
    
    
    
    
	public static void main(String[] arge)
	{
		myFrame = new JFrame("Shooting Game");

		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		myFrame.setContentPane(new Game());
		myFrame.setVisible(true);
        myFrame.setResizable(true);
		myFrame.pack();
	}
	
	
	
	public Game()
	{
		super();
		setPreferredSize(new Dimension(800, 600));
        setFocusable(true);
        requestFocus();
        this.myFrame.pack();
        
        
	}

	
	public void addNotify()
	{
		//Notify
        super.addNotify();
        if(thread == null)
        	thread = new Thread(this);
        	thread.start();
        	addKeyListener(this);
	}
	
	


	@Override
	public void run() {
		
		init();
		
		
		// TODO Auto-generated method stub
		while(running) {
			update();
			draw();
			drawToScreen();
		}
			
		
	}
	
	
	public void init() {
		gsm = new GameStateManager();
		image = new BufferedImage(800,600,BufferedImage.TYPE_INT_RGB);
		g = (Graphics2D) image.getGraphics();
		running = true;
		
	}
	
	
	public void update()
	{
		gsm.update();
	}
	
	public void draw()
	{
		gsm.draw(g);
	}
	
	
	public void drawToScreen()
	{
		Graphics g2 = getGraphics();
		g2.drawImage(image,0,0,null);
		g2.dispose();
	}
	
	
	
	
	
	
	@Override
	public void keyTyped(KeyEvent k) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void keyPressed(KeyEvent k) {
		// TODO Auto-generated method stub
		gsm.keyPressed(k.getKeyCode());
		
	}



	@Override
	public void keyReleased(KeyEvent k) {
		// TODO Auto-generated method stub
		gsm.keyReleased(k.getKeyCode());
		
	}
	
}