package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class MouseAndKeyboardActionTest {
	public static void main(String[] args) throws AWTException, InterruptedException {
		
		Robot robo=new Robot();
		Thread.sleep(3000);
		robo.mouseMove(200, 500);
		
		//To Click the mouse
		robo.mousePress(InputEvent.BUTTON1_DOWN_MASK);
		Thread.sleep(3000);
		robo.mouseRelease(InputEvent.BUTTON1_DOWN_MASK);
	}
}
