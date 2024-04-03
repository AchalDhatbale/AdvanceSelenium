package SeleniumBasics;

public class CalculatorDriver {

	public static void main(String[] args) {
		VarargsCalculator vc = new VarargsCalculator();
		System.out.println(vc.add(1,2,3));
		System.out.println(vc.add(1,1,2,3,4,4,5,6,-1,7,8,7.6,4343545,0));
         
	}

}
