package aula08;

import java.util.Scanner;

public class exercicio3 {
	static Scanner entrada = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("*** rh da empresa ***");

		String nomes[] = new String[4];
		int salario[] = new int[4];
		int tempoServico[] = new int[4];
		
		for (int i=0; i<4; i++) {
			System.out.println("Nome do funcion�rio: ");
			nomes[i]=entrada.next();
			System.out.println("Tempo de servi�o do "+nomes[i]+": ");
			tempoServico[i]=entrada.nextInt();
			System.out.println("Sal�rio do "+nomes[i]+": ");
			salario[i]=entrada.nextInt();
			System.out.println();
		}
		
		String [] direito = verificaAumento(salario, tempoServico);
		
		for (int i=0; i<4; i++) {
			System.out.println("Funcion�rio "+nomes[i]+": "+direito[i]);
		}
	}

	// fun��o (m�todo com retorno)
	public static String [] verificaAumento(int salario[], int tempoServico[]) {
		String [] direito = new String [4];
		
		for (int i=0; i<4; i++) {
			if (tempoServico[i] > 3 || salario[i] < 700) {
				direito[i] = "Tem direito";
			}else {
				direito[i] = "N�o tem direito";
			}			
		}
		
		return direito;
	}

}
