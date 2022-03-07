package desafio_2;

public class Questao01Teste {

	public Questao01 questao01;

	public static void main(String[] args) {
		int[] array = { 9, 2, 1, 4, 6 };
		int resultadoEsperado = 4;
		if (testarEncontrarMediana(array, resultadoEsperado)) {
			System.out.println("Passou no teste");
		} else {
			System.out.println("Falhou no teste");
		}

	}

	public static boolean testarEncontrarMediana(int[] array, int resultadoEsperado) {
		int resultado = Questao01.encontrarMediana(array, Questao01.retornarIndiceMediana(array));
		if (resultadoEsperado == resultado) {
			return true;
		} else {
			return false;
		}
	}

}
