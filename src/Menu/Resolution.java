package Menu;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;

public class Resolution extends GameState {

	private GameStateManager gsm;
	private int currentChoice = 0;
	private String[] options = { "300 x 240", "800 x 600", "1600 x 1440", "1920 x 1080","Back" };
	private Color titleColor;
	private Font titleFont;
	private Font font;
	private boolean isChanged;

	public Resolution(GameStateManager gsm) {
		isChanged = false;
		this.gsm = gsm;
		try {
			titleColor = new Color(128, 0, 0);
			titleFont = new Font("Century Gothic", Font.PLAIN, 28);
			font = new Font("Aerial", Font.PLAIN, 12);
		} catch (Exception e) {
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
		// background
		g.setColor(Color.YELLOW.darker());
		g.fillRect(0, 0, gsm.getWidth(), gsm.getHeight());
		// title
		g.setColor(titleColor);
		g.setFont(titleFont);
		int length = (int) g.getFontMetrics().getStringBounds("Resolution", g).getWidth();
		g.drawString("Resolution", gsm.getWidth() / 2 - length / 2, gsm.getHeight() / 4);
		// menu options
		g.setFont(font);
		for (int i = 0; i < options.length; i++) {
			if (i == currentChoice) {
				g.setColor(Color.BLACK);
			} else {
				g.setColor(Color.RED);
			}
			length = (int) g.getFontMetrics().getStringBounds(options[i], g).getWidth();
			int length2 = (int) g.getFontMetrics().getStringBounds(options[i], g).getHeight();
			g.drawString(options[i], gsm.getWidth() / 2 - length / 2,
					gsm.getHeight() / 2 + (int) (1.3 * i * (length2)));
		}

	}

	public void select() {
		if (currentChoice == 0) {

		} else if (currentChoice == 1) {
		} else if (currentChoice == 2) {
		} else if (currentChoice == 3) {
		} else if (currentChoice == 4) {
			gsm.setState(0);
		}
	}

	public boolean Changed() {
		return isChanged;
	}

	@Override
	public void keyPressed(int k) {
		// TODO Auto-generated method stub
		if (k == KeyEvent.VK_ENTER) {
			select();
		}
		if (k == KeyEvent.VK_UP) {
			currentChoice--;
			if (currentChoice == -1)
				currentChoice = options.length - 1;
		}
		if (k == KeyEvent.VK_DOWN) {
			currentChoice++;
			if (currentChoice == options.length)
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
