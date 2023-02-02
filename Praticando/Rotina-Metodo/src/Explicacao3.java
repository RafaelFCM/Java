package metodos;

import java.util.Scanner;

public class Explicacao3 {
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
				adicao(num1,num2);
				System.out.println("Resultado da adi��o �: "+resultado);
				break;
			case 2:
				subtracao(num1,num2);
				System.out.println("Resultado da subtra��o �: "+resultado);
				break;
			case 3:
				multiplicacao(num1,num2);
				System.out.println("Resultado da multiplica��o �: "+resultado);
				break;
			case 4:
				divisao(num1,num2);
				System.out.println("Resultado da divis�o �: "+resultado);
				break;
			case 5:
				System.out.println("Fim calculo");
				System.exit(0);
				break;
		}

		
		
	}
	
		//parametro = mandar informa��o de um metodo pra outro
		public static void adicao(double num1, double num2) {
			resultado=num1+num2;
		}
		public static void subtracao(double num1, double num2) {
			resultado=num1-num2;
		}
		public static void multiplicacao(double num1, double num2) {
			resultado=num1*num2;
		}
		public static void divisao(double num1, double num2) {
			resultado=num1/num2;
		}
}

