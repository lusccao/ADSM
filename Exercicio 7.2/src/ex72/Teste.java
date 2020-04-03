package ex72;

import java.util.Arrays;

public class Teste {
	// N�mero de termos.
	private static final int NUM = 5;

	// Construindo um vetor
	private static Double[] construirVetor() {
		Double[] d = new Double[NUM];
		for (int i = 0; i < d.length; i++)
			d[i] = Math.random() * NUM;
		return d;
	}

	// M�todo principal
	public static void main(String[] args) throws Exception {
		// Constroi o vetor.
		Double[] v = construirVetor();
		System.out.println(Arrays.toString(v));

		// Ordena o vetor.
		Arrays.sort(v, new ComparatorDouble());

		// Imprime o vetor.
		System.out.println(Arrays.toString(v));
	}
}
