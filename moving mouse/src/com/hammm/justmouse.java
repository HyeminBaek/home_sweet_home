package justMouse;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.util.ArrayList;
import java.util.Random;

public class justMouse {

	public static void main(String[] args) throws AWTException, InterruptedException {
		Robot robot = new Robot();
		Random random = new Random();
		
		System.out.println("start");
		while(true) {
			//마우스 랜덤 이동
			int x = random.nextInt()%1280;
			int y = random.nextInt()%960;
			robot.mouseMove(x, y);
			
			//마우스 좌 클릭
			robot.mousePress(InputEvent.BUTTON1_MASK);
			Thread.sleep(1000);
			robot.mouseRelease(InputEvent.BUTTON1_MASK);
			
			//키보드 입력
			ArrayList<Character> keyInput = new ArrayList<Character>();
			keyInput.add('h'); keyInput.add('i');
			
			for(int i=0;i<keyInput.size();i++)
				robot.keyPress(keyInput.get(i));
			
			//마우스 우 클릭
			robot.mousePress(InputEvent.BUTTON3_MASK);
			Thread.sleep(1000);
			robot.mouseRelease(InputEvent.BUTTON3_MASK);
			
			//마우스 랜덤 이동
			x = random.nextInt()%1280;
			y = random.nextInt()%960;
			robot.mouseMove(x, y);
			
			Thread.sleep(1000*60*10);
			System.out.println("move");
		}
	}

}
