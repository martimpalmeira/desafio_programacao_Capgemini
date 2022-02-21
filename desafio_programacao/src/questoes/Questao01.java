package questoes;

public class Questao01 {

	public static void main(String[] args) {
		Imprimir(formarTabela(6));

	}

	public static char[][] formarTabela(int n) {

		char[][] tabela = new char[n][n];
		for (int i = 0; i < tabela.length; i++) {
			for (int j = 0, c = tabela.length - 1; j < tabela[i].length; j++, c--) {
				if (i >= c) {
					tabela[i][j] = '*';
				} else {
					tabela[i][j] = ' ';
				}

			}
		}
		return tabela;
	}

	public static void Imprimir(char[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			System.out.println();
		}
	}

}
