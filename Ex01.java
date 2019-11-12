package Vetores;

import java.util.Random;
import java.util.Scanner;

public class Ex01 {
	static Scanner sc  = new Scanner (System.in);
	static Random ale = new Random();
	
	static int tamanhovetor() {
		int tamanho;
		System.out.println(" Informe o tamanho do vetor : ");
		tamanho = sc.nextInt();
		return tamanho;
	}
	static int[] vetor(int tamanho) {
		
		int [] vetor = new int[tamanho];
		
		for(int i = 0; i<vetor.length;i++) {
			
				vetor[i] = (int) ale.nextInt(11)+1;
				}
		return vetor;
	}
	static void imprimevetor(int vetor1[]) {
		
		for (int i = 0; i < vetor1.length; i++) {
			
		System.out.print(vetor1[i]+" ");			
		}	
		}

	public static void main(String[] args) {
		
		int tamanho = tamanhovetor();
		int []vetor1 = vetor(tamanho);
		
		imprimevetor(vetor1);
		
		
		
	}

}
