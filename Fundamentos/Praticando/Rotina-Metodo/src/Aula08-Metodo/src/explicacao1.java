package aula08;

import java.util.Scanner;

public class explicacao1 {
	static Scanner entrada = new Scanner (System.in);
	// método não pode devolver duas informações
	static int somaMatriz=0, somaLinha=0, mostrarSoma=0;
	

	public static void main(String[] args) {

		int [][] pedidos = carregarMatriz();
		System.out.println("Soma Matriz: "+somaMatriz);
		int [] somaLinha = somaLinha (pedidos);
		mostrarSoma(somaLinha);
	}

	public static int [][] carregarMatriz() {
		int [][] pedidos = new int [3][3];
		
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.println("Digite o número: ");
				pedidos[i][j]=entrada.nextInt();
				somaMatriz += pedidos[i][j];
			}
		}
		//chamando o parametro abaixo, nos parenteses precisa aparecer o nome da variavel
		mostrarMatriz(pedidos);
		return pedidos;
		//retornando o valor da função
	}
	
	//passando a matriz como parametro
	public static void mostrarMatriz(int [][] pedidos) {
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				System.out.print(pedidos[i][j]+"\t");
			}
			System.out.println();
		}
	}
	
	public static int [] somaLinha(int [][] pedidos) {
		int [] somaLinha = new int [3];
		
		for (int i=0; i<3; i++) {
			for (int j=0; j<3; j++) {
				somaLinha[i] += pedidos[i][j];
			}
		}
		
		return somaLinha;
	}
	
	public static void mostrarSoma(int somaLinha[]) {
		
		for (int i=0; i<3; i++) {
			System.out.println("Soma linha "+(i+1)+": "+somaLinha[i]);
		}
	}
}
