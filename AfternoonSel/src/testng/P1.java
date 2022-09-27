package testng;

import org.testng.Reporter;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class P1 {
	
	@BeforeSuite
	public void e1() {
		System.out.println("before suite");
	}
	
	@Test
	public void chickoo() {
		
		Reporter.log("Sapota",true);
	}
	
	@Test
	public void apple() {
		
		Reporter.log("safarchand",true);
	}
	
	@Test
	public void banana() {
		
		Reporter.log("kela",true);
	}
	
	
	
	

}
