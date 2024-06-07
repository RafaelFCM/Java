package phantom;

import java.util.Scanner;

public class phantom {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		int part = 0, combate = 0, cont = 0, i = 0, j = 1, f = 0, aux = 0, auxNumEquipe = 0, auxNotaDesign = 0,
				contAnterior = 0, indexResPartida = 0;

		System.out.println("*** Ranking das equipes participantes da RoboCup ***");
		System.out.println();

		System.out.print("Quantas equipes estão participando da competição: ");
		part = entrada.nextInt();
		while (part < 2) {
			System.out.println();
			System.out.println("Resposta inválida, insira o valor novamente! ");
			System.out.print("Quantas equipes estão participando da competição: ");
			part = entrada.nextInt();
		}

		indexResPartida = part + 1;
		System.out.println();

		int numEquipe[] = new int[part];
		int notaDesign[] = new int[part];
		String resPartida[] = new String[indexResPartida];
		int notaPartida[] = new int[part];
		int fatorialCima = 1, fatorialBaixo = 1;

		while (cont < part) {
			System.out.println("-------------- " + (cont + 1) + "º equipe: --------------");
			System.out.print("Qual o número da equipe[números válidos: 11 a 99]: ");
			numEquipe[cont] = entrada.nextInt();
			while (numEquipe[cont] < 11 || numEquipe[cont] > 99) {
				System.out.println();
				System.out.println("Resposta inválida, insira o valor novamente! ");
				System.out.print("Qual o número da equipe[números válidos: 11 a 99]: ");
				numEquipe[cont] = entrada.nextInt();
			}
			while (numEquipe[cont] == contAnterior) {
				System.out.println();
				System.out.println("Número já escolhido, insira outro valor! ");
				System.out.print("Qual o número da equipe[números válidos: 11 a 99]: ");
				numEquipe[cont] = entrada.nextInt();
				while (numEquipe[cont] < 11 || numEquipe[cont] > 99) {
					System.out.println();
					System.out.println("Resposta inválida, insira o valor novamente! ");
					System.out.print("Qual o número da equipe[números válidos: 11 a 99]: ");
					numEquipe[cont] = entrada.nextInt();
				}
			}

			contAnterior = numEquipe[cont];

			System.out.println();

			System.out.println("O número de combates realizados é estipulado no número de participantes ");
			System.out.println("Lembrando que todos lutaram contra todos, apenas 1 vez");
			f = part;
			while (f > 1) {
				fatorialCima *= f;
				f--;
			}
			f = part - 2;
			while (f > 1) {
				fatorialBaixo *= f;
				f--;
			}
			combate = fatorialCima / (2 * fatorialBaixo);
			if (part == 2) {
				combate = 1;
			}
			System.out.print("Número de combates no total: " + combate);

			System.out.println();
			System.out.println();

			while (i < combate) {
				System.out.print("Resultado partida[V-Vitória, D-Derrota, E-Empate]: ");
				resPartida[cont] = entrada.next();

				while (!(resPartida[cont].equalsIgnoreCase("V") || resPartida[cont].equalsIgnoreCase("D")
						|| resPartida[cont].equalsIgnoreCase("E"))) {
					System.out.println();
					System.out.println("Resposta inválida, insira o valor novamente! ");
					System.out.print("Resultado partida[V-Vitória, D-Derrota, E-Empate]: ");
					resPartida[cont] = entrada.next();
				}

				if (resPartida[cont].equalsIgnoreCase("V")) {
					notaPartida[cont] += 5;
				} else {
					if (resPartida[cont].equalsIgnoreCase("D")) {
						notaPartida[cont] += 0;
					} else {
						if (resPartida[cont].equalsIgnoreCase("E")) {
							notaPartida[cont] += 3;
						}
					}
				}
				i++;
			}

			System.out.print("Qual nota do design do robô[0 a 10]: ");
			notaDesign[cont] = entrada.nextInt();
			while (notaDesign[cont] > 10 || notaDesign[cont] < 0) {
				System.out.println();
				System.out.println("Resposta inválida, insira o valor novamente! ");
				System.out.print("Qual nota do design do robô[0 a 10]: ");
				notaDesign[cont] = entrada.nextInt();
			}

			cont++;
			combate = 0;
			i = 0;
			fatorialCima = 1;
			fatorialBaixo = 1;
			System.out.println();
			System.out.println("-----------------------------------------");
			System.out.println();
		}

		cont = 0;

		for (int c = 0; c < (part - 1); c++) {
			for (int r = 1; r < (indexResPartida - 1); r++) {
				if (notaPartida[c] < notaPartida[r]) {
					aux = notaPartida[c];
					notaPartida[c] = notaPartida[r];
					notaPartida[r] = aux;

					auxNumEquipe = numEquipe[c];
					numEquipe[c] = numEquipe[r];
					numEquipe[r] = auxNumEquipe;
				}
			}
		}

		for (int c = 0; c < (part - 1); c++) {
			for (int r = 1; r < (indexResPartida - 1); r++) {
				if (notaPartida[c] == notaPartida[r]) {
					if (notaDesign[c] < notaDesign[r]) {
						aux = notaPartida[c];
						notaPartida[c] = notaPartida[r];
						notaPartida[r] = aux;

						auxNumEquipe = numEquipe[c];
						numEquipe[c] = numEquipe[r];
						numEquipe[r] = auxNumEquipe;

						auxNotaDesign = notaDesign[c];
						notaDesign[c] = notaDesign[r];
						notaDesign[r] = auxNotaDesign;
					} else {
						if (notaDesign[c] > notaDesign[r]) {
							aux = notaPartida[r];
							notaPartida[r] = notaPartida[c];
							notaPartida[c] = aux;

							auxNumEquipe = numEquipe[r];
							numEquipe[r] = numEquipe[c];
							numEquipe[c] = auxNumEquipe;

							auxNotaDesign = notaDesign[r];
							notaDesign[r] = notaDesign[c];
							notaDesign[c] = auxNotaDesign;
						}
					}
				}
			}
		}

		System.out.println();

		System.out.println("*** CLASSIFICAÇÃO RoboCup ***");
		while (cont < part) {
			System.out.println(j + "º colocado: equipe nº" + numEquipe[cont] + " com " + notaPartida[cont]
					+ " pontos e nota " + notaDesign[cont] + " de design");
			j++;
			cont++;
		}

	}

}
