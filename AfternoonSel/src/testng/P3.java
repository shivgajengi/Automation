package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class P3 {
	@BeforeTest
	public void d1() {
		System.out.println("before test");
	}
	@AfterTest
	public void d2() {
		System.out.println("After test");
	}
	
	@AfterClass
	public void b2() {
		System.out.println("After class");
	}
		
	@Test
	public void test1() {
		System.out.println(" test 1 ");
	}
	
	@BeforeMethod
	public void a1() {
		System.out.println("before method");
	}
	
	@AfterMethod
	public void a2() {
		System.out.println("After method");
	}
	@BeforeClass
	public void b1() {
		System.out.println("Before class");
	}

}
