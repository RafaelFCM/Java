package repeticao;	
import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio08 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		DecimalFormat formataPorc = new DecimalFormat ("#%");
	
		double prova=0, media=0, somaProva=0;
		int presenca=0, numMatric=0, aprovados=0, reprovados=0, reprovadosFreq=0;
		
		for (int contador=0; contador<10; contador++) {
			System.out.println("Número da matrícula:");
			numMatric=entrada.nextInt();
			
			for (int i=0; i<3; i++) {
				System.out.println("Nota da prova:");
				prova=entrada.nextInt();
				somaProva+=prova;
			}
			
			System.out.println("Frequencia presença na aula:");
			presenca=entrada.nextInt();
					
			media=somaProva/3;
			
			System.out.println("Número da matrícula:"+numMatric);
			System.out.println("Nota final:"+media);
			if (presenca>39 && media>=6) {
				System.out.println("APROVADO");
				aprovados++;
			} else {
				if (presenca<40 || media>=6) {
					System.out.println("REPROVADO");
					reprovados++;
			}
				
			}
				
			if (presenca<40) {
				reprovadosFreq++;
			}
			
		}
		
		System.out.println("Total de alunos aprovados:"+aprovados);
		System.out.println("Total de alunos reprovados:"+reprovados);
		System.out.println("Total de alunos reprovados por frequência abaixo da mínima necessária:"+reprovadosFreq);
				
		
	}	
}
