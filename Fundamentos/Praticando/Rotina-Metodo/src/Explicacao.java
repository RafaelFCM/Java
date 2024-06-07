package metodos;

import java.util.Scanner;

public class Explicacao {
	static Scanner entrada = new Scanner (System.in);

	public static void main(String[] args) {
		//main é a estrutura principal, precisa chamar os metodos
		//chamada procedimento
		verifica();
		
	}

	//procedimento
	//void = procedimento
	public static void verifica() {
		int numero=0;
		System.out.println("digite numero: ");
		numero=entrada.nextInt();
		if (numero%2==0) {
			System.out.println("par");
		}else{
			System.out.println("impar");
		}
	}
}
