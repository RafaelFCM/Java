package repeticao;
import java.text.DecimalFormat;
import java.util.Scanner;

public class exercico06 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
		DecimalFormat formataPorc = new DecimalFormat ("#%");
		
		int numCrianca=0, tempoVida=0, cont=0, criancaF=0, criancaM=0, tempo=0;
		char sexo;
		double percF=0, percM=0, percT=0;
	
		System.out.println("PESQUISA MORTALIDADE INFANTIL");	
			
		System.out.println("Número de crianças nascidas no período:");
		numCrianca=entrada.nextInt();
		
		while (cont<numCrianca); {
			System.out.println("Sexo (M ou F):");
			sexo=entrada.next().toUpperCase().charAt(0);
			System.out.println("Tempo de vida de cada criança nascida:");
			tempoVida=entrada.nextInt();
			
			if (sexo=='F') {
				criancaF++;
			}
			
			if (sexo=='M') {
				criancaM++;
			}
			
			if (tempoVida<25) {
				tempo++;
			}	
		
		cont++;		
				
		}
			 	
		percF=(double)criancaF/numCrianca;
		percM=(double)criancaM/numCrianca;
		percT=(double)tempo/numCrianca;	
	
	
		System.out.println("Porcentagem de crianças do sexo feminino mortas no período:"+percF);
		System.out.println("Porcentagem de crianças do sexo masculino mortas no período:"+percM);
		System.out.println("Porcentagem de crianças que viveram 24 meses ou menos no período:"+percT);
	
	}
		
}
