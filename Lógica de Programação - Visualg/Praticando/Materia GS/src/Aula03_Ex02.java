import java.util.Scanner;

public class Aula03_Ex02 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		char tipo;
		int valor=0;
		double valorCorrigido=0;
		
		System.out.println("Qual valor deseja investir?");
		valor = entrada.nextInt();
		
		System.out.println("Qual o tipo de investimento quer fazer?");
		System.out.println("P-Poupança, F-Fundo de Renda Fixa, C-CDB, A-Ações");
		System.out.print("Opção:");
		tipo = entrada.next().toUpperCase().charAt(0);
		
		if (tipo=='P') {
			valorCorrigido = valor*1.03;
		}else {
			if (tipo=='F') {
				valorCorrigido = valor*1.05;
			}else {
				if (tipo=='C') {
					valorCorrigido = valor*1.06;
				}else {
					if (tipo=='A') {
						valorCorrigido = valor*1.1;
					}
				}
			}
		}
		
		System.out.println("Baseado no valor investido ("+valor+") e no tipo de investimento escolhido ("+tipo+") o valor final fica em "+valorCorrigido);
		
		
	}

}
