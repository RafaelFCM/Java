import java.util.Scanner;

public class Aula03_Ex01 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int peso=0;
		double imc=0, altura=0;
		String clas;
		
		System.out.println("Qual o seu peso em kg?");
		peso = entrada.nextInt();
		
		System.out.println("Qual a sua altura em metros?");
		altura = entrada.nextDouble();
		
		imc = peso/(altura*altura);
		
		if (imc<18.5) {
			clas = "Baixo Peso";
		}else{
			if (imc<24.9) {
				clas = "Peso Normal";
			}else{
				if (imc<29.9) {
					clas = "Pré-obesidade";
				}else {
					if (imc<34.9) {
						clas = "Obesidade Grau I";
					}else {
						if (imc<39.9) {
							clas = "Obesidade Grau II";
						}else {
							if (imc>40) {
								clas = "Obesidade Grau III";
							}
						}
					}
				}
			}
		}
		
		System.out.println("Seu IMC é:"+imc);
		//System.out.println("Sua classificação:"+clas);
	}

}
