import java.util.Scanner;

public class exerc01 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in); 
		
		int codQnt [][]= new int[4][2];
		int catMil [][]= new int[4][2];
		int bonus=0;
		
		for (int i=0; i < 4; i++) {
			System.out.print("Digite o código do cliente: ");
			codQnt[i][0]=entrada.nextInt();
			System.out.print("Digite a quantidade de milhagem: ");
			codQnt[i][1]=entrada.nextInt();
			System.out.print("Digite a sua categoria: [1-Diamante; 2-Ouro; 3-Prata]");
			catMil[i][0]=entrada.nextInt();
			if (catMil[i][0]!=1 && catMil[i][0]!=2 && catMil[i][0]!=3) {
				System.out.println("Categoria inválida. Digite novamente!");
				System.out.print("Digite a sua categoria: [1-Diamante; 2-Ouro; 3-Prata]");
				catMil[i][0]=entrada.nextInt();
			}
			if (catMil[i][0]==1) {
				bonus=10000;
			}else{
				if (catMil[i][0]==2) {
					bonus=5000;
			}else{
				if (catMil[i][0]==3) {
					bonus=0;
			}
			}
			}
			catMil[i][1] = codQnt[i][1] + bonus;
		}
		for (int i=0; i < 4; i++) {
			System.out.println("Código: "+codQnt[i][0]+"      Quantidade: "+codQnt[i][1]+"    Categoria: "+catMil[i][0]+"      Bonus: "+(catMil[i][1]-codQnt[i][1])+"     Milhagem Atual: "+catMil[i][1]);
		}
}
}
