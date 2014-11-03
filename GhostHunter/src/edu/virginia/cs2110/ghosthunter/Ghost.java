package edu.virginia.cs2110.ghosthunter;

import android.graphics.Color;

public class Ghost {

	int posX;
	int posY;
	Color color;
	int health;
	
	public Ghost(Color c, int x, int y) {
		this.color = c;
		this.posX = x;
		this.posY = y;
	}
	
	private void patrol() {
		// Movement pattern. Change posX and posY.
	}
	
	private void attack(int playerX, int playerY) {
		// Attack the player.
	}
	
	private void die() {
		// Disable the ghost. Possibly drop loot at its location.
	}
	
	

}
