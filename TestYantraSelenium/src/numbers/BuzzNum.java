package numbers;

import java.util.Scanner;

public class BuzzNum {
	public static boolean isBuzzNum(int num) {
		int lastdigit=num%10;
		if(num%7==0 || lastdigit==7)
			return true;
		return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		
		if(isBuzzNum(num))
			System.out.println(num+" is a buzz number");
		else
			System.out.println(num+" is not a buzz number");
	}
}
