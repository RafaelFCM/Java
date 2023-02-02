package repeticao;
import java.text.DecimalFormat;
import java.util.Scanner;

public class exercicio02 {

	public static void main(String[] args) {
	
		Scanner entrada = new Scanner (System.in);
		DecimalFormat formataPorc = new DecimalFormat ("#%");
	
		
		int voto=0, contador=0, cand1=0, cand2=0, cand3=0, cand4=0, cand5=0, cand6=0;
		double porcBranco=0, porcNulo=0;
	
	System.out.println("Digite o voto:");
	voto = entrada.nextInt();
	
	while (contador != 10) {
			

		
		switch (voto) {
		case 1:
			cand1++;
		break;
		case 2:
			cand2++;
		break;
		case 3:
			cand3++;
		break;
		case 4:
			cand4++;
		break;
		case 5:
			cand5++;
		break;
		case 6:
			cand6++;
		break;
		default:
			contador--;
			System.out.println("Opção inválida");
			voto = entrada.nextInt();
		}
	
	
	contador++;
	
	System.out.println("Digite o voto:");
	voto = entrada.nextInt();
	
	}
	
	porcBranco=(double)cand6/contador;
	porcNulo=(double)cand5/contador;
	
	System.out.println("Candidato 1:"+cand1);
	System.out.println("Candidato 2:"+cand2);
	System.out.println("Candidato 3:"+cand3);
	System.out.println("Candidato 4:"+cand4);
	System.out.println("Voto nulo:"+cand5);
	System.out.println("Voto branco:"+cand6);
	System.out.println("Porcentagem votos brancos:"+porcBranco);
	System.out.println("Porcentagem votos nulos:"+porcNulo);
	
	System.out.println();
	System.out.println();
	
	}
}
