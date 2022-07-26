package desafios;

public class Respostadesafio04 {
	public static void main(String[] args) {
		double x = 0;
		double x1 = 0;
		double x2 = 0;
		double v1 = 0;
		double v2 = 0;
		double t = 0.17;

		/*
		 * O carro e o caminhão estão à mesma distância de Ribeirão Preto ao eles se
		 * cruzarem, eles se encontram a 60,9 km de Ribeirão Preto.
		 * 
		 * Para determinar o local em que o carro e o caminhão se cruzam podemos colocar
		 * o ponto de referência em Ribeirão Preto, então, a equação horária do carro é:
		 */
		v1 = 110;
		x1 = v1 * t;
		System.out.println("Equação horária do carro: x1 = v * t = " + x1);
		/*
		 * Como o caminhão sai de um local 100 km distante do ponto de referência e se
		 * aproxima dele, sua equação horária é:
		 */
		x2 = 100 - v2 * t;

		System.out.println("Equação horária do caminhão: X² = 100km - v².t = " + x2);

		/*
		 * Como o caminhão tem 2 pedágios como obstáculo e perde 5 minutos em cada um
		 * deles, podemos calcular o tempo de viagem sem os obstáculos:
		 */

		double tempoSemObstaculo = 100.0 / 80.0;
		System.out.println("Tempo de viagem sem obstaculo: " + tempoSemObstaculo);

		/*
		 * Porém, como perde 10 minutos (ou 0,17 horas) nos pedágios, o tempo de viagem
		 * para o caminhão será de 1,25h+0,17h=1,42h. Sua velocidade média é:
		 */

		double tempoDeViagemMaisObstaculo = tempoSemObstaculo + t;

		v2 = 100.0 / tempoDeViagemMaisObstaculo;
		System.out.println("tempo de viagem com perda de 10min = V2 = 100/1,42 = " + v2);
		/*
		 * Nas equações horárias podemos limpar o tempo e igualar ambas para achar o
		 * ponto em que o carro e o caminhão se cruzam:
		 */
		System.out.println("Aplicação da formula: ");
		System.out.println("t=x1/v1");
		System.out.println("t= x²-100/v²");
		System.out.println("x1 =x² => x/v1=x-100/v²");
		System.out.println("-v².x =v1.x -v1.100km");
		System.out.println("(x.100/v1+v2)=(110.100/110+70,6)");

		x = (v1 * 100) / (v1 + v2);

		/*
		 * Essa é a distância da cidade de Ribeirão Preto em que o carro e o caminhão se
		 * cruzam, ambos estão à mesma distância.
		 */
		System.out.println("Resultado: X= " + x);
	}

}
