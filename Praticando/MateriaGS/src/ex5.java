package estudos;

import java.util.Scanner;

public class ex5 {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("***Call Center ABC***");

		System.out.println("");

		int[][] campos = captacao();

		System.out.println("");

		System.out.println("RELAT�RIO");
		for (int i = 0; i < 5; i++) {
			System.out.println("Funcion�rio " + (i + 1));
			System.out.println("Identifica��o: " + campos[i][0]);
			System.out.println("C�digo do erro: " + campos[i][1]);
			System.out.println("Crit�rio do chamado: " + campos[i][2]);
			System.out.println("");
		}

		System.out.println("");

		System.out.println("RELAT�RIO CHAMADA ERRO");

		relatorioErro(campos);

		System.out.println("");

		System.out.println("RELAT�RIO DE CHAMADOS POR CRIT�RIO");

		int[] qntCriterio = relatorioCriterio(campos);

	}

	public static int[][] captacao() {
		int[][] campos = new int[5][3];

		for (int i = 0; i < 5; i++) {
			System.out.println("Insira a identifica��o do funcion�rio: ");
			campos[i][0] = entrada.nextInt();

			System.out.println("Insira o c�digo do erro: ");
			campos[i][1] = entrada.nextInt();
			while (campos[i][1] < 1 || campos[i][1] > 3) {
				System.out.println("C�digo invalido, insira novamente!");
				System.out.println("Insira o c�digo do erro [1 at� 3]: ");
				campos[i][1] = entrada.nextInt();
			}

			System.out.println("Insira o crit�rio do chamado: ");
			campos[i][2] = entrada.nextInt();
			while (campos[i][2] < 0 || campos[i][2] > 3) {
				System.out.println("C�digo invalido, insira novamente!");
				System.out.println("Insira o crit�rio do chamado [0 at� 3]: ");
				campos[i][2] = entrada.nextInt();
			}

			System.out.println("");
		}

		return campos;
	}

	public static void relatorioErro(int[][] campos) {
		int qntErro[] = new int[3];

		for (int i = 0; i < 5; i++) {
			if (campos[i][1] == 1) {
				qntErro[0]++;
			} else if (campos[i][1] == 2) {
				qntErro[1]++;
			} else {
				qntErro[2]++;
			}
		}

		for (int i = 0; i < 3; i++) {
			System.out.println("N�meros de chamados com o C�digo do erro " + (i + 1) + ": " + qntErro[i]);
		}
	}

	public static int [] relatorioCriterio(int [][] campos) {
		int [] qntCriterio = new int [4];
		
		for (int i=0; i<5; i++) {
			if (campos[i][2]==1) {
				qntCriterio[0]++;
			} else if (campos[i][2]==2) {
				qntCriterio[1]++;
			} else if (campos[i][2]==3) {
				qntCriterio[2]++;
			} else {
				qntCriterio[3]++;
			}
		}
		
		System.out.println("N�meros de chamados - Sistemas parado: "+qntCriterio[0]);	
		System.out.println("N�meros de chamados - Grave: "+qntCriterio[1]);	
		System.out.println("N�meros de chamados - N�o Grave: "+qntCriterio[2]);	
		System.out.println("N�meros de chamados - D�vida: "+qntCriterio[3]);	
					
		return qntCriterio;
	}

}
