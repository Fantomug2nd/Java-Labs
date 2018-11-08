package lab_1;

import java.util.Scanner;

public class View {
	public void printMatrix(long[][] A) {
		for(int i = 0 ; i < A.length; i++) {
			for(int j = 0; j< A[i].length; j++)
				System.out.printf("%6d", A[i][j]);
			System.out.println();
		}
		System.out.println();
	}
	
	public int getN() {
		
		Scanner scan = new Scanner(System.in);
		int N;
		do {
			System.out.print("Enter N: ");
			N = scan.nextInt();
		}while(N <= 0);
		
		return N;
	}
	
	public int getM() {
		
		Scanner scan = new Scanner(System.in);
		int m;
		do {
			System.out.print("Enter m: ");
			m = scan.nextInt();
		}while(m <= 0);
		
		return m;
	}
	
	public void printName() {
		System.out.println("Koshovets Y.P.");
	}
	
}

