package Vetores;

import java.util.Scanner;

public class ExemploVetoriosfuncoes {
	static Scanner sc = new Scanner (System.in);
	
	static int tamanhovetor() {
		
		System.out.println( "Tamanho :");
		int tamanho = sc.nextInt();
		
		return tamanho;
	}
	
	static int[] criaVetor(int t) {
		int [] vetor =  new int [t];
		return vetor;
	}
	
	static int [] populaVator(int[] vetor) {
		
		for (int i=0;i<vetor.length;i++) {
			System.out.println(" Elemento : ");
			vetor[i] = sc.nextInt();
		}
		
		return vetor;
	}
	
	static void imprimeVetor(int[]vetor) {
		for (int i = 0;i<vetor.length;i++) {
			
			System.out.println("Elemento do Vetor"+"\n"+vetor[i]);
		}
	}
	

	public static void main(String[] args) {
		
		int t = tamanhovetor();
		int [] vetor =  criaVetor(t);
		vetor = populaVator(vetor);
		imprimeVetor(vetor);
		

	}

}
