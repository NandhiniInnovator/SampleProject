package org.amg;

import java.util.Scanner;

//public class FactorialNumber {
	
	private void ifstatement() {
	
	Scanner scanner=new Scanner(System.in);
	int num = scanner.nextInt();
		System.out.println("enter the value");
		int fact=1;
		for(int i=1;i<=num;i++) {
			 fact = fact*i;
			System.out.println("Factorial of" +i+ "is");
		}
	}
		
	public static void main(String[] args) {
	
		
		FactorialNumber num = new FactorialNumber();
		//num.ifstatement();
	}

}

	
