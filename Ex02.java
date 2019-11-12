package Vetores;

public class Ex02 {
	static int somavetores(int[]vetors) {
		int soma = 0;
		for(int i = 0;i<vetors.length;i++) {
			System.out.print(vetors[i]+" ");
			soma = soma+vetors[i];
		}
		System.out.println();
		return soma;
	}

	public static void main(String[] args) {
		
		int tamanho = Ex01.tamanhovetor();
		int [] vetors = Ex01.vetor(tamanho);
		int soma = somavetores(vetors);
		System.out.println("A soma de todos os elementos dos vetores e : "+soma);

	}

}
