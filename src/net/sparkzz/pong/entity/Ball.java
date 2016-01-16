package net.sparkzz.pong.entity;

/**
 * Created by Brendon Butler on 1/16/2016.
 */
public class Ball {

	private int speedX, speedY, xPos, yPos;

	private boolean hitWall() {
		return yPos < 0 || yPos > 360 - 30 / 2;
	}

	public Ball() {
		setPosition(240, 180);
	}

	public int getX() {
		return xPos;
	}

	public int getY() {
		return yPos;
	}

	public int[] getPosition() {
		return new int[] {xPos, yPos};
	}

	public int[] getVelocity() {
		return new int[] {speedX, speedY};
	}

	public void move() {
		setPosition(xPos + speedX, yPos + speedY);
	}

	public void setPosition(int x, int y) {
		xPos = x;
		yPos = y;

		// TODO: test for collisions, implement mathematical bounce-back
	}

	public void setVelocity(int speedX, int speedY) {
		this.speedX = speedX;
		this.speedY = speedY;
	}
}