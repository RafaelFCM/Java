package repeticao105vez;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner (System.in);
		DecimalFormat formataPorc = new DecimalFormat ("#%");
		
		
		double pt=0, pe=0, valor=0;
		int op=0;
		
		System.out.println("Quando não tiver mais produtos para adicionar, digite 0");
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
		op=entrada.nextInt();
		while (op!=1 && op!=2 && op!=3 && op!=4) {
			System.out.println("Número inválido, digite novamente:");
			op=entrada.nextInt();
		}
		
		switch (op) {
		case 1:
			valor=pt*=0.9;
		break;
		case 2:
			valor=pt*0.95;
		break;
		case 3:
			valor=pt/2;
		break;
		case 4:
			valor=(pt*1.1)/3;
		break;
		
		}
		
		System.out.println("Valor a pagar: "+valor);

	}

}
