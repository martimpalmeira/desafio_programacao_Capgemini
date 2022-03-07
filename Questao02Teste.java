package desafio_2;

public class Questao02Teste {

	public static void main(String[] args) {
		int[] n = { 1, 5, 3, 4, 2 };
		int x = 2, resultadoEsperado = 3;
		if (testarCalcularParesDifIgualX(n, x, resultadoEsperado)) {
			System.out.println("Passou no teste");
		} else {
			System.out.println("Falhou no teste");
		}

	}

	public static boolean testarCalcularParesDifIgualX(int[] n, int x, int resultadoEsperado) {
		int resultado = Questao02.calcularParesDifIgualX(n, x);
		if (resultado == resultadoEsperado) {
			return true;
		} else {
			return false;
		}
	}

}
