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
		if(oper == 2) 
		{
           ca.subtract(a, b);
        }
		
      sc.close();
	}
     // UserA - Added Addition method
	private void add(int x, int y) {
		
		int c = x + y;
		System.out.println("You have selected '1' ie addition");
		System.out.println("And the Addition of 2 Numbers is : " + c);
		
	}
	

	// UserB - Added Subtraction method
     private void subtract(int x, int y) 
	 {
       int c = x - y;
       System.out.println("You have selected '2' ie Subtraction");
       System.out.println("And the Subtraction of 2 Numbers is : " + c);
       }

}
