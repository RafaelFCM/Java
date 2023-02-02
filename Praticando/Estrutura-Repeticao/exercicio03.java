package repeticao;
import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio03 {

	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		DecimalFormat formataPorc = new DecimalFormat ("#%");
	
		
		int canal=0, numero=0, totalNum=0, cont4=0, cont5=0, cont7=0, cont12=0;
		double percCont4, percCont5, percCont7, percCont12;
		

		System.out.println("Digite o numero do canal:");
		canal = entrada.nextInt();
				
		
		while (canal != 0) {
			
			while (canal != 4 && canal != 5 && canal != 7 && canal != 12) {
				System.out.println("Digite o número do canal corretamente");
				canal = entrada.nextInt();
			}
			
			switch (canal) {
			case 4:
				System.out.println("Digite o número de pessoas:");
				numero = entrada.nextInt();
				cont4+=numero;
			break;
			case 5:
				System.out.println("Digite o número de pessoas:");
				numero = entrada.nextInt();
				cont5+=numero;
			break;
			case 7:
				System.out.println("Digite o número de pessoas:");
				numero = entrada.nextInt();
				cont7+=numero;
			break;
			case 12:
				System.out.println("Digite o número de pessoas:");
				numero = entrada.nextInt();
				cont12+=numero;
			}
			
			totalNum+=numero;
			System.out.println("Digite o numero do canal:");
			canal = entrada.nextInt();
		}
		
		 percCont4=(double)cont4/totalNum;
		 percCont5=(double)cont5/totalNum;
		 percCont7=(double)cont7/totalNum;
		 percCont12=(double)cont12/totalNum;
		
		if (totalNum != 0) {
			System.out.println("Canal 4:"+percCont4);
			System.out.println("Canal 5:"+percCont5);
			System.out.println("Canal 7:"+percCont7);
			System.out.println("Canal 12:"+percCont12);
			 
		}
				
		
		
	}
}