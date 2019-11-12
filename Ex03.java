package Vetores;

public class Ex03 {
	static int maiorvetor(int []vetor) {
		int maior = 0;
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i]+" ");
			if(vetor[i]>=maior) {
				
				maior = vetor[i];
			}
			
		}
		System.out.println();
	return maior;	
	}

	public static void main(String[] args) {
		int tamanho = Ex01.tamanhovetor();
		int []vetorm = Ex01.vetor(tamanho);
		int nmaior =	maiorvetor(vetorm);
		System.out.println("O maior numero do vetor e : "+nmaior);

	}

}
