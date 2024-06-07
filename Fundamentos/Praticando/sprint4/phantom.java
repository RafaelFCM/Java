package sprint4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class phantom {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		Random aleatorio = new Random();

		int part = 0, combate = 0, cont = 0, f = 0;
		int contAnterior = 0, ultimoNumEquipe = 0;
		int i = 0, incremento = 1, fatorialCima = 1, fatorialBaixo = 1;

		System.out.println("*** ROBOCUP ***");
		System.out.println();

		// entrada n� participantes
		System.out.print("Quantas equipes est�o participando da competi��o: ");
		part = entrada.nextInt();

		// inicio condi��es para n�o haver campeonato
		if (part < 2) {
			System.out.println("Desculpa, n�o � poss�vel fazer um campeonato com menos de 2 lutadores");
			System.exit(0);
		}
		if (part > 12) {
			System.out.println("Desculpa, n�o � poss�vel fazer um campeonato com mais de 12 lutadores");
			System.exit(0);
		}
		// fim condi��es

		System.out.println();

		// OBS: fiz o c�digo com os 3 primeiros vetores, tentei fazer a classifica��o
		// manualmente, n�o deu certo. Ent�o decidi criar uma matriz que durante o
		// codigo recebe os valores dos 3 primeiros vetores criados, e a partir dessa
		// matriz classifiquei os participantes por Arrays.sort
		int numEquipe[] = new int[part];
		int notaPartida[] = new int[part];
		int notaDesign[] = new int[part];
		int ranking[][] = new int[part][3];	
	
		
		while (cont < part) {
			System.out.println("-------------- " + (cont + 1) + "� equipe: --------------");
			System.out.print("Qual o n�mero da equipe [11 a 99]: ");
			numEquipe[cont] = entrada.nextInt();
			ranking[cont][0] = numEquipe[cont];
			while (numEquipe[cont] < 11 || numEquipe[cont] > 99) {
				System.out.println();
				System.out.println("Resposta inv�lida, insira o valor novamente! ");
				System.out.print("Qual o n�mero da equipe [11 a 99]: ");
				numEquipe[cont] = entrada.nextInt();
				ranking[cont][0] = numEquipe[cont];
			}
			while (numEquipe[cont] == contAnterior) {
				System.out.println();
				System.out.println("N�mero j� escolhido, insira outro valor! ");
				System.out.print("Qual o n�mero da equipe [11 a 99]: ");
				numEquipe[cont] = entrada.nextInt();
				ranking[cont][0] = numEquipe[cont];
				while (numEquipe[cont] < 11 || numEquipe[cont] > 99) {
					System.out.println();
					System.out.println("Resposta inv�lida, insira o valor novamente! ");
					System.out.print("Qual o n�mero da equipe [11 a 99]: ");
					numEquipe[cont] = entrada.nextInt();
					ranking[cont][0] = numEquipe[cont];
				}
			}

			contAnterior = numEquipe[cont];

			// in�cio f�rmula combina��o 2 a 2, usado para achar n�mero de combates a partir
			// dos participantes
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
			// fim f�rmula

			System.out.println();

			ultimoNumEquipe = numEquipe[cont];

			fatorialCima = 1;
			fatorialBaixo = 1;
			cont++;
		}

		cont = 0;

		System.out.println("O n�mero de combates realizados � estipulado no n�mero de participantes. ");
		System.out.println("Lembrando que todos lutar�o contra todos, apenas 1 vez. ");
		System.out.print("N�mero de combates no total: " + combate);

		System.out.println();
		System.out.println();

		System.out.println(
				"Lembrando que a pontua��o � sorteada aleatoriamente pelo programa, com valores entre 0 e 10. ");
		while (cont < part) {
			while (i < (part - 1)) {
				if (numEquipe[cont] != ultimoNumEquipe) {
					System.out.println("Combate: " + numEquipe[cont] + " x " + numEquipe[cont + incremento]);
					int pontos3 = aleatorio.nextInt(10);
					System.out.println("Pontua��o do rob� " + numEquipe[cont] + " na partida: " + pontos3);
					int pontos4 = aleatorio.nextInt(10);
					System.out.println("Pontua��o do rob� " + numEquipe[cont + incremento] + " na partida: " + pontos4);
					if (pontos3 > pontos4) {
						notaPartida[cont] += 5;
						notaPartida[cont + incremento] += 0;
						ranking[cont][1] += 5;
						ranking[cont + incremento][1] += 0;
					} else {
						if (pontos3 < pontos4) {
							notaPartida[cont] += 0;
							notaPartida[cont + incremento] += 5;
							ranking[cont][1] += 0;
							ranking[cont + incremento][1] += 5;
						} else {
							if (pontos3 == pontos4) {
								notaPartida[cont] += 3;
								notaPartida[cont + incremento] += 3;
								ranking[cont][1] += 3;
								ranking[cont + incremento][1] += 3;
							}
						}
					}

					i++;
					incremento++;

				}
				if (cont == 0 && incremento == part) {
					break;
				}
				if (cont == 1 && incremento == (part - 1)) {
					break;
				}
				if (cont == 2 && incremento == (part - 2)) {
					break;
				}
				if (cont == 3 && incremento == (part - 3)) {
					break;
				}
				if (cont == 4 && incremento == (part - 4)) {
					break;
				}
				if (cont == 5 && incremento == (part - 5)) {
					break;
				}
				if (cont == 6 && incremento == (part - 6)) {
					break;
				}
				if (cont == 7 && incremento == (part - 7)) {
					break;
				}
				if (cont == 8 && incremento == (part - 8)) {
					break;
				}

				System.out.println();
			}

			i = 0;
			incremento = 1;
			cont++;

			System.out.println();
		}

		cont = 0;

		while (cont < part) {
			System.out.println("Pontos do rob� n�" + (numEquipe[cont]) + ": " + notaPartida[cont]);

			cont++;
		}

		System.out.println();
		cont = 0;

		System.out.println(
				"Lembrando que a nota de design � sorteada aleatoriamente pelo programa, com valores entre 0 e 10. ");
		while (cont < part) {
			int pontosDesign = aleatorio.nextInt(10);
			notaDesign[cont] = pontosDesign;
			ranking[cont][2] = pontosDesign;
			System.out.println("Nota do design do rob� n�" + (numEquipe[cont]) + ": " + notaDesign[cont]);

			cont++;
		}

		System.out.println();

		Arrays.sort(ranking, (a, b) -> b[2] - a[2]);
		Arrays.sort(ranking, (a, b) -> b[1] - a[1]);

		System.out.println("*** CLASSIFICA��O ***");
		for (int e = 0; e < ranking.length; e++) {
			System.out.println((e + 1) + "� colocado: equipe " + ranking[e][0] + " com " + ranking[e][1]
					+ " pontos e nota " + (ranking[e][2]) + " de design");
		}

		// zerando vetor de pontos para as finais
		for (int e = 0; e < ranking.length; e++) {
			ranking[e][1] = 0;
		}

		// condi��o que termina o codigo se n�o tiver competidores suficiente para uma
		// final
		if (part == 2) {
			System.out.println();
			System.out.println(
					"Se o n�mero de equipes no campeonato for 2, n�o haver� finais pois necess�rio ter um top3 participantes para as finais acontecerem. ");
			System.exit(0);
		}

		cont = 0;
		i = 0;
		part = 3;
		combate = 3;
		incremento = 1;

		System.out.println();

		// segunda parte do exerc�cio, a final
		System.out.println("*** FINAIS ***");
		System.out.println("Equipes finalistas: n�" + ranking[0][0] + ", n�" + ranking[1][0] + ", n�" + ranking[2][0]);
		System.out.println("N�mero de combates no total: " + combate);

		System.out.println();

		System.out.println(
				"Lembrando que a pontua��o � sorteada aleatoriamente pelo programa, com valores entre 0 e 10. ");
		while (cont < 2) {
			if (cont == 1) {
				i = 0;
			}
			while (i < (part - 1)) {
				if (numEquipe[cont] != ultimoNumEquipe) {
					System.out.println("Combate: " + ranking[cont][0] + " x " + ranking[cont + incremento][0]);
					int pontos3 = aleatorio.nextInt(10);
					System.out.println("Pontua��o do rob� " + ranking[cont][0] + " na partida: " + pontos3);
					int pontos4 = aleatorio.nextInt(10);
					System.out
							.println("Pontua��o do rob� " + ranking[cont + incremento][0] + " na partida: " + pontos4);
					// dessa vez igualei ranking com notaPartida e n�o com a propria pontua��o, pois
					// eu zerei o notaPartida acima, com o Arrays.fill
					if (pontos3 > pontos4) {
						notaPartida[cont] += 2;
						notaPartida[cont + incremento] += 0;
						ranking[cont][1] += 2;
						ranking[cont + incremento][1] += 0;
					} else {
						if (pontos3 < pontos4) {
							notaPartida[cont] += 0;
							notaPartida[cont + incremento] += 2;
							ranking[cont][1] += 0;
							ranking[cont + incremento][1] += 2;
						} else {
							if (pontos3 == pontos4) {
								notaPartida[cont] += 1;
								notaPartida[cont + incremento] += 1;
								ranking[cont][1] += 1;
								ranking[cont + incremento][1] += 1;
							}
						}
					}

					i++;
					incremento++;

				}
				if (cont == 0 && incremento == part) {
					break;
				}
				if (cont == 1 && incremento == (part - 1)) {
					break;
				}
				if (cont == 2 && incremento == (part - 2)) {
					break;
				}
				if (cont == 3 && incremento == (part - 3)) {
					break;
				}

				System.out.println();
			}

			incremento = 1;
			cont++;

			System.out.println();
		}

		System.out.println();

		cont = 0;

		while (cont < part) {
			System.out.println("Pontos do rob� n�" + (ranking[cont][0]) + ": " + ranking[cont][1]);

			cont++;
		}

		System.out.println();

		Arrays.sort(ranking, (a, b) -> b[2] - a[2]);
		Arrays.sort(ranking, (a, b) -> b[1] - a[1]);

		System.out.println("*** P�DIO ROBOCUP ***");
		for (int e = 0; e < 3; e++) {
			System.out.println((e + 1) + "� colocado: equipe " + ranking[e][0] + " com " + ranking[e][1]
					+ " pontos e nota " + (ranking[e][2]) + " de design");
		}
		System.out.println();

		System.out.println("EQUIPE VENCEDORA: " + ranking[0][0]);

		entrada.close();
	}

}