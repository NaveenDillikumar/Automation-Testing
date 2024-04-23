package RobotClass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class NotePadTest {
public static void main(String[] args) throws IOException, InterruptedException, AWTException {
	
	Runtime.getRuntime().exec("notepad");
	
	Thread.sleep(3000);
	Robot robo=new Robot();
	
	robo.keyPress(KeyEvent.VK_SHIFT);
	robo.keyPress(KeyEvent.VK_N);
	robo.keyPress(KeyEvent.VK_A);
	robo.keyPress(KeyEvent.VK_V);
	robo.keyPress(KeyEvent.VK_E);
	robo.keyRelease(KeyEvent.VK_E);
	robo.keyPress(KeyEvent.VK_E);
	robo.keyPress(KeyEvent.VK_N);
	robo.keyRelease(KeyEvent.VK_SHIFT);
}
}
