package repeticao105vez;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ex11 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		DecimalFormat formataPorc = new DecimalFormat ("###0.00");
		
		double valorVista=0, valorPar6=0, valorPar12=0, valorPar18=0, valorPar24=0, valorPar30=0, valorPar36=0, valorPar42=0, valorPar48=0;
		double valorPar54, valorPar60, parcela6=0, parcela12=0, parcela18=0, parcela24=0, parcela30=0, parcela36=0, parcela42=0, parcela48=0;
		int pt=0;
		double parcela54=0, parcela60=0;
		
		System.out.println("Qual o valor do carro: ");
		pt=entrada.nextInt();
				
		valorVista=pt*0.8;
		valorPar6=pt*=1.03;
		valorPar12=pt*1.06;
		valorPar18=pt*1.09;
		valorPar24=pt*1.12;
		valorPar30=pt*1.15;
		valorPar36=pt*1.18;
		valorPar42=pt*1.21;
		valorPar48=pt*1.24;
		valorPar54=pt*1.27;
		valorPar60=pt*1.30;
		
		parcela6=valorPar6/6;
		parcela12=valorPar12/12;
		parcela18=valorPar18/18;
		parcela24=valorPar24/24;
		parcela30=valorPar30/30;
		parcela36=valorPar36/36;
		parcela42=valorPar42/42;
		parcela48=valorPar48/48;
		parcela54=valorPar54/54;
		parcela60=valorPar60/60;
		
		System.out.println("Preço final a vista: "+valorVista);
		System.out.println("Preço final parcelado em 6x é "+valorPar6+" com parcelas de "+parcela6);
		System.out.println("Preço final parcelado em 12x é "+valorPar12+" com parcelas de "+parcela12);
		System.out.println("Preço final parcelado em 18x é "+valorPar18+" com parcelas de "+parcela18);
		System.out.println("Preço final parcelado em 24x é "+valorPar24+" com parcelas de "+parcela24);
		System.out.println("Preço final parcelado em 30x é "+valorPar30+" com parcelas de "+parcela30);
		System.out.println("Preço final parcelado em 36x é "+valorPar36+" com parcelas de "+parcela36);
		System.out.println("Preço final parcelado em 42x é "+valorPar42+" com parcelas de "+parcela42);
		System.out.println("Preço final parcelado em 48x é "+valorPar48+" com parcelas de "+parcela48);
		System.out.println("Preço final parcelado em 54x é "+valorPar54+" com parcelas de "+parcela54);
		System.out.println("Preço final parcelado em 60x é "+valorPar60+" com parcelas de "+parcela60);
	 
		
		
	}
}
