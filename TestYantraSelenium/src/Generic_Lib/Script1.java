package Generic_Lib;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Script1 extends BaseScript {
	
	@Test
	public void Method1()
	{
		Reporter.log("This is method1()",true);
	}

}
