import java.text.DecimalFormat;
import java.util.Scanner;

public class CorrecaoEx12 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		DecimalFormat formataPorc = new DecimalFormat ("###0.00");
		
		
		double total1=0, total2=0, total3=0, total4=0, total5=0;
		double valorPar1=0, valorPar2=0, valorPar3=0, valorPar4=0, valorPar5=0;
		int divida=0; 

		System.out.println("Valor da dívida: ");
		divida = entrada.nextInt();
		
		total1=divida;
		total2=divida*1.10;
		total3=divida*1.15;
		total4=divida*1.20;
		total5=divida*1.25;
		
		valorPar1=total1;
		valorPar2=total2/3;
		valorPar3=total3/6;
		valorPar4=total4/9;
		valorPar5=total5/12;		
		
		System.out.println("Valor inicial da dívida: "+divida);
		System.out.println("Total:"+total1+" Juros:0"+" Parcelas:1"+" Valor parcela:"+valorPar1);
		System.out.println("Total:"+total2+" Juros:10"+" Parcelas:3"+" Valor parcela:"+valorPar2);
		System.out.println("Total:"+total3+" Juros:15"+" Parcelas:6"+" Valor parcela:"+valorPar3);
		System.out.println("Total:"+total4+" Juros:20"+" Parcelas:9"+" Valor parcela:"+valorPar4);
		System.out.println("Total:"+total5+" Juros:25"+" Parcelas:12"+" Valor parcela:"+valorPar5);
	}

}
