package TestNg_New;

import org.testng.annotations.Test;

public class TestCase2 {
	
	@Test (priority = 3)
	public void test3() {

		try {
			Thread.sleep(400);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("this is test 3");
		
	}
	@Test
	public void test4() {
		System.out.println("this is test 4");

	}
	@Test(priority = 1)
	public void test5() {
		System.out.println("this is test 5");
	}

}
