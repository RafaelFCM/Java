package estudos;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String [] nome = new String [4];
		int [] salario = new int [4];
		int []  tempo = new int [4]; 
		
		for (int i=0; i<4; i++) {
			System.out.println("Insira nome: ");
			nome[i] = entrada.next();
			
			System.out.println("Insira salário: ");
			salario[i] = entrada.nextInt();
			
			System.out.println("Insira tempo de serviço: ");
			tempo[i] = entrada.nextInt();
			
			System.out.println("");
		}
		
		String [] aumento = direitoAumento(salario, tempo);
		
		for (int i=0; i<4; i++) {
			System.out.println("Nome: "+nome[i]+" - Status promoção: "+aumento[i]);
		}
	}
	
	public static String [] direitoAumento(int [] salario, int []  tempo) {
		String [] aumento = new String[4];
		
		for (int i=0; i<4; i++) {
			if (salario[i]>700 || tempo[i]<3) {
				aumento[i] = "Sim";
			} else {
				aumento[i] = "Não";
			}
		}
		
		return aumento;
	}

}
