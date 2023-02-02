package aula09;

import java.util.Scanner;

public class ex209 {
	static Scanner entrada = new Scanner (System.in);
	static double aux=0;
	
	public static void main(String[] args) {
		double [] num = carregarVetor();
		num = ordemVetor(num);

		for (int i=0; i<5; i++) {
			System.out.println(num[i]);
		}
	}

	public static double [] carregarVetor() {
		double [] num = new double [5];
		
		for (int i=0; i<5; i++) {
			System.out.println("Digite o número: ");
			num[i]=entrada.nextDouble();
		}
		
		return num;
	}
	
	public static double [] ordemVetor(double [] num) {
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<4; j++) {
				if (num[j]>num[j+1]) {
					aux = num[j];
					num[j]=num[j+1];
					num[j+1]=aux;
				}
			}
		}
		
		return num;
		
	}
}
