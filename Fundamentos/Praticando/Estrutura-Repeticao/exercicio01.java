package repeticao;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Scanner;
public class exercicio01 {

		public static void main(String[] args) {
		
			Scanner entrada = new Scanner (System.in);
			DecimalFormat formataPorc = new DecimalFormat ("#%");
			//se usar decimal format e a resposta for em inteiro precisa multiplicar por 100
			
			
			int idade=0, tot1=0, tot2=0, tot3=0, tot4=0, tot5=0;
			double porc1=0;
			
			
			
		for (int contador=0; contador<10; contador++) {
		System.out.println("Digite a idade:");
		idade=entrada.nextInt();
					
		    if (idade<15) {
		    	tot1++;
		    } else {
		    	if (idade>=16 && idade<=30) {
			    	tot2++;
		    	} else {
		    		if (idade>=31 && idade<=45) {
			    	tot3++;
		    		} else {
		    			if (idade>=46 && idade<=60) {
			    	tot4++;
		    			} else {
		    				tot5++;
		    			}
		    		}
		    	}
		    }

		}
	
			
		System.out.println("1� faixa et�ria:"+tot1);
		System.out.println("2� faixa et�ria:"+tot2);
		System.out.println("3� faixa et�ria:"+tot3);
		System.out.println("4� faixa et�ria:"+tot4);
		System.out.println("5� faixa et�ria:"+tot5);
		
		porc1=(double)tot1/10;
	
		System.out.println("Porcentagem da 1� faixa et�ria:"+porc1);
	
	}
}
