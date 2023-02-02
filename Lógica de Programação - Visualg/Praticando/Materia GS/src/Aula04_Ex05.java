import java.util.Scanner;

public class Aula04_Ex05 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);

		int num=0, maior=0, menor=100000, i=0;
		
		while (i<10) {
			i++;
			System.out.print("Digite um número: ");
			num = entrada.nextInt();
			if (num>maior) {
				maior = num;
			}
			if (num<menor) {
				menor = num;
			}
		}
		
		System.out.println("Maior número digitado: "+maior);
		System.out.println("Menor número digitado: "+menor);
	}
}
