import java.util.Scanner;

public class Aula03_Ex06 {

	public static void main(String[] args) {

		Scanner entrada = new Scanner (System.in);
		
		int preco=0, venda=0;
		double novoPreco=0;
		
		System.out.println("Qual o pre�o atual do produto?");
		preco = entrada.nextInt();
		System.out.println("Quanto � a venda m�dia mensal do produto?");
		venda = entrada.nextInt();
		
		if (venda<500 || preco<30) {
			novoPreco = preco*1.1;
		}else {
			if (venda<1200 || preco<80) {
				novoPreco = preco*1.15;
			}else {
				if (venda>=1200 || preco>=80) {
					novoPreco = preco*0.8;
				}
			}
		}
		
		System.out.println("Novo pre�o do produto: "+novoPreco);
	}

}
