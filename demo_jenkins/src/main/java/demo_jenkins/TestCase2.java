package demo_jenkins;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase2 {
	@Test
	public void TC2()
	{
		Reporter.log("Test case 2 running",true);
	}
}
