package desafios;

public class RespostaDesafio03 {
	public static void main(String[] args) {
		// 3) Descubra a lógica e complete o próximo elemento:
		
		// a) 1, 3, 5, 7, _?_

		System.out.println("(a)Resp: Cada número é igual ao anterior + 2,o próximo da sequência será 7 + 2 = 9");

		// b) 2, 4, 8, 16, 32, 64, _?_ 

		System.out.println("(b)Cada número é igual ao anterior multiplicado por 2, o próximo da sequência será 64 x 2 = 128");

		// c) 0, 1, 4, 9, 16, 25, 36, _?_

		System.out.println("(c)Resp:Cada número é igual ao anterior acrescido de um número ímpar que segue a sequência:"
				+ " 1, 3, 5, 7, 9...\n o proximo da sequência será 36 + 13 = 49");

		// d)4, 16, 36, 64, _?_

		System.out.println("(d)Resp: Cada número é igual ao quadrado dos números pares"
				+ " seguintes ao primeiro, próxima sequência será 10² = 100");

		// e) 1, 1, 2, 3, 5, 8, _?_

		System.out.println("(e)Resp: Cada número é igual à soma do número atual com o"
				+ "número anterior, próximo da sequência será 8 + 5 = 13");

		// f) 2,10, 12, 16, 17, 18, 19, __?__

		System.out.println("(f)Resp: Sequência formada através de todos os "
				+ "números que iniciam com a letra d,próxima da sequência será 200");

	}

}
