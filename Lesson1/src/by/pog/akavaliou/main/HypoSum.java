package by.pog.akavaliou.main;

import java.util.Scanner;

public class HypoSum {	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, input 1st side: ");		
		int a = sc.nextInt();
		
		System.out.println("Please, input 2nd side: ");
		int b = sc.nextInt();
		sc.close();
		System.out.printf("Result is: %s", (a*a + b*b));
	}

}
