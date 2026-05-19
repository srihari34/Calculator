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
		
		if(oper == 3) {
		    ca.multiply(a, b);
		}

		if(oper == 4) {
    ca.divide(a, b);
    }
		
		if(oper == 5) {
		    ca.modulus(a, b);
		}
		if(oper == 5) {
		    ca.division(a, b);
		}
      sc.close();
	}
	
	// UserA - Added Modulus method pending is done
	// This is for git fetch testing

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

	     // UserA - Added Multiplication method
     private void multiply(int x, int y) {
         int c = x * y;
         System.out.println("You have selected Multiplication");
         System.out.println("Result is : " + c);
     }
	 
	   // UserB - Added Division method
     private void divide(int x, int y) {
      if(y == 0) {
        System.out.println("Division by zero not allowed!");
          } else {
        int c = x / y;
        System.out.println("You have selected Division");
        System.out.println("Result is : " + c);
    }
}
  // UserA - Added Modulus method
     private void modulus(int x, int y) {
         int c = x % y;
         System.out.println("You have selected Modulus");
         System.out.println("Result is : " + c);
     }
     private void division(int x, int y) {
         int c = x / 2;
         System.out.println("You have selected Modulus");
         System.out.println("Result is : " + c);
     }

     

// UserB - Code reviewed and approved

}
