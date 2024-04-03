package LearningTestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class DependanciesOfMethod {

	@Test( priority = 3, dependsOnMethods = "selection")
	public void interview()
	{
		Reporter.log("This is Interview method");
	}
	
	@Test(priority = 2  , dependsOnMethods = "onboarding")
	public void selection()
	{
		Reporter.log("This is selection method");
	}
	
	@Test(priority = 0)
	public void onboarding()
	{
		Reporter.log("This is Onboarding method");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
