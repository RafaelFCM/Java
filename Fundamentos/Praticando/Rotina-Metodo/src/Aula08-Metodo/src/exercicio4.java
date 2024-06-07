package aula08;

import java.util.Scanner;

public class exercicio4 {
	static Scanner entrada = new Scanner(System.in);
	static int codErro1 = 0, codErro2 = 0, codErro3 = 0;

	public static void main(String[] args) {
		System.out.println("Chamados realizados no Call Center da empresa ABC");

		System.out.println();
		
		int[][] infos = captacao();
		
		System.out.println();
		
		System.out.println("Relatório de chamados por erro");
		System.out.println("Número de chamados com Código do erro 1: " + codErro1);
		System.out.println("Número de chamados com Código do erro 2: " + codErro2);
		System.out.println("Número de chamados com Código do erro 3: " + codErro3);
		
		System.out.println();
		
		int [] criterio = verificarCriterio(infos);
		System.out.println("Relatório de chamados por critério");
		System.out.println("Números de chamados - Sistema parado: "+criterio[0]);
		System.out.println("Números de chamados - Grave: "+criterio[1]);
		System.out.println("Números de chamados - Não grave: "+criterio[2]);
		System.out.println("Números de chamados - Dúvidas: "+criterio[3]);
	}

	public static int [][] captacao() {
		int[][] infos = new int[5][3];

		for (int i = 0; i < 5; i++) {
			System.out.println("Funcionário " + (i + 1) + ":");

			System.out.println("Identificação do funcionário: ");
			infos[i][0] = entrada.nextInt();

			System.out.println("Código do erro: ");
			infos[i][1] = entrada.nextInt();
			while (infos[i][1] < 0 && infos[i][1] > 4) {
				System.out.println("Inválido, digite novamente! Código do erro: ");
				infos[i][1] = entrada.nextInt();
			}

			System.out.println("Critério do chamado: ");
			infos[i][2] = entrada.nextInt();
			while (infos[i][2] < 0 && infos[i][2] > 5) {
				System.out.println("Inválido, digite novamente! Critério do chamado: ");
				infos[i][2] = entrada.nextInt();
			}

			System.out.println();
		}

		return infos;

	}

	//void = sem retorno
	public static void verificarErro(int [][] infos) {
		for (int i = 0; i < 5; i++) {
			if (infos[i][1] == 1) {
				codErro1++;
			} else {
				if (infos[i][1] == 2) {
					codErro2++;
				} else {
					if (infos[i][1] == 3) {
						codErro3++;
					}
				}
			}
		}
	}

	//ATENÇÃO: não pode ser void quando é vetor
	public static int [] verificarCriterio(int [][] infos) {
		int [] criterio = new int [5];
		
		for (int i = 0; i < 5; i++) {
			if (infos[i][2] == 1) {
				criterio[i]++;
			} else {
				if (infos[i][2] == 2) {
					criterio[i]++;
				} else {
					if (infos[i][2] == 3) {
						criterio[i]++;
					} else {
						if (infos[i][2] == 4) {
							criterio[i]++;
						}
					}
				}
			}
		}
		
		return criterio;
		
	}
}

