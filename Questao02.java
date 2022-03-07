package desafio_2;

public class Questao02 {

	public static void main(String[] args) {
		int n[] = { 1, 5, 3, 4, 2 };
		int x = 2;
		System.out.println(calcularParesDifIgualX(n, x));

	}

	// Este método recebe como parâmetro o vetor e a variável inteira x, e retorna o
	// número de elementos pares do vetor que tem uma diferença igual ao valor de x
	public static int calcularParesDifIgualX(int[] array, int x) {
		int numPares = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] - array[j] == x) {
					numPares += 1;
					// System.out.println(array[i]+" "+array[j]);
					// A linha comentada acima imprime os pares.
				}
			}
		}
		return numPares;
	}

}