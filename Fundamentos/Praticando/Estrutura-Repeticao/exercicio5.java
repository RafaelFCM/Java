package repeticao;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio5 {
	

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		DecimalFormat formataPorc = new DecimalFormat ("#%");

		int numeroAleatorio=0, contador=0, maior=0, menor=0;
		
		while (contador<10) {
			System.out.println("Digite um numero:");
			numeroAleatorio=entrada.nextInt();
		   
			if (contador==0) {
				menor = numeroAleatorio;
				maior = numeroAleatorio;
			}
			
		    if (maior < numeroAleatorio) {
				maior = numeroAleatorio;
			}
		   
		   
		    if (menor > numeroAleatorio) {
			   menor = numeroAleatorio;
			  
			}
		    
		    contador++;
		}
		
		System.out.println("Maior numero é: "+maior);
		System.out.println("Menor numero é: "+menor);
		
	}
		
		 
}

