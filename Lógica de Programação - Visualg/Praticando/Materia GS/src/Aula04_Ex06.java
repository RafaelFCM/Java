import java.text.DecimalFormat;
import java.util.Scanner;

public class Aula04_Ex06 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		DecimalFormat porc = new DecimalFormat ("#%");

		int num=0, tempo=0, somaM=0, somaF=0, somaTempo=0;
		char sexo;
		double porcM=0, porcF=0, porcTempo=0;
		
		System.out.println("Quantas crian�as nasceram no per�odo?");
		num = entrada.nextInt();
		
		for (int i=0; i<num; i++) {
			System.out.print("Quantos meses de vida?");
			tempo = entrada.nextInt();
			System.out.print("Qual o sexo? (M-Macho ou F-Femea)");
			sexo = entrada.next().toUpperCase().charAt(0);
			
			if (sexo=='M') {
				somaM++;
			}
			if (sexo=='F') {
				somaF++;
			}
			if (tempo<25) {
				somaTempo++;
			}
		}
		
		porcM=(double)somaM/num;
		porcF=(double)somaF/num;
		porcTempo=(double)somaTempo/num;
		
		System.out.print("Porcentagem de crian�as do sexo feminino mortas no per�odo: "+porcF);
		System.out.println();
		System.out.print("Porcentagem de crian�as do sexo masculino mortas no per�odo: "+porcM);
		System.out.println();
		System.out.print("Porcentagem de crian�as que viveram 24 meses ou menos no per�odo: "+porcTempo);
	}
}
