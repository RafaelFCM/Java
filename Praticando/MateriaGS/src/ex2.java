package estudos;

import java.util.Scanner;

public class ex2 {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		
		double [] arrayA = new double [5];
		
		for (int i=0; i<5; i++) {
			System.out.println("Digite um n�mero: ");
			arrayA[i] = entrada.nextDouble();
		}
		
		//chamada da fun��o
		arrayA = ordenaVetor(arrayA);
		
		
		//saida da fun��o
		for (int i=0; i<5; i++) {
			System.out.println(arrayA[i]);			
		}
	}
	
	//criando fun��o
	public static double [] ordenaVetor(double [] arrayA) {
		double temp=0;
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<4; j++) {
				if (arrayA[j]>arrayA[j+1]) {
					temp = arrayA[j];
					arrayA[j]=arrayA[j+1];
					arrayA[j+1]=temp;
				}
			}
		}
		
		return arrayA;
	}
	
}
