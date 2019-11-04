package Vetores;

import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println(" Digite um valor : ");
		int n = sc.nextInt();
		
		int [] v = new int [n];
	
		for (int i = 0;i<n;i++) {
			System.out.println("Digite a posicao do vetor");
			
			int r = sc.nextInt();
			v[i] = r;
			
			System.out.println(v[i]);
		}
		sc.close();
		}

}
