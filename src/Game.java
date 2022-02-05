
import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Game extends JPanel implements Runnable, KeyListener {
    
    private static JFrame myFrame; // Frame of the game when opened
    private Thread thread;
    
    
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
        //Notify
        super.addNotify();
        if(thread == null)
        	thread = new Thread(this);
        	thread.start();
        
	}



	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true) {
			jkjdkfndslfknsdlfksn
		}
			
		
	}
	
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}



	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}