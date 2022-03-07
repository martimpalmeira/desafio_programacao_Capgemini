package desafio_2;

import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Escreva uma String que será encriptada: ");
		String s = sc.nextLine();
		s = tirarEspaco(s);
		imprimir(formarGrid(s, calcularNumLin(s)), calcularNumLin(s));
	}

	// Este método recebe como parâmetro uma string e retorna a string com os
	// espaços removidos.
	public static String tirarEspaco(String txt) {
		txt = txt.replace(" ", "");
		return txt;
	}

	// Este método recebe como parâmetro a string(com espaços removidos), calcula a
	// raiz quadrada do tamanho da string, arredonda para o número inteiro alto mais
	// próximo e armazena numa variável que indica o número de linhas e colunas da
	// grid. Em seguida retorna o número.
	public static int calcularNumLin(String txt) {
		double lin = Math.ceil(Math.sqrt(txt.length()));
		int col = (int) lin;
		return col;

	}

	// Este método recebe como parâmetro a string(com espaços removidos) e o número
	// de linhas/colunas. Cria uma variável contador e um array bidimensional,
	// preenche as posições do array com os caracteres da string, até que tenha
	// completado todas as posições. Se o número de posições ultrapassar o
	// comprimento da string, as posições que não foram preenchidas com nenhum
	// caractere serão preenchidas com um caractere de espaço.
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

	// Este método recebe como parâmetro o vetor de caracteres e o número de
	// linhas/colunas, e exibe os
	// caracteres(se for diferente de espaço) de cada coluna separados por um espaço enquanto o contador c for
	// menor que o número de colunas.
	public static void imprimir(char[][] vetor, int lin) {
		int cont = 1;
		for (int i = 0; i < vetor.length; i++) {
			for (int j = 0; j < vetor[i].length; j++) {
				if (vetor[j][i] != ' ') {
					System.out.print(vetor[j][i]);
				}

			}
			if (cont < lin) {
				System.out.print(" ");
				cont++;
			}

		}
	}

}