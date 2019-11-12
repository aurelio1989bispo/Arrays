package Vetores;

public class Ex04 {
	static int menorvetor(int[]mvetor) {
		int menor = mvetor[0]; ;
		
		for(int i = 0;i<mvetor.length;i++) {
			System.out.println(mvetor[i]);
			if (mvetor[i]<=menor) {
				
				menor = mvetor[i];
			}
			
			
		}
		System.out.println();
		return menor;
	}

	public static void main(String[] args) {
		int tamanho = Ex01.tamanhovetor();
		int []mvetor = Ex01.vetor(tamanho);
		int menorn = menorvetor(mvetor);
		
		System.out.println("O menor numero do vetor e : "+menorn);
		

	}

}
