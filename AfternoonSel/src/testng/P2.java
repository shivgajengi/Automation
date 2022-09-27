package testng;

import org.testng.annotations.Test;

public class P2 {
	
	@Test(priority=-3,invocationCount = 2)
	public void manjar() {
		System.out.println("meowwww");
	}
	
	@Test(priority=2,invocationCount = 5)
	public void kutra() {
		System.out.println("Bow bow ");
	}

	@Test(invocationCount = 3,priority=1)
	public void kavla() {
		System.out.println("kav kaavvv");
	}

}
