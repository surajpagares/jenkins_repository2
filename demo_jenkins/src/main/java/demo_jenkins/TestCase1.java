package demo_jenkins;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestCase1 {
@Test
public void TC1()
{
	Reporter.log("Test case 1 running",true);
}
}
