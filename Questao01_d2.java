package desafio_2;

import java.util.Scanner;

import java.util.Arrays;

public class Questao01_d2 {

	public static void main(String[] args) {
		int tam = lerTamanho();
		int[] array = new int[tam];
		array = formarArray(tam);
		imprimir(encontrarMediana(array, retornarIndiceMediana(array)));
	}

	public static int[] formarArray(int tam) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		int n;
		int[] array = new int[tam];
		for (int i = 0; i < tam; i++) {
			System.out.println("Digite o próximo número do array: ");
			n = sc.nextInt();
			array[i] = n;
		}

		return array;
	}

	public static int lerTamanho() {
		int tam;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe um número ímpar para o tamanho do array: ");
		tam = sc.nextInt();

		return tam;
	}

	public static void imprimir(int n) {
		System.out.println(n);
	}

	public static int encontrarMediana(int[] array, int indMed) {
		Arrays.sort(array);
		return array[indMed];

	}

	public static int retornarIndiceMediana(int[] array) {
		int indMed = array.length / 2;
		return indMed;
	}
}
