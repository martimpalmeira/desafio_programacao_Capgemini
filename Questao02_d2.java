package desafio_2;

import java.util.Scanner;

public class Questao02_d2 {

	public static void main(String[] args) {
		int x = lerX(), tamArray = lerTamanho();
		int n[] = new int[tamArray];
		n = formarArray(tamArray);
		System.out.print("O vetor possui "+calcularParesComDifIgualX(n, x)+" pares de números cuja diferença é igual à "+x);

	}

	public static int lerTamanho() {
		int tam;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um número para o tamanho do array: ");
		tam = sc.nextInt();

		return tam;
	}

	public static int[] formarArray(int tam) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int num;
		int[] n = new int[tam];
		for (int i = 0; i < tam; i++) {
			System.out.println("Digite o próximo número do array: ");
			num = sc.nextInt();
			n[i] = num;
		}

		return n;
	}

	public static int lerX() {
		int x;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe o valor para x: ");
		x = sc.nextInt();
		return x;
	}

	public static int calcularParesComDifIgualX(int[] array, int x) {
		int cont = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array.length; j++) {
				if (array[i] - array[j] == x) {
					cont += 1;
					//System.out.println(array[i]+" "+array[j]);
				}
			}
		}
		return cont;
	}
}
