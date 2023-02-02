package metodos;

import java.util.Scanner;

public class Explicacao4 {
	static Scanner entrada = new Scanner (System.in);
	static int num1=0, num2=0, resultado=0;
	//variavel global, por isso fica azul

	public static void main(String[] args) {
		System.out.println("Escolha dois valores que queira somar: ");
		num1=entrada.nextInt();
		num2=entrada.nextInt();
		resultado = soma(num1, num2);
		//é bom colocar algo recebendo o return, colocar mesmo nome pra não se perder
		System.out.println("Resultado: "+resultado);

		
		
	}
	
		//função = devolve/retorna informações
	    //retorna uma coisa/variavel só por vez
		public static int soma(int num1, int num2){
			resultado=num1+num2;
			return resultado;
		}
}

