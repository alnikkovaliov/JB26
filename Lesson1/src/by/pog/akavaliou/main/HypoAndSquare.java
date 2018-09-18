package by.pog.akavaliou.main;

import java.util.Scanner;

public class HypoAndSquare {	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, input 1st side: ");		
		int a = sc.nextInt();
		
		System.out.println("Please, input 2nd side: ");
		int b = sc.nextInt();
		
		sc.close();
		System.out.printf("Hypotenuse is: %s", Math.sqrt((a*a + b*b)));
		System.out.printf("\nSquare is: %s", ((double)a*b/2));
	}

}
