package questoes;

import java.util.Arrays;
import java.util.Scanner;

public class Questao03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String palavra;
		System.out.print("");
		palavra = sc.next();

		System.out.println(numParesSubsAnagra(todasSubstringsPossiveis(palavra)));
		sc.close();

	}

	public static char[] converterStrEmLista(String palavra) {
		char[] listaPalavra = palavra.toCharArray();
		return listaPalavra;
	}
	
	public static boolean isAnagrama(String str1, String str2) {
		boolean valido = false;
		char[] listaStr1 = ordenarArray(str1);
		char[] listaStr2 = ordenarArray(str2);
		if (arraysSaoIguais(listaStr1, listaStr2)) {
			valido = true;
		} else {
			valido = false;
		}
		return valido;
	}

	public static char[] ordenarArray(String str) {
		char[] listaStr = converterStrEmLista(str);
		Arrays.sort(listaStr);
		return (listaStr);
	}

	public static boolean arraysSaoIguais(char[] lista1, char[] lista2) {
		boolean valido = true;
		for (int i = 0; i < lista1.length; i++) {
			if (lista1[i] != lista2[i]) {
				valido = false;
				break;
			}
		}
		return valido;
	}

	public static int calcularNumDeSubStr(String str) {
		int numSubStr = 0;
		for (int i = 1; i <= str.length(); i++) {
			numSubStr = numSubStr + i;
		}
		return numSubStr;
	}

	public static String[] todasSubstringsPossiveis(String str) {

		String[] listaSubStr = new String[calcularNumDeSubStr(str)];
		int cont = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length() + 1; j++) {
				listaSubStr[cont] = str.substring(i, j);
				cont += 1;
			}
		}
		return listaSubStr;
	}

	public static int numParesSubsAnagra(String[] listaSubStr) {
		int cont = 0;
		for (int i = 0; i < listaSubStr.length; i++) {
			for (int j = i + 1; j < listaSubStr.length; j++) {

				if (listaSubStr[i].length() == listaSubStr[j].length()) {
					if (isAnagrama(listaSubStr[i], listaSubStr[j])) {
						cont += 1;
						// System.out.println(listaSubStr[i]+" "+listaSubStr[j]);
					}
				}

			}
		}
		return cont;
	}
}
