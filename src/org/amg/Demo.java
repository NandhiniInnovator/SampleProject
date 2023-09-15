package org.amg;

import java.util.Scanner;

public class Demo {
	
	System.out.println("Enter the number");	
	Scanner scanner= new Scanner(System.in);
	int value=scanner.nextInt();
		
	public static void main(String[] args) {
		int count=1;
		for(int i=1;i<=100;i++){
		count=count*i;
		System.out.println(count);
		}


	}
	}
