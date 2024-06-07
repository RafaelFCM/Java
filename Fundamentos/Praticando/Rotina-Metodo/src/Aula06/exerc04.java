import java.text.DecimalFormat;
import java.util.Scanner;

public class exerc04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat numMoeda = new DecimalFormat("R$ #,##0.00");
		
		String produtos[] =  {"A","B","C","D","E","F","G","H","I","J","K","L"};
		String lojas[] =  {"V","W","X","Y","Z"};
		double precos[][]= new double[12][5];
		double maior=0, menor=1000;
		String lojaMaior = new String();
		String lojaMenor = new String();
		String prodMaior = new String();
		String prodMenor = new String();
		

		System.out.println("------------------- Preço dos produtos por loja ------------------");
		for (int i=0; i<12; i++) {
			System.out.println("----- Produto: "+produtos[i]+" -----");
			for (int j=0; j<5; j++) {
				System.out.print("Loja: "+lojas[j]);
				precos[i][j]=(double) (Math.random()*190);
				System.out.println("      Preço: "+precos[i][j]);
			}
			System.out.println();
		}
		
		for (int i=0; i<12; i++) {			
			for (int j=0; j<5; j++) {
				if (precos[i][j]>maior) {
					maior=precos[i][j];
					prodMaior=produtos[i];
					lojaMaior=lojas[j];
				}
				
				if (precos[i][j]<menor) {
					menor=precos[i][j];
					prodMenor=produtos[i];
					lojaMenor=lojas[j];
				}
			}
		}
		
		System.out.println();
		
		System.out.println("------------------------------------");
		System.out.println();
		System.out.print("Produto mais barato: "+prodMenor);
		System.out.print("     Loja: "+lojaMenor);
		System.out.println("    Preço: "+menor);
		System.out.println();
		System.out.print("Produto mais caro: "+prodMaior);
		System.out.print("     Loja: "+lojaMaior);
		System.out.println("    Preço: "+maior);
		
	}

}
