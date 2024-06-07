import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in); 
		
		int codQnt [][]= new int[5][2];
		double [][] precTot = new double[5][2];
		double totGeral=0;
		
		for (int i=0; i < 5; i++) {
			System.out.print("Digite o código: ");
			codQnt[i][0]=entrada.nextInt();
			System.out.print("Digite a quantidade: ");
			codQnt[i][1]=entrada.nextInt();
			System.out.print("Digite o preço: ");
			precTot[i][0]=entrada.nextDouble();
			
			precTot[i][1] = codQnt[i][1]*precTot[i][0];
			totGeral += precTot[i][1];
			
			System.out.println();
		}
		for (int i=0; i < 5; i++) {
			System.out.println("Código: "+codQnt[i][0]+"      Quantidade: "+codQnt[i][1]+"    Preço: "+precTot[i][0]+"      Subtotal: "+precTot[i][1]);
		}
		System.out.println("Total geral: "+totGeral);
	}

}
