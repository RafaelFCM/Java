package votacao;

import java.util.Scanner;

public class Votacao {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in); 
		
		int idade=0;
		
		for (int i=0; i<4; i++) {
			System.out.println("Quantos anos você tem?");
			System.out.print("R: ");
			idade=entrada.nextInt();
			
			System.out.println();
			
			System.out.println("Posso votar?");
			if (idade>17 && idade<70) {
				System.out.println("Obrigatório votar");
			}else{
				if (idade==17 || idade==16) {
					System.out.println("Opcional votar");
				}else{
					if (idade>69) {
						System.out.println("Opcional votar");
					}else {
						if (idade<16) {
							System.out.println("Não pode votar");
						}
					}
				}
			}
			System.out.println();
		}
	}
}

