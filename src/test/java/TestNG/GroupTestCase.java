package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GroupTestCase {

	

	@Test(priority = 1, groups = "Himmat")
	public void LoginTest()

	{
		System.out.println("Login Sucssesfully");

	}

	@Test(priority = 2, groups = "Himmat")
	public void LogoutTest()

	{
		System.out.println("Logout Sucssesfully");

	}
	@Test (groups = {"qdegrees","services"})
	public void Title()

	{
		System.out.println("Logout123 Sucssesfully");

	}


}
