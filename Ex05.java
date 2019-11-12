package Vetores;

public class Ex05 {
	static int mediavetor(int soma,int tamanho) {
		int media;
		 media = soma/tamanho;
	     return media;
	}

	public static void main(String[] args) {
		int tamanho = Ex01.tamanhovetor();
		int vetor[] = Ex01.vetor(tamanho);
		int media = mediavetor(Ex02.somavetores(vetor),tamanho);
		
		System.out.println(" A media de todos os valores no vetor e : "+media);
		}
}