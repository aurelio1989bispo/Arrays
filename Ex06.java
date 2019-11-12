package Vetores;

public class Ex06 {
static int produtodovetor(int vetor[]) {
	int produto = 1;
	for (int i = 0;i<vetor.length;i++) {
		produto = produto*vetor[i];
		System.out.print(vetor[i]+" ");
	}
	return produto;
}
	public static void main(String[] args) {
		int tamanho = Ex01.tamanhovetor();
		int vetor[]= Ex01.vetor(tamanho);
		int multvetor = produtodovetor(vetor);
		
		System.out.println(" A multiplicacao dos elementos do vetores e : "+multvetor);
	}
}