package exerc05;

import java.util.Scanner;

public class exerc06 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in); 
		
		String produtos[]= new String [] {"Camisa","Blusa","Calça","Vestido","Meia"};
		double precos [][]= new double [5][4];
		double custoTransp []= new double [] {10,15,20,10,5};
		double impostos [][]= new double [5][4];
		double precoFinal [][]= new double [5][4];
		

		for (int i=0; i<5; i++) {
			System.out.println("Informe o preço do produto: "+produtos[i]);
			for (int j=0; j<4; j++) {
				System.out.print("Preço do produto na loja "+(j+1)+": ");
				precos[i][j]=entrada.nextDouble();
				
				if (precos[i][j]>100) {
					impostos[i][j] = precos[i][j] * 0.2;
				}else {
					if (precos[i][j]>50) {
						impostos[i][j] = precos[i][j] * 0.1;
					}else {
						impostos[i][j] = precos[i][j] * 0.05;
					}
				}
				
				precoFinal[i][j] = precos[i][j] + custoTransp[i] + impostos[i][j];
				
			}
		}
		
		System.out.println();
		
		for (int i=0; i<5; i++) {
			System.out.println("-----------------------------------------------------------------------");
			System.out.println("Nome do produto: "+produtos[i]+" Custo de transporte: "+custoTransp[i]);
			for (int j=0; j<4; j++) {
				System.out.println("------- Loja: "+(j+1)+" ------");
				System.out.println("Imposto = R$ "+impostos[i][j]);
				System.out.println("Preço = R$ "+precos[i][j]);
				System.out.println("Preço final = R$ "+precoFinal[i][j]);
			}	
		}
		System.out.println("-----------------------------------------------------------------------");
		
		
		
		
		
		
		
		
	}

}
