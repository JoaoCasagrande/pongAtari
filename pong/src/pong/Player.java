package pong;

import java.awt.Color;
import java.awt.Graphics;

public class Player {

	public boolean right, left;
	public int x, y;
	public int height, widht;
	
	public Player(int x, int y) {
		this.x = x;
		this.y = y;
		this.widht = 40;
		this.height = 5;
		
	}
	
	public void tick() {
		if (right) {
			x+=1;
		}
		else if(left) {
			x-=1;
		}
		
		if(x + widht > Game.WIDHT) {
			x = Game.WIDHT - widht;
		}
		else if(x < 0) {
			x = 0;
		}
		
	}
	
	public void render(Graphics g) {
		g.setColor(Color.blue);
		g.fillRect(x, y, widht, height);
		
	}
	
}
