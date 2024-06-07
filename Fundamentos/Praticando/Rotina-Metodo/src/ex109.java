package aula09;

import java.util.Scanner;

public class ex109 {
	static Scanner entrada = new Scanner (System.in);
	static int codErro1=0, codErro2=0, codErro3=0;
	
	public static void main(String[] args) {
		
		System.out.println("Chamados realizados no Call Center da empresa ABC");
		
		int [][] infos = captacao(); 
		int [] codErro = codErro (infos);
		relatorio();
	}

	public static int [][] captacao() {
		int [][] infos = new int [5][3];
		
		for (int i=0; i<5; i++) {
			System.out.println("Funcionário "+(i+1)+":");
			for (int j=0; j<3; j++) {
				if (j==0) {
					System.out.println("Identificação do funcionário: ");					
					infos[i][j]=entrada.nextInt();
				}else {
					if (j==1) {
						System.out.println("Código do erro: ");		
						infos[i][j]=entrada.nextInt();
						while (infos[i][j]<0 && infos[i][j]>4) {
							System.out.println("Inválido, digite novamente! Código do erro: ");		
							infos[i][j]=entrada.nextInt();							
						}
					}else {
						System.out.println("Critério do chamado: ");						
						infos[i][j]=entrada.nextInt();
						while (infos[i][j]<0 && infos[i][j]>5) {
							System.out.println("Inválido, digite novamente! Critério do chamado: ");		
							infos[i][j]=entrada.nextInt();							
						}
					}
				}
			}
		}	
		
		 return infos;
		 
	}
	
	public static void verificarErro(int [][] infos) {
		int [] verificarErro = new int [5];
		
		if (j==0) {
			codErro1++;
		}else {
			if (j==1) {
				codErro2++;
			}else {
				codErro3++;					
				}
			}
	
		System.out.println("Relatório de chamados por erro");
			for (int j=0; j<3; j++) {
				System.out.println("Número de chamados com Código do erro "+(j+1)+": "+codErro[j]);
			}
			
	}
	
	public static [] int criterio(int [] infos) {
		int [] criterio = new int [5];
		
		System.out.println("Relatório de chamados por critério");
		
		
	}
}

//ATENÇÃO: não pode ser void quando é array