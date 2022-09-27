package qsp;

import java.awt.AWTException;
import java.awt.Robot;

public class R1 {// mouse actions

	public static void main(String[] args) throws AWTException, InterruptedException {

		System.out.println("stop the program before it turns 25");
		Robot r = new Robot();
		int x = 50, y = 100;

		for (int i = 0; i < 25; i++) {
			r.mouseMove(x, y);
			x = x + 15;
			y = y + 15;
			Thread.sleep(500);
			System.out.println(i);
		}

		System.out.println("the end");

	}

}
