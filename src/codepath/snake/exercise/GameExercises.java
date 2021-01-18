package codepath.snake.exercise;

import java.awt.Color;
import java.awt.Graphics;
import codepath.snake.scaffold.*;

@SuppressWarnings("serial")
public class GameExercises extends FirstGamePanel {
	
	int snakeWidth = 12;
	Color green = Color.GREEN;
	Color red = Color.RED;
	Color blue = Color.BLUE;
	Color pink = Color.PINK;
	int[] xSnakePos = {215, 240, 265, 290, 315, 340, 365, 390};
	int[] ySnakePos = {350};
	
	// Rendering the game
	// This method is called once a second to redraw the canvas,
	// so you can do things like draw the snake or the apple on screen.
	public void redrawCanvas(Graphics canvas) {
		drawSnake(canvas);
		drawApple(canvas);
	}
	
	public void drawSnake(Graphics canvas) {
		
		for (int i = 0; i < xSnakePos.length; i++) {
			int rand = (int) (Math.random()*4);
			switch(rand) {
				case 0: canvas.setColor(red);
				break;
				case 1: canvas.setColor(blue);
				break;
				case 2: canvas.setColor(pink);
				break;
				case 3: canvas.setColor(green);
				break;
				default: canvas.setColor(red);
			}
			canvas.fillRect(xSnakePos[i], ySnakePos[0], 20, snakeWidth);
		}
		
		/*
		canvas.setColor(green);
	    canvas.fillRect(xSnakePos[0], ySnakePos[0], 20, snakeWidth);
	    canvas.setColor(red);
	    canvas.fillRect(xSnakePos[1], ySnakePos[0], 20, snakeWidth);
	    canvas.setColor(pink);
	    canvas.fillRect(xSnakePos[2], ySnakePos[0], 20, snakeWidth);
	    canvas.setColor(blue);
	    canvas.fillRect(xSnakePos[3], ySnakePos[0], 20, snakeWidth);
	    */
	}
	
	public void drawApple(Graphics canvas) {
		 canvas.setColor(red);
		    canvas.fillOval(10, 100, 20, 20);
	}
	
	public void moveUp() {
		ySnakePos[0]= ySnakePos[0] - 5; 
	}
	
	// Initializing the game.
	// This method is called when the game first launches. Use this to
	// initialize variables and set starting values.
	public void onStart() {
		
	}

	// Implementing game logic. 
	// This method is called once a second, and it is a good place to
	// do things like check if the snake has collided into the wall
	// or the apple.
	public void onTimer() {
		
		moveUp();

	}

	// Handling Input
	// This method is called whenever a keyboard button is pressed
	// within your game. The keyCode represents the key the actual key pushed.
	// You can check which keyCode using 'KeyEvent' constants.
	// i.e keyCode == KeyEvent.VK_UP
	protected void onKeyPress(int keyCode) {
		
	}
}
