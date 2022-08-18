/*
	Nome: Gabriel Sotero Mendonça
	Objetivo: Faça um programa que solicite a digitação e armazene 20 números reais em um vetor. Depois o programa deve
	ficar disponível para o usuário digitar o valor do índice para que seja exibido o número armazenado no índice
	solicitado. Para encerrar o programa, o usuário deve informar um índice inválido
 */
import java.util.Scanner;

public class Ex61 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numValores = 20;
		double[] valores = new double[numValores];
		for (int i = 0; i < valores.length; i++) {
			System.out.println("Digite um numero");
			valores[i] = scanner.nextDouble();
		}
		int escolhaIndice = 0;
		while (true) {
			System.out.println("Digite um indice para acessar seu valor");
			escolhaIndice = scanner.nextInt();
			if (escolhaIndice < 0 || escolhaIndice >= valores.length) {
				System.out.println("Indice invalido");
				System.out.println("Saindo");
				break;
				
			}
			System.out.println("Valor no indice " + escolhaIndice + ": " + valores[escolhaIndice]);
			System.out.println();
		}
	}

}
