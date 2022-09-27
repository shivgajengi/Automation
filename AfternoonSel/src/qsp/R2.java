package qsp;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

public class R2 {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {

		Runtime.getRuntime().exec("notepad");
		Thread.sleep(1000);
		Robot r = new Robot();
		
		r.keyPress(KeyEvent.VK_Q);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_S);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_P);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_SHIFT);
		r.keyPress(KeyEvent.VK_J);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_S);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_SHIFT);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_1);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_2);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_LEFT);
		Thread.sleep(1000);
		r.keyPress(KeyEvent.VK_SPACE);

	}

}
