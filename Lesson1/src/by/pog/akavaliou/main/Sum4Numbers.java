package by.pog.akavaliou.main;

import java.util.Scanner;

public class Sum4Numbers {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please, input 1st number: ");		
		int a = sc.nextInt();		
		System.out.println("Please, input 2nd number: ");		
		int b = sc.nextInt();
		System.out.println("Please, input 3rd number: ");		
		int c = sc.nextInt();		
		System.out.println("Please, input 4th number: ");
		int d = sc.nextInt();
		
		sc.close();
		System.out.printf("The Sum is: %s", (a + b + c + d));

	}

}
