package aula08;

import java.util.Scanner;

public class exercicio2 {
	static Scanner entrada = new Scanner(System.in);
	static int preco = 0, carga = 0, codCaminhao = 0;
	static double valorFinal = 0, imposto = 0, estado = 0;

	public static void main(String[] args) {
		System.out.println("Código do caminhão: ");
		codCaminhao = entrada.nextInt();
		System.out.println("Carga em toneladas: ");
		carga = entrada.nextInt();

		carga = carga();
		estado = estado();

		valorFinal = carga + carga * estado;

		System.out.println("Valor final: " + valorFinal);
	}

	// função
	public static int carga() {
		int cod = 0;

		System.out.println("Código da carga (1 a 30): ");
		cod = entrada.nextInt();
		if (cod < 11) {
			preco = 120;
		} else {
		}
		if (cod > 10 && cod < 21) {
			preco = 200;
		} else {
		}
		if (cod > 20) {
			preco = 280;
		}
		carga = carga * 1000 * preco;
		return carga;
	}

	public static double estado() {
		int resp = 0;

		System.out.println("Código do estado (1, 2, 3, 4): ");
		resp = entrada.nextInt();
		switch (resp) {
		case 1:
			imposto = 0.25;
			break;
		case 2:
			imposto = 0.2;
			break;
		case 3:
			imposto = 0.15;
			break;
		case 4:
			imposto = 0;
			break;

		}
		estado = imposto;
		return estado;
	}

}
