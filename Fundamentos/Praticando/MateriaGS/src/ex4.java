package estudos;

import java.util.Scanner;

public class ex4 {
	static Scanner entrada = new Scanner(System.in);

	public static void main(String[] args) {
		int codCaminhao = 0;
		double carga = 0;
		double precoFinal = 0;
		double imposto=0;

		System.out.println("***Transportadora Express***");

		System.out.println("Insira código caminhão: ");
		codCaminhao = entrada.nextInt();

		System.out.println("");

		System.out.println("Insira peso do caminhão em toneladas: ");
		carga = entrada.nextDouble();

		System.out.println("");
		
		
		precoFinal = precoCarga(carga);
		
		System.out.println("");
		
		imposto = imposto();
		
		System.out.println("");
		
		System.out.println("Valor total do transporte: "+(precoFinal+precoFinal*imposto));
	}

	public static double precoCarga(double carga) {
		int codCarga = 0;
		double precoFinal = 0;

		System.out.println("Insira código da carga [1 até 30]: ");
		codCarga = entrada.nextInt();	
		while (codCarga<1 || codCarga>30) {
			System.out.println("Código invalido, insira novamente!");
			System.out.println("Insira código da carga [1 até 30]: ");
			codCarga = entrada.nextInt();			
		}
		
		if (codCarga>0 && codCarga<11) {
			precoFinal = carga * 1000 * 120;
		} else if (codCarga>10 && codCarga<21) {
			precoFinal = carga * 1000 * 200;
		} else {
			precoFinal = carga * 1000 * 280;
		}
		
		return precoFinal;
	}
	
	public static double imposto() {
		int codEstado=0;
		double imposto=0;
		
		System.out.println("Insira código do estado [1 até 4]: ");
		codEstado = entrada.nextInt();	
		while (codEstado<1 || codEstado>4) {
			System.out.println("Código invalido, insira novamente!");
			System.out.println("Insira código do estado [1 até 4]: ");
			codEstado = entrada.nextInt();			
		}
		
		if (codEstado==1) {
			imposto = 0.25;
		} else if (codEstado==2) {
			imposto = 0.2;
		} else if (codEstado==3){
			imposto = 0.15;
		} else {
			imposto=0;
		}
		
		return imposto;
	}
	
	
}
