package questoes;

import java.util.Scanner;

public class Questao02 {

	public static void main(String[] args) {
		String senha;
		Scanner sc = new Scanner(System.in);
		System.out.print("");
		senha = sc.next();
		System.out.println(verificarSenha(senha));
		sc.close();
	}

	public static int verificarSenha(String senha) {
		int nDeCaractDigitado = senha.length();
		int nDeCaractFaltam = 6 - nDeCaractDigitado;
		if (nDeCaractFaltam <= 0) {
			nDeCaractFaltam = 0;
		}
		return nDeCaractFaltam;
	}

}