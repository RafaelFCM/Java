package metodos;

import java.util.Scanner;

public class Explicacao2 {
	static Scanner entrada = new Scanner (System.in);
	static double num1=0, num2=0, resultado=0;

	public static void main(String[] args) {
		int resp=0;
		System.out.println("***CALCULADORA***");
		System.out.println("1-Adi��o, 2-Subtra��o, 3-Multiplica��o, 4-Divis�o, 5-Sair da calculadora");
		System.out.print("Escolha uma op��o: ");
		resp=entrada.nextInt();
		while (resp > 5 || resp < 1) {
			System.out.println("Erro na escolha da op��o, escolha novamente!");
			System.out.print("Escolha uma op��o: ");
			resp=entrada.nextInt();
		}
		System.out.println("Escolha dois valores que queira calcular, lembrando que a ordem importa para a divis�o: ");
		num1=entrada.nextDouble();
		num2=entrada.nextDouble();
		switch (resp) {
			case 1:
				adicao();
				System.out.println("Resultado da adi��o �: "+resultado);
				break;
			case 2:
				subtracao();
				System.out.println("Resultado da subtra��o �: "+resultado);
				break;
			case 3:
				multiplicacao();
				System.out.println("Resultado da multiplica��o �: "+resultado);
				break;
			case 4:
				divisao();
				System.out.println("Resultado da divis�o �: "+resultado);
				break;
			case 5:
				System.out.println("Fim calculo");
				System.exit(0);
				break;
		}

		
		
	}
	
		//procedimentos
		public static void adicao() {
			resultado=num1+num2;
		}
		public static void subtracao() {
			resultado=num1-num2;
		}
		public static void multiplicacao() {
			resultado=num1*num2;
		}
		public static void divisao() {
			resultado=num1/num2;
		}
}
