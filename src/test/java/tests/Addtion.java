package tests;
import java.util.Scanner;
public class Addtion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("This is Addtions of 2 number By entering it one after the Other:");
		System.out.println("Enter the First Number");
		int a= sc.nextInt();
		System.out.println("Enter the Second Number");
		int b= sc.nextInt(); 
		//Adding the 2 numbers
		int c =a + b;
		//Printing the C value in Console
		System.out.println("The Addtion of Given 2 Numebr is  : " + c);
		sc.close();
	}

}
