package tests;

import java.util.Scanner;

public class Cal {

	public static void main(String[] args) {
		Cal ca = new Cal();
		Scanner sc = new Scanner(System.in);
		System.out.println("Select the Operation");
		System.out.println("For Addition Enter '1' or Subtraction Enter '2' :");
		int oper = sc.nextInt();
		System.out.println("Enter the First Number");
		int a= sc.nextInt(); 
		System.out.println("Enter the Second Number");
		int b= sc.nextInt(); 
		if(oper == 1)
		{
			ca.add(a,b);
		}
		
      sc.close();
	}

	private void add(int x, int y) {
		
		int c = x + y;
		System.out.println("You have selected '1' ie addition");
		System.out.println("And the Addition of 2 Numbers is : " + c);
		
	}
	
	//Subtraction is pending

}
