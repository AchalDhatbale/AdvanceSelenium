package LearningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGBasics {
	
	@Test(priority = 2)
	public void add() {
		Reporter.log("This is from add()", true);
	}

	@Test(priority = 0)
	public void sub() {
		Reporter.log("This is from sub()",true );
	}

	@Test(priority = 1)
	public void mul() {
		Reporter.log("This is from mul()",true);
	}

}
