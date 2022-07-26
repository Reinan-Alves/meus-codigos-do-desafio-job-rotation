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
		 * O carro e o caminh�o est�o � mesma dist�ncia de Ribeir�o Preto ao eles se
		 * cruzarem, eles se encontram a 60,9 km de Ribeir�o Preto.
		 * 
		 * Para determinar o local em que o carro e o caminh�o se cruzam podemos colocar
		 * o ponto de refer�ncia em Ribeir�o Preto, ent�o, a equa��o hor�ria do carro �:
		 */
		v1 = 110;
		x1 = v1 * t;
		System.out.println("Equa��o hor�ria do carro: x1 = v * t = " + x1);
		/*
		 * Como o caminh�o sai de um local 100 km distante do ponto de refer�ncia e se
		 * aproxima dele, sua equa��o hor�ria �:
		 */
		x2 = 100 - v2 * t;

		System.out.println("Equa��o hor�ria do caminh�o: X� = 100km - v�.t = " + x2);

		/*
		 * Como o caminh�o tem 2 ped�gios como obst�culo e perde 5 minutos em cada um
		 * deles, podemos calcular o tempo de viagem sem os obst�culos:
		 */

		double tempoSemObstaculo = 100.0 / 80.0;
		System.out.println("Tempo de viagem sem obstaculo: " + tempoSemObstaculo);

		/*
		 * Por�m, como perde 10 minutos (ou 0,17 horas) nos ped�gios, o tempo de viagem
		 * para o caminh�o ser� de 1,25h+0,17h=1,42h. Sua velocidade m�dia �:
		 */

		double tempoDeViagemMaisObstaculo = tempoSemObstaculo + t;

		v2 = 100.0 / tempoDeViagemMaisObstaculo;
		System.out.println("tempo de viagem com perda de 10min = V2 = 100/1,42 = " + v2);
		/*
		 * Nas equa��es hor�rias podemos limpar o tempo e igualar ambas para achar o
		 * ponto em que o carro e o caminh�o se cruzam:
		 */
		System.out.println("Aplica��o da formula: ");
		System.out.println("t=x1/v1");
		System.out.println("t= x�-100/v�");
		System.out.println("x1 =x� => x/v1=x-100/v�");
		System.out.println("-v�.x =v1.x -v1.100km");
		System.out.println("(x.100/v1+v2)=(110.100/110+70,6)");

		x = (v1 * 100) / (v1 + v2);

		/*
		 * Essa � a dist�ncia da cidade de Ribeir�o Preto em que o carro e o caminh�o se
		 * cruzam, ambos est�o � mesma dist�ncia.
		 */
		System.out.println("Resultado: X= " + x);
	}

}
