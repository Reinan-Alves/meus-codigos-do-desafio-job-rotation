package desafios;

public class RespostaDesafio01 {
	/*
	 * 1) Observe o trecho de c�digo abaixo:
	 * 
	 * int INDICE = 13, SOMA = 0, K = 0;
	 * 
	 * enquanto K < INDICE fa�a
	 * 
	 * {
	 * 
	 * K = K + 1;
	 * 
	 * SOMA = SOMA + K;
	 * 
	 * }
	 * 
	 * imprimir(SOMA);
	 * 
	 * 
	 * 
	 * Ao final do processamento, qual ser� o valor da vari�vel SOMA?
	 */
	public static void main(String[] args) {

		int INDICE = 13;
		int SOMA = 0;
		int K = 0;

		while (K < INDICE) {

			K = K + 1;
			SOMA = SOMA + K;

		}
		
		System.out.println(SOMA);
		
	}
	//RESPOSTA FINAL : SOMA = 91;
}
