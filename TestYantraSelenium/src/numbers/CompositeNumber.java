package numbers;

import java.util.Scanner;

public class CompositeNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		
		if(num<=3)
			System.out.println(num+" is not composite number");
		
		for(int i=1;i<num;i++) {
			if(num%i==0 || num%i+1==0) {
				System.out.println(num+" is composite number");
				break;
			}
			else {
				System.out.println(num+" is not composite number");
				break;
			}
		}
	}
}
