package repeticao;
import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio09 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		DecimalFormat formataPorc = new DecimalFormat ("#%");
		
		
		double pt=0, pe=0, valorFinal=0;
		int pag=0;
		
		System.out.println("Qual o preço da etiqueta: ");
		pe=entrada.nextInt();
		while (pe!=0) {
			pt+=pe;
			System.out.println("Qual o preço da etiqueta: ");
			pe=entrada.nextInt();
		}
		
		System.out.println("Preço total da compra:"+pt);
		System.out.println("Qual forma de pagamento:");
		System.out.println("1-À vista em dinheiro ou cheque, 2-À vista com cartão de crédito, 3-Cartão em 2 vezes, 4-Cartão em 3 vezes");
		while (op!='A' && op!='B' && op!='C' && op!='D' && op!='E') {
			System.out.println("Letra invalida, digite novamente:");
			op=entrada.next().toUpperCase().charAt(0);
	}
		pag=entrada.nextInt();
		
		switch (pag) {
		case 1:
			valorFinal=pag*=0,9;
		break;
		case 2:
			valorFinal=pag*0,95;
		break;
		case 3:
			valorFinal=pag/2;
		break;
		case 4:
			valorFinal=(pag*1,1)/3;
		break;
		
		}
		
		
		
		
	}		
}
