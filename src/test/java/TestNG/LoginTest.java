package TestNG;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {

	@BeforeTest
	public void login1() {
		System.out.println("This is Himmat Singh");
	}

	@AfterTest
	public void Logout2() {
		System.out.println("i am from Jaipur");
	}

	@BeforeMethod
	public void firstmethod()
	{
		System.out.println("DB Connected");
	}
	@AfterMethod
	public void AfterMethod()
	{
		System.out.println("DB DisConnected");
	}

	@Test(priority = 1, description = "Himmat ")
	public void LoginTest()

	{
		System.out.println("Login Sucssesfully");

	}

	@Test(priority = 2, description = "singh")
	public void LogoutTest()

	{
		System.out.println("Logout Sucssesfully");

	}

}
