import java.util.Scanner;

public class Aula03_Ex04 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int diarias=0;
		double valor=0;
		String nome;

		System.out.print("Nome do cliente: ");
		nome = entrada.next();
		
		System.out.println("Quantas diárias ficou?");
		diarias = entrada.nextInt();
		
		if (diarias>15) {
			valor = 80+5.5;
		}else {
			if (diarias==15) {
				valor = 80+6;
			}else {
				if (diarias<15) {
					valor = 80+8;
				}
			}
		}
		
		System.out.print("Nome do cliente: "+nome);
		System.out.println();
		System.out.print("Conta: "+valor);
	}

}
