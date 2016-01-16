package net.sparkzz.pong.entity;

/**
 * Created by Brendon Butler on 1/16/2016.
 */
public class Paddle {

	private final int XPOS;
	private int yPos = 180;

	public Paddle(int X) {
		XPOS = X;
	}

	public int getPosition() {
		return yPos;
	}

	public void setPosition(int position) {
		if (!(position > 280) && !(position < 0))
			yPos = position;
	}
}