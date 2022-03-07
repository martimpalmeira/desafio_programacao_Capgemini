package desafio_2;

import java.util.Arrays;

public class Questao01 {

	public static void main(String[] args) {

		int[] array = { 9, 2, 1, 4, 6 };
		System.out.println(encontrarMediana(array, retornarIndiceMediana(array)));

	}

	// Este método retorna o índice da mediana em um array com número ímpar de
	// elementos

	public static int retornarIndiceMediana(int[] array) {
		int indMed = array.length / 2;
		return indMed;
	}

	// Este método recebe como parâmetro o vetor e o índice da mediana, e retorna a
	// mediana do vetor

	public static int encontrarMediana(int[] array, int indMed) {
		Arrays.sort(array);
		return array[indMed];

	}

}
