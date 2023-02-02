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
			System.out.println("Nome do funcionário: ");
			nomes[i]=entrada.next();
			System.out.println("Tempo de serviço do "+nomes[i]+": ");
			tempoServico[i]=entrada.nextInt();
			System.out.println("Salário do "+nomes[i]+": ");
			salario[i]=entrada.nextInt();
			System.out.println();
		}
		
		String [] direito = verificaAumento(salario, tempoServico);
		
		for (int i=0; i<4; i++) {
			System.out.println("Funcionário "+nomes[i]+": "+direito[i]);
		}
	}

	// função (método com retorno)
	public static String [] verificaAumento(int salario[], int tempoServico[]) {
		String [] direito = new String [4];
		
		for (int i=0; i<4; i++) {
			if (tempoServico[i] > 3 || salario[i] < 700) {
				direito[i] = "Tem direito";
			}else {
				direito[i] = "Não tem direito";
			}			
		}
		
		return direito;
	}

}
