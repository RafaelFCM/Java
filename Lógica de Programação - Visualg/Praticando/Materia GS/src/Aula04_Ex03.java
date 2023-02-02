import java.text.DecimalFormat;
import java.util.Scanner;

public class Aula04_Ex03 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		DecimalFormat porc = new DecimalFormat ("#%");
		
		int resp=0, canal=0, pessoas=0, canal4=0, canal5=0, canal7=0, canal12=0, soma=0;
		double porc4=0, porc5=0, porc7=0, porc12=0;
		
		do {
			System.out.print("Digite o número do canal (4,5,7,12)");
			canal = entrada.nextInt();
			switch (canal) {
				case 4:
					System.out.print("Digite o número de pessoas que estavam assistindo?");
					pessoas = entrada.nextInt();
					canal4 += pessoas;
				break;
				case 5:
					System.out.print("Digite o número de pessoas que estavam assistindo?");
					pessoas = entrada.nextInt();
					canal5 += pessoas;
				break;
				case 7:
					System.out.print("Digite o número de pessoas que estavam assistindo?");
					pessoas = entrada.nextInt();
					canal7 += pessoas;
				break;
				case 12:
					System.out.print("Digite o número de pessoas que estavam assistindo?");
					pessoas = entrada.nextInt();
					canal12 += pessoas;
				break;
			}
			soma += pessoas;
			System.out.println("Deseja adicionar outra casa? 0-Não 1-Sim");
			resp = entrada.nextInt();
		}while (resp!=0);
	
		
		porc4=(double)canal4/soma;
		porc5=(double)canal5/soma;
		porc7=(double)canal7/soma;
		porc12=(double)canal12/soma;
		
		System.out.println("Canal 4:"+porc4);
		System.out.println("Canal 5:"+porc5);
		System.out.println("Canal 7:"+porc7);
		System.out.println("Canal 12:"+porc12);
		
	}

}
