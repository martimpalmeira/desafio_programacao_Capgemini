package desafio_2;

import java.util.Scanner;

public class Questao03_d2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva uma String que será encriptada: ");
		String s = sc.nextLine();
		s = tirarEspaco(s);
		imprimir(formarGrid(s, calcularNumLin(s)));
	}

	public static String tirarEspaco(String txt) {
		txt = txt.replace(" ", "");
		return txt;
	}

	public static char[][] formarGrid(String txt, int lin) {
		int cont = 0;
		char[][] vetor = new char[lin][lin];
		for (int i = 0; i < lin; i++) {
			for (int j = 0; j < lin; j++) {
				if (cont >= txt.length()) {
					vetor[i][j] = ' ';
				} else {
					vetor[i][j] = txt.charAt(cont);
				}

				cont += 1;

			}
		}
		return vetor;
	}

	public static int calcularNumLin(String txt) {
		double lin = Math.ceil(Math.sqrt(txt.length()));
		int col = (int) lin;
		return col;

	}

	public static void imprimir(char[][] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor[i].length; j++) {
				if (vetor[j][i] != ' ') {
					System.out.print(vetor[j][i]);
				}

			}
			System.out.print(" ");
		}
	}

}
