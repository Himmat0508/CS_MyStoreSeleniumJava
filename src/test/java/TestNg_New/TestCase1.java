package TestNg_New;

import org.testng.annotations.*;

public class TestCase1 {
	
	@BeforeTest
	public void beforetest() {
		
		System.out.println("Befoure Test----");
	}
	
	@AfterTest
	public void Aftertest() {
		
		System.out.println("After Test----");
	}
	
	@BeforeClass
	public void beforeclass() {
		
		System.out.println("Befoure Class+++++++++++++++++");
	}
	
	@AfterClass
	public void Afterclass() {
		
		System.out.println("After class+++++++++");
	}

	
	
	@BeforeMethod  
	public void beforemathord() {
		System.out.println("Befoure mathord");
	}
	
	
	@AfterMethod
	public void aftermahod() {
		System.out.println("after mathod ");
	}

	@Test(description = "this is case one")
	public void test1() {

		System.out.println("this is test 1");
		
	}
	@Test(description = "this is case two")
	public void test2() {
		System.out.println("this is test 2");

	}

}
