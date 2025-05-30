package javaproject;

import java.util.Scanner;

public class InputExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Age:");
		int age = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Enter the name:");
		String name = sc.nextLine();
		
		System.out.println(age+name);
		
		
		
		

		// TODO Auto-generated method stub

	}

}
