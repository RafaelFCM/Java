package repeticao;
import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio07 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		DecimalFormat formataPorc = new DecimalFormat ("#%");
		
		int id=0, pessoas=0, somaid=0, somaA=0, somaB=0, somaC=0, somaD=0, somaE=0;
		char op;
		double media=0, percA=0, percB=0, percC=0, percD=0, percE=0;

	System.out.println("Sua idade:");
	id=entrada.nextInt();
		
	while (id!=0) {
		System.out.println("Opinião sobre o filme:");
		System.out.println("A-Otimo, B-Bom, C-Regular, D-Ruim, E-Pessimo");
		System.out.println("Sua opinião:");
		op=entrada.next().toUpperCase().charAt(0);
			while (op!='A' && op!='B' && op!='C' && op!='D' && op!='E') {
				System.out.println("Letra invalida, digite novamente:");
				op=entrada.next().toUpperCase().charAt(0);
		}
		pessoas++; 
		somaid+=id;
		
		switch (op) {
		case 'A':
			somaA++;
		break;
		case 'B':
			somaB++;
		break;
		case 'C':
			somaC++;
		break;
		case 'D':
			somaD++;
		break;
		case 'E':
			somaE++;
		break;
		}
		System.out.println("Para finalizar a pesquisa digite zero");
		System.out.println("Sua idade:");
		id=entrada.nextInt();
	
	}	
	
	media=somaid/pessoas;
	percA=(double)somaA/pessoas;
	percB=(double)somaB/pessoas;
	percC=(double)somaC/pessoas;
	percD=(double)somaD/pessoas;
	percE=(double)somaE/pessoas;
	
	System.out.println("Quantidade de pessoas que respondeu a pesquisa:"+pessoas);
	System.out.println("Média de idade das pessoas:"+media);
	System.out.println("Porcentagem de respostas A:"+percA);
	System.out.println("Porcentagem de respostas B:"+percB);
	System.out.println("Porcentagem de respostas C:"+percC);
	System.out.println("Porcentagem de respostas D:"+percD);
	System.out.println("Porcentagem de respostas E:"+percE);
		
		
	}
}
