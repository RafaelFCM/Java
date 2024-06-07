//Aluno: Rafael Fiel Cruz Miranda
//RM94654
//Turma:1SIPF

package checkpoint;

import java.util.Scanner;

public class checkpointRM94654 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		
		double menor=1000000;
		int qtdRevVend[][] = new int[4][3];
		int somaQtdVendRev[] = new int[3];
		int somaQtdVendEst[] = new int[4];
		double valorTotVend[] = new double[3];
		String nomeRevMenorCirc[] = new String[4];
		String nomeRev[] = new String[] {"Exame","Placar","Veja"};
		String estados[] = new String[] {"RS","SC","PR","SP"};
		String estadosMeta[] = new String[] {"RS","SC","PR","SP"};
		double valorRev[] = new double[] {15.00,14.00,12.50};
		int metaVend[] = new int[] {3000,10000,10000,15000};
		
		for (int i=0; i<4; i++) {
			System.out.println("Estado "+estados[i]);
			for (int j=0; j<3; j++) {
				System.out.print("Quantidade de revistas "+nomeRev[j]+" vendidas: ");
				qtdRevVend[i][j]=entrada.nextInt();
			}
			System.out.println();
		}
		
		//soma das revistas vendidas nos 4 estados, separado por revista
		for (int j=0; j<3; j++) {
			for (int i=0; i<4; i++) {
				somaQtdVendRev[j] += qtdRevVend[i][j];
			}
		}
	
		//valor total de vendas separado por revista
		for (int j=0; j<3; j++) {
			 valorTotVend[j] = somaQtdVendRev[j] * valorRev[j];
		}
		
		//soma das revistas vendidas nos 4 estados, separado por estados
		for (int i=0; i<4; i++) {
			for (int j=0; j<3; j++) {
				somaQtdVendEst[i] += qtdRevVend[i][j];
			}
		}
		
		//A revista de menor circulação (venda), separado por estado
		//RS
		for (int i=0; i<1; i++) {
			for (int j=0; j<3; j++) {
				if (qtdRevVend[i][j]<menor) {
					menor = qtdRevVend[i][j];
					nomeRevMenorCirc[i] = nomeRev[j];
				}				
			}
		}
		menor=1000000;
		//SC
		for (int i=1; i<2; i++) {
			for (int j=0; j<3; j++) {
				if (qtdRevVend[i][j]<menor) {
					menor = qtdRevVend[i][j];
					nomeRevMenorCirc[i] = nomeRev[j];
				}				
			}
		}
		menor=1000000;
		//PR
		for (int i=2; i<3; i++) {
			for (int j=0; j<3; j++) {
				if (qtdRevVend[i][j]<menor) {
					menor = qtdRevVend[i][j];
					nomeRevMenorCirc[i] = nomeRev[j];
				}				
			}
		}
		menor=1000000;
		//SP
		for (int i=3; i<4; i++) {
			for (int j=0; j<3; j++) {
				if (qtdRevVend[i][j]<menor) {
					menor = qtdRevVend[i][j];
					nomeRevMenorCirc[i] = nomeRev[j];
				}				
			}
		}
		
		//item a)
		System.out.println("----- RELATÓRIO DE VENDAS -----");
		System.out.println("Quantidade de vendas de cada revista: ");
		for (int j=0; j<3; j++) {
			System.out.println("Revista "+nomeRev[j]+": "+somaQtdVendRev[j]);
		}
		
		System.out.println();
		
		//item b)
		System.out.println("Valor total de vendas por revista no mês: ");
		for (int j=0; j<3; j++) {
			System.out.println("Revista "+nomeRev[j]+": "+valorTotVend[j]);
		}
		
		System.out.println();
		
		//item c)
		System.out.println("Os estados que atingiram meta de vendas mensal: ");
		for (int i=0; i<4; i++) {			
			if (somaQtdVendEst[i]>=metaVend[i]) {
				System.out.println("Estado: "+estadosMeta[i]);
			}			
		}
		
		System.out.println();
		
		//item d)
		System.out.println("A revista de menor circulação por Estado: ");
		for (int i=0; i<4; i++) {			
			System.out.println("Estado "+estados[i]+": "+nomeRevMenorCirc[i]);					
		}
		
		entrada.close();
	}

}
