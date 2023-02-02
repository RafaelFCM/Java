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
			
		System.out.println("N�mero de crian�as nascidas no per�odo:");
		numCrianca=entrada.nextInt();
		
		while (cont<numCrianca); {
			System.out.println("Sexo (M ou F):");
			sexo=entrada.next().toUpperCase().charAt(0);
			System.out.println("Tempo de vida de cada crian�a nascida:");
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
	
	
		System.out.println("Porcentagem de crian�as do sexo feminino mortas no per�odo:"+percF);
		System.out.println("Porcentagem de crian�as do sexo masculino mortas no per�odo:"+percM);
		System.out.println("Porcentagem de crian�as que viveram 24 meses ou menos no per�odo:"+percT);
	
	}
		
}
