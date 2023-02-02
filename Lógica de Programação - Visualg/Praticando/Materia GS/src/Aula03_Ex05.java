import java.util.Scanner;

public class Aula03_Ex05 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);

		int valor=0, opcao=0;
		double valorFinal=0;
		
		System.out.print("Valor do produto: ");
		valor = entrada.nextInt();
		
		System.out.println("Qual a forma de pagamento?");
		System.out.println("1-A vista dinheiro, 2-A vista cartão, 3-Em 2x, 4-Em 3x");
		
		opcao = entrada.nextInt();
		
		switch (opcao) {
			case 1:
				System.out.println("Opção 1 - A vista dinheiro com 10% de desconto");
				valorFinal = valor*0.9;
				System.out.print("Valor final da compra: "+valorFinal);
			break;
			case 2:
				System.out.println("Opção 2 - A vista cartão com 5% de desconto");
				valorFinal = valor*0.95;
				System.out.print("Valor final da compra: "+valorFinal);
			break;
			case 3:
				System.out.println("Opção 3 - Em 2x");
				valorFinal = valor/2;
				System.out.print("Valor final da compra: 2x de "+valorFinal);
			break;
			case 4:
				System.out.println("Opção 4 -Em 3x com juros de 10%");
				valorFinal = (valor*1.1)/3;
				System.out.print("Valor final da compra: 3x de "+valorFinal);
			break;
		}
		
	}

}
