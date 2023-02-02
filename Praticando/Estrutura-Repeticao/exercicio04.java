package repeticao;
import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio04 {


	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		DecimalFormat formataPorc = new DecimalFormat ("#%");
	
		char corOlho, corCabelo;
		int idade=0, somaIdade=0, quant50=0, quantIdade=0, quantAzul=0, quantRuiva=0;
		double peso=0, altura=0, porcAzul=0;
		
		for (int contador=0; contador<10; contador++) {
			System.out.println("Digite sua idade:");
			idade=entrada.nextInt();
			System.out.println("Digite sua altura:");
			altura=entrada.nextDouble();
			System.out.println("Digite seu peso:");
			peso=entrada.nextDouble();
		
			System.out.println("Digite a cor dos seus olhos:");
			corOlho=entrada.next().toUpperCase().charAt(0);
			
			while (corOlho != 'A' && corOlho != 'P' && corOlho != 'V' && corOlho != 'C') {
				System.out.println("Digite a cor dos seus olhos corretamente:");
				corOlho=entrada.next().toUpperCase().charAt(0);
			}
			
			System.out.println("Digite a cor dos seus cabelos:");
			corCabelo=entrada.next().toUpperCase().charAt(0);
			
			while (corCabelo != 'P' && corCabelo != 'C' && corCabelo != 'L' && corCabelo != 'R') {
				System.out.println("Digite a cor dos seus cabelos corretamente:");
				corCabelo=entrada.next().toUpperCase().charAt(0);	
			}
			
			if (idade>50 && peso<60) {
				quant50++;
			}
			
					
			if (altura<1.50) {
				quantIdade+=altura;
				somaIdade+=idade;
			}
			
			
			if (corOlho=='A') {
				quantAzul++;
			}
			//sendo char são aspas simples, string são aspas duplas
			
					
			if (corCabelo=='R' && corOlho!='A') {
				quantRuiva++;
			}		
					
				
		}
		
		
		System.out.println("A quantidade pessoas com idade maior que 50 e peso menor que 60"+quant50);
		
		if (quantIdade != 0) {
			System.out.println("A média das idades das pessoas com altura inferior a 1,50:"+somaIdade/quantIdade);
		} else {
			System.out.println("A média das idades das pessoas com altura inferior a 1,50: 0");
		}
		
		porcAzul=(double)quantAzul/10;
		
		System.out.println("A porcentagem de pessoas com olhos azuis entre todas as pessoas analisadas"+porcAzul);
		System.out.println("A quantidade pessoas ruivas e que não possuem olhos azuis"+quantRuiva);

		
	}
}