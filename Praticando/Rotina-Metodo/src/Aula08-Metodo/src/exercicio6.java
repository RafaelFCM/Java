package aula08;

import java.util.Scanner;

public class exercicio6 {
    static Scanner entrada = new Scanner (System.in);
    static int somaMatriz=0;
    static String [] maiorMenor = new String [2];
    static String [] nomeMaiorVendaRegiao = new String [5];
	
	public static void main(String[] args) {
		System.out.println("***NATURA***");
		String [] produtos = new String [] {"Perfumaria", "Maquiagem", "Cabelo", "Rosto"};
		String [] regioes = new String [] {"Sul", "Sudeste", "Centro Oeste", "Norte", "Nordeste"};
		
		int [][] valores = carregarMatriz(produtos, regioes);
		
		System.out.println();
		
		System.out.println("Soma da matriz: "+somaMatriz);
		
		System.out.println();
		
		int [] somaProdutos = vendasColuna(valores);
		for (int j=0; j<4; j++) {
			System.out.println("Soma do produto "+produtos[j]+": "+somaProdutos[j]);
		}
		
		System.out.println();
		
		vendaRegiao(regioes, produtos, valores);
		System.out.println("Maiores vendas por regiões: ");
		for (int i=0; i<5; i++) {
			System.out.print(regioes[i]+": ");
			System.out.println(nomeMaiorVendaRegiao[i]);
		}
		
		System.out.println();
		
		String [] maiorMenor = maiorMenor(produtos, somaProdutos);
		System.out.println("Produto com maior venda: "+maiorMenor[0]);
		System.out.println("Produto com menor venda: "+maiorMenor[1]);
	}
	
	public static int [][] carregarMatriz(String [] produtos, String [] regioes) {
		int [][] valores = new int [5][4];
		
		for (int i=0; i<5; i++) {
			System.out.println("Na região "+regioes[i]+": ");
			for (int j=0; j<4; j++) {
				System.out.print("Produto de "+produtos[j]+" custa: ");
				valores[i][j]=entrada.nextInt();
				
				somaMatriz+=valores[i][j];
			}
			System.out.println();
		}
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<4; j++) {
				System.out.print(valores[i][j]+"\t");
			}
			System.out.println();
		}
		
		return valores;
	}
	
	public static int [] vendasColuna(int [][] valores) {
		int [] somaProdutos = new int [4];  
		
		for (int j=0; j<4; j++) {
			for (int i=0; i<5; i++) {
				somaProdutos[j] += valores[i][j];
			}
		}
		
		return somaProdutos;
	}
	
	public static void vendaRegiao(String [] regioes, String [] produtos, int [][] valores) {
		int maiorVendaRegiao=0;
		
		for (int i=0; i<5; i++) {
			for (int j=0; j<4; j++) {
				if (valores[i][j] > maiorVendaRegiao) {
					maiorVendaRegiao = valores[i][j];
					nomeMaiorVendaRegiao[i] = produtos[j];
				}
			}
			maiorVendaRegiao=0;
		}
	}
	
	public static String [] maiorMenor(String [] produtos, int [] somaProdutos) {
		int maior=0, menor=100000;
		
		for (int i=0; i<4; i++) {
			if (somaProdutos[i] > maior) {
				maior = somaProdutos[i];
				maiorMenor[0] = produtos[i];
			}
			if (somaProdutos[i] < menor) {
				menor = somaProdutos[i];
				maiorMenor[1] = produtos[i];
			}
		}
		
		return maiorMenor;
	}	
}
