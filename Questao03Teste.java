package desafio_2;

public class Questao03Teste {

	public static void main(String[] args) {
		// ---------------testarTirarEspaco----------------
		String s = "tenha um bom dia";
		String mensagemEsperada = "tenhaumbomdia";

		if (testarTirarEspaco(s, mensagemEsperada)) {
			System.out.println("Passou no teste");
		} else {
			System.out.println("Falhou no teste");
		}

		// ------------testarCalcularNumLin----------------
		String txt = "tenhaumbomdia";
		int resultadoEsperado = 4;
		if (testarCalcularNumLin(txt, resultadoEsperado)) {
			System.out.println("Passou no teste");
		} else {
			System.out.println("Falhou no teste");
		}

	}

	public static boolean testarTirarEspaco(String s, String mensagemEsperada) {
		String mensagem = Questao03.tirarEspaco(s);
		if (mensagemEsperada.equals(mensagem)) {
			return true;
		} else {
			return false;
		}

	}

	public static boolean testarCalcularNumLin(String txt, int resultadoEsperado) {
		int resultado = Questao03.calcularNumLin(txt);
		if (resultado == resultadoEsperado) {
			return true;
		} else {
			return false;
		}

	}

}
