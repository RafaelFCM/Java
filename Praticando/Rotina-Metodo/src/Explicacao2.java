package metodos;

import java.util.Scanner;

public class Explicacao2 {
	static Scanner entrada = new Scanner (System.in);
	static double num1=0, num2=0, resultado=0;

	public static void main(String[] args) {
		int resp=0;
		System.out.println("***CALCULADORA***");
		System.out.println("1-Adição, 2-Subtração, 3-Multiplicação, 4-Divisão, 5-Sair da calculadora");
		System.out.print("Escolha uma opção: ");
		resp=entrada.nextInt();
		while (resp > 5 || resp < 1) {
			System.out.println("Erro na escolha da opção, escolha novamente!");
			System.out.print("Escolha uma opção: ");
			resp=entrada.nextInt();
		}
		System.out.println("Escolha dois valores que queira calcular, lembrando que a ordem importa para a divisão: ");
		num1=entrada.nextDouble();
		num2=entrada.nextDouble();
		switch (resp) {
			case 1:
				adicao();
				System.out.println("Resultado da adição é: "+resultado);
				break;
			case 2:
				subtracao();
				System.out.println("Resultado da subtração é: "+resultado);
				break;
			case 3:
				multiplicacao();
				System.out.println("Resultado da multiplicação é: "+resultado);
				break;
			case 4:
				divisao();
				System.out.println("Resultado da divisão é: "+resultado);
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
