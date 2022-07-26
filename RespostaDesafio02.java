package desafios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RespostaDesafio02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Infome um número: ");
		long n = scan.nextLong();
		scan.close();
		long i = 0;
		long indexOfMatch = 0;

		List<Long> listaFibonacci = new ArrayList<Long>();
		System.out.println();
		System.out.println("Sequência Fibonacci: ");
		for (i = 0; i < n; i++) {
			System.out.println("(" + i + "):" + fibo(i));
			listaFibonacci.add(fibo(i));
			if (fibo(i) == n)
				indexOfMatch = i;

		}
		System.out.println();

		if (listaFibonacci.contains(n)) {
			System.out.println("Número " + n + " Pertence a sequência, encontrado na posição: " + indexOfMatch);
		} else {
			System.out.println("Número " + n + " Não pertence a sequência");
		}

	}

	static long fibo(Long n) {
		if (n < 2) {
			return n;
		} else {
			return fibo(n - 1) + fibo(n - 2);
		}
	}
}
