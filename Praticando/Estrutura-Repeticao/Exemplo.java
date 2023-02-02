import java.util.Scanner;
//control + shift + letra o = import

public class Exemplo {

	public static void main(String[] args) {
		
		//Entrada de dados
		Scanner entrada = new Scanner (System.in);
		
		//Declarar variaveis
		int idade=0, contador=0, cont50=0, contAlt=0; //sempre que criar zerar a variavel, não esquecer do ;
		double peso=0, altura=0, somaAltura=0;
		//idade = variavel, entrada = classe, next int = tipo de variavel
		
		while (contador<4) {
			
			contador++; //++ = atribuiçao mais 1
			System.out.println(contador+"º pessoa"); //não usa virgula pra separar coisas, usa +
			System.out.println("Digite a idade:"); //sysout + control + espaço = system.out.println
			idade=entrada.nextInt();
			System.out.println("Digite a altura:"); //sysout = escreva no visualg
			altura=entrada.nextDouble();
			System.out.println("Digite o peso:"); //ln no sysout = escreval, pula linha
			peso=entrada.nextDouble();	
			
			if (idade>50) {
				cont50++;		
			}
			
			if (idade>10 && idade<20) { //&& = e no visualg
				contAlt++;
				somaAltura+=altura; //somaAltura <- somaAltura + altura no visualg
			}
			
			
		} //fechando o while
		//Saida dos dados
		System.out.println("Quantidade de pessoas mais de 50 anos:"+cont50);
		System.out.println("Média das alturas:"+somaAltura/contAlt);
		
	}

}
