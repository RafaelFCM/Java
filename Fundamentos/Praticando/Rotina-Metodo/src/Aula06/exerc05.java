package exerc05;

import java.util.Scanner;

public class exerc05 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in); 
		
		int priSem [][]= new int[5][3];
		int segSem [][]= new int[5][3];
		int anual [][]= new int[5][3];
		int somaMat [][]= new int[5][3];
		int somaban [][]= new int[5][3];
		double maior=0, somaUni1=0, somaUni2=0, somaUni3=0, somaCurso1=0, somaCurso2=0, somaCurso3=0, somaCurso4=0, somaCurso5=0;
		
		System.out.println("---------------------------- 1º SEMESTRE -----------------------------");
		for (int i=0; i<5; i++) {
			for (int j=0; j<3; j++) {
				System.out.print("Digite o número de inscritos 1º semestre do curso "+(++i)+" na unidade "+(++j)+":");
				priSem[i][j]=entrada.nextInt();
			}
		}
		
		System.out.println();
		System.out.println();
		
		System.out.println("--------------------------- 2º SEMESTRE ---------------------------");
		for (int i=0; i<5; i++) {
			for (int j=0; j<3; j++) {
				System.out.print("Digite o número de inscritos 2º semestre do curso "+(++i)+" na unidade "+(++j)+":");
				segSem[i][j]=entrada.nextInt();
			}
		}
		
		System.out.println();
		System.out.println();
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<3; j++) {
				somaMat[i][j] = priSem[i][j] + segSem[i][j];
			}
		}
		
		
		System.out.println("------------------- QUANTIDADE ALUNOS POR CURSO E UNIDADE NO ANO ------------------");
		for (int i=0; i<5; i++) {
			System.out.println("Curso:"+(++i));
			for (int j=0; j<3; j++) {
				System.out.print("Quantidade de matriculas unidade "+(++j)+":"+somaMat[i][j]);
			}
		}
		
		System.out.println();
		System.out.println();
		
		for (int j=0; j<1; j++) {
			for (int i=0; i<5; i++) {
				somaUni1 += somaMat[i][j]; 
			}
		}
		for (int j=1; j<2; j++) {
			for (int i=0; i<5; i++) {
				somaUni2 += somaMat[i][j]; 
			}
		}
		for (int j=2; j<3; j++) {
			for (int i=0; i<5; i++) {
				somaUni3 += somaMat[i][j]; 
			}
		}
		
		System.out.println("--------------------- QUANTIDADE DE MATRÍCULAS POR UNIDADE -------------------");
		System.out.println("Quantidade de matriculas por unidade 1:"+somaUni1);
		System.out.println("Quantidade de matriculas por unidade 2:"+somaUni2);
		System.out.println("Quantidade de matriculas por unidade 3:"+somaUni3);
		
		System.out.println();
		System.out.println();
		
		for (int i=0; i<1; i++) {
			for (int j=0; j<3; j++) {
				somaCurso1 += somaMat[i][j]; 
			}
		}
		for (int i=1; i<2; i++) {
			for (int j=0; j<3; j++) {
				somaCurso1 += somaMat[i][j]; 
			}
		}
		for (int i=2; i<3; i++) {
			for (int j=0; j<3; j++) {
				somaCurso1 += somaMat[i][j]; 
			}
		}
		for (int i=3; i<4; i++) {
			for (int j=0; j<3; j++) {
				somaCurso1 += somaMat[i][j]; 
			}
		}
		for (int i=4; i<5; i++) {
			for (int j=0; j<3; j++) {
				somaCurso1 += somaMat[i][j]; 
			}
		}
		
		System.out.println("--------------------- QUANTIDADE DE MATRÍCULAS POR CURSO -------------------");
		System.out.println("Quantidade de matriculas por curso 1:"+somaCurso1);
		System.out.println("Quantidade de matriculas por curso 2:"+somaCurso2);
		System.out.println("Quantidade de matriculas por curso 3:"+somaCurso3);
		System.out.println("Quantidade de matriculas por curso 4:"+somaCurso4);
		System.out.println("Quantidade de matriculas por curso 5:"+somaCurso5);
		
		System.out.println();
		System.out.println();
		
		if (somaCurso1>maior) {
			maior = somaCurso1;
		}
		if (somaCurso2>maior) {
			maior = somaCurso2;
		}
		if (somaCurso3>maior) {
			maior = somaCurso3;
		}
		if (somaCurso4>maior) {
			maior = somaCurso4;
		}
		if (somaCurso5>maior) {
			maior = somaCurso5;
		}
		
		System.out.println("-------------------------- MAIOR NÚMERO DE MATRÍCULAS -----------------------");
		System.out.print("Maior número de matriculas: "+maior);
				
	}

}
