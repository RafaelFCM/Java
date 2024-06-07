import java.text.DecimalFormat;
import java.util.Scanner;

public class exerc03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat numMoeda = new DecimalFormat("R$ #,##0.00");
		
		String lojas[] =  {"A","B","C","D","E","F","G","H"};
		String produtos[] =  {"W","X","Y","Z"};
		double precos[][]= new double[4][8];

		System.out.println("------------------- Preço dos produtos por loja ------------------");
		for (int i=0; i<4; i++) {
			System.out.println("Produto: "+produtos[i]);
			for (int j=0; j<8; j++) {
				System.out.print("Loja: "+lojas[j]);
				//precos[i][j]=entrada.nextDouble();
				precos[i][j]=(double) (Math.random()*190);
				System.out.println("      Preço: "+precos[i][j]);
			}
			System.out.println();
		}
		
		for (int i=0; i<4; i++) {			 
			for (int j=0; j<8; j++) {				 
				 System.out.println(numMoeda.format(precos[i][j])+"\t\t\t\t");
			}
			System.out.println();
		}
		
		System.out.println("------------------- Produtos que custam menos de R$ 120 ------------------");
		for (int i=0; i<4; i++) {
			System.out.println("Produto: "+produtos[i]);
			for (int j=0; j<8; j++) {
				if (precos[i][j]<120) {
					System.out.print("Loja: "+lojas[j]);
					System.out.println("      Preço: "+numMoeda.format(precos[i][j]));
				}
				
			}
			System.out.println();
		}
	}

}
