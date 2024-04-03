package numbers;

import java.util.Scanner;

public class Amstrong {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number:");
		int num=sc.nextInt();
		int temp=num;
		int pro=0;
		int ct=0;
		while(temp>0) {
			ct++;
			temp/=10;
		}
		temp=num;
		while(temp>0) {
			int product=1;
			int rem=temp%10;
			for(int i=0;i<ct;i++) {
				product*=rem;
			}
			temp/=10;
			pro+=product;
		}
		if(num==pro)
			System.out.println(num+" is amstrong number");
		else
			System.out.println(num+" is not amstrong number");
	}
}
