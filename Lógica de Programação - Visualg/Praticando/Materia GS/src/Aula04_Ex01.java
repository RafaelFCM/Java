import java.text.DecimalFormat;
import java.util.Scanner;

public class Aula04_Ex01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		DecimalFormat porc = new DecimalFormat ("#%");
		
		int idade=0;
		double soma15=0, soma30=0, soma45=0, soma60=0, soma61=0;
		
		for (int i=0; i<20; i++) {
			System.out.println("Qual sua idade?");
			idade = entrada.nextInt();
			
			if (idade<16) {
				soma15++;
			}else {
				if (idade<31) {
					soma30++;
				}else {
					if (idade<46) {
						soma45++;
					}else {
						if (idade<61) {
							soma60++;
						}else {
							if (idade>60) {
								soma61++;
							}
						}
					}
				}
			}
		}
		
		System.out.println("Pessoas na 1º faixa etária: "+soma15);
		System.out.println("Pessoas na 2º faixa etária: "+soma30);
		System.out.println("Pessoas na 3º faixa etária: "+soma45);
		System.out.println("Pessoas na 4º faixa etária: "+soma60);
		System.out.println("Pessoas na 5º faixa etária: "+soma61);
		System.out.println("Porcentagem pessoas na 1º faixa comparados com o todo: "+porc.format(soma15/4));
	}

}
