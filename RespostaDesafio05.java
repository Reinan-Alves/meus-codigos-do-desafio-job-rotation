package desafios;

import java.util.Scanner;

public class RespostaDesafio05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite uma palavra: ");
		String palavra = scan.next();
		
		for(int i = palavra.length()-1; i >=0 ; i--) {
			
			System.out.print(palavra.charAt(i));
			
		}				
		scan.close();
	}

}
