package studio3;

import java.util.Arrays;
import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter an integer");
		int n = in.nextInt();
		Boolean[] A = new Boolean[n + 1];
		Arrays.fill(A, Boolean.TRUE);

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (A[i] == true) {
				for (int j = i * i; j <= n; j = j + i) {
					A[j] = false;
				}
			}
			System.out.print("After " +  (i-1) + " iteration:");
			for (int k = 2; k <= n; k++) {
				if(A[k] == true) {
					System.out.print(k + " ");
				}
				
			}
			System.out.println("");
		}
		
		
		System.out.print("The final result is: ");
		for (int k = 2; k <= n; k++) {
			if(A[k] == true) {
				System.out.print(k + " ");
			}
		}
	}
}
