package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class P4 {
	
	@AfterClass
	public void b2() {
		System.out.println("After class");
	}
	
	@Test
	public void b3() {
		System.out.println("test 1");
	}
	
	@Test
	public void b4() {
		System.out.println("test 2");
	}
	
	@BeforeClass
	public void b1() {
		System.out.println("Before class");
	}
	
	@BeforeMethod
	public void c1() {
		System.out.println("Before method");
	}
	
	@AfterMethod
	public void c2() {
		System.out.println("After method");
	}
	
	@AfterSuite
	public void e2() {
		System.out.println("After suite");
	}

}
