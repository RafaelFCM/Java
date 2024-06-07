package metodos;

import java.util.Scanner;

public class Explicacao5 {
	static Scanner entrada = new Scanner (System.in);
	static double num1=0, num2=0, media=0;
	//variavel global, por isso fica azul

	public static void main(String[] args) {
		System.out.print("Nota 1: ");
		num1=entrada.nextDouble();
		System.out.print("Nota 2: ");
		num2=entrada.nextDouble();
		media = media(num1, num2);
		//é bom colocar algo recebendo o return, colocar mesmo nome pra não se perder
		System.out.println("Resultado: "+media);

		
		
	}
	
		//função = devolve/retorna informações
	    //retorna uma coisa/variavel só por vez
		public static double media(double num1, double num2){
			media=(num1+num2)/2;			
			verifica(media);
			return media;
			
			
		}
		
		public static void verifica(double media){
			if (media>=6) {
				System.out.println("Aprovado");
			}else {
				System.out.println("Reprovado");
			}
		}
}

