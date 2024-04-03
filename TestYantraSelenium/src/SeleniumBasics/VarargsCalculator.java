package SeleniumBasics;

public class VarargsCalculator {

	public double add(double...ref)
	{
	   double sum = 0;
	
		for(double s : ref)
		{
			sum = sum + s;
		}
		return sum;
	}

}
