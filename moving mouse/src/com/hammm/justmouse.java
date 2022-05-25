package com.hammm;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.Random;

public class justMouse {

	public static void main(String[] args) throws AWTException, InterruptedException {
		Robot robot = new Robot();
		Random random = new Random();
		
		while(true) {
			int x = random.nextInt()%1280;
			int y = random.nextInt()%960;
			robot.mouseMove(x, y);
			robot.mousePress(InputEvent.BUTTON3_MASK);
			robot.mouseRelease(InputEvent.BUTTON3_MASK);
			
			Thread.sleep(1000*60*10);
			System.out.println("start");
		}
	}

}
