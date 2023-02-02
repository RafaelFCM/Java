package aula08;

import java.util.Scanner;

public class exercicio1 {
	static Scanner entrada = new Scanner(System.in);
	static String nome;
	static int acomodacao = 0, diarias = 0, valorDiaria = 0, estadia = 0;
	static double valorFinal = 0;

	public static void main(String[] args) {
		System.out.println("Nome do hóspede: ");
		nome = entrada.next();
		System.out.println("Tipo de acomodação (1 - Standard, 2 - Luxo e 3 – Super Luxo): ");
		acomodacao = entrada.nextInt();
		System.out.println("Quantas diárias: ");
		diarias = entrada.nextInt();

		estadia = estadia();
	}

	// função
	public static int estadia() {
		if (acomodacao == 1) {
			valorDiaria = 380;
		} else {
			if (acomodacao == 2) {
				valorDiaria = 450;
			} else {
				if (acomodacao == 3) {
					valorDiaria = 560;
				}
			}
		}
		pagamento();
		return valorDiaria;
	}

	// procedimento
	public static void pagamento() {
		String resp;

		System.out.println("Forma de pagamento (V - Vista, P - Prazo): ");
		resp = entrada.next();
		if (resp.equalsIgnoreCase("V")) {
			valorFinal = (diarias * valorDiaria) * 0.9;
			System.out.println("Valor final: " + valorFinal);
		} else {
			if (resp.equalsIgnoreCase("P")) {
				valorFinal = (diarias * valorDiaria);
				System.out.println("Valor final: " + valorFinal);
			}
		}
	}

}
